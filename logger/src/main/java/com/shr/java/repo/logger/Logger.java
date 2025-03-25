package com.shr.java.repo.logger;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.function.Consumer;

/**
 * @author MSA
 * @version 1.0
 */

@FunctionalInterface
public interface Logger {
    public enum LogLevel {
        INFO, DEBUG, WARNING, ERROR, FUNCTIONAL_MESSAGE, FUNCTIONAL_ERROR;

        public static LogLevel[] all() {
            return values();
        }
    }

    abstract void message(String msg, LogLevel severity);

    default Logger appendNext(Logger nextLogger) {
        return (msg, severity) -> {
            message(msg, severity);
            nextLogger.message(msg, severity);
        };
    }

    static Logger logger(LogLevel[] levels, Consumer<String> writeMessage) {
        EnumSet<LogLevel> set = EnumSet.copyOf(Arrays.asList(levels));

        return (msg, severity) -> {
            if (set.contains(severity)) {
                writeMessage.accept(msg);
            }
        };
    }

    static Logger consoleLogger(LogLevel... levels) {
        return logger(levels, msg -> System.err.println("Writing to console: " + msg));
    }

    static Logger emailLogger(LogLevel... levels) {
        return logger(levels, msg -> System.err.println("Sending via email: " + msg));
    }

    static Logger fileLogger(LogLevel... levels) {
        return logger(levels, msg -> System.err.println("Writing to Log File: " + msg));
    }

    public static void main(String[] args) {
        // Build an immutable chain of responsibility
        Logger logger = consoleLogger(LogLevel.all())
                .appendNext(emailLogger(LogLevel.FUNCTIONAL_MESSAGE, LogLevel.FUNCTIONAL_ERROR))
                .appendNext(fileLogger(LogLevel.WARNING, LogLevel.ERROR));

        // Handled by consoleLogger since the console has a loglevel of all
        logger.message("Entering function ProcessOrder().", LogLevel.DEBUG);
        logger.message("Order record retrieved.", LogLevel.INFO);

        // Handled by consoleLogger and fileLogger since filelogger implements Warning & Error
        logger.message("Customer Address details missing in Branch DataBase.", LogLevel.WARNING);
        logger.message("Customer Address details missing in Organization DataBase.", LogLevel.ERROR);

        // Handled by consoleLogger and emailLogger as it implements functional error
        logger.message("Unable to Process Order ORD1 Dated D1 For Customer C1.", LogLevel.FUNCTIONAL_ERROR);

        // Handled by consoleLogger and emailLogger
        logger.message("Order Dispatched.", LogLevel.FUNCTIONAL_MESSAGE);
    }
}