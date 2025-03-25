package com.shr.java.repo.aop.auditlog.annotation;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;

/**
 * @author MSA
 * @version 1.0
 */

@Target(value = {METHOD})
public @interface Logging {
}