package com.sh3.java.repo.aop.auditlog;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

/**
 * @author MSA
 * @version 1.0
 */

@Aspect
@Component
public class AspectLogger {
	private static final Logger logger = LoggerFactory.getLogger(AspectLogger.class);

	@Around("execution(* com.sh3.java.repo.aop.service.UserService.find*(String, int)) and args(name, age) && @annotation(com.sh3.java.repo.aop.auditlog.annotation.Logging)")
	public Object aroundActivityLogByParams(ProceedingJoinPoint call, String name, int age) throws Throwable {
		StopWatch clock = new StopWatch("Profiling for '" + name + "' and '" + age + "'");

		try {
			clock.start(call.toShortString());
			return call.proceed();
		} finally {
			clock.stop();
			logger.info(clock.prettyPrint());
		}
	}
	
	@Around("execution(* com.sh3.java.repo.aop.service.UserService.find*(String)) and args(username) && @annotation(com.sh3.java.repo.aop.auditlog.annotation.Logging)")
	public Object aroundActivityLogByParams(ProceedingJoinPoint call, String username) throws Throwable {
		StopWatch clock = new StopWatch("Profiling for '" + username +"'");

		try {
			clock.start(call.toShortString());
			return call.proceed();
		} finally {
			clock.stop();
			logger.info(clock.prettyPrint());
		}
	}
}