package com.shr.java.repo.aop.util;

/**
 * @author MSA
 * @version 1.0
 */

public class AOPUtil {
    public static <T> Class<T> getClassObject(String className) throws ClassNotFoundException {
        return (Class<T>) Class.forName(className);
    }
}