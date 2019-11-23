package com.sh3.java.repo.annotation.one;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author MSA
 * @version 1.0
 */

@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TypeHeader {
    String developer() default "Unknown";

    String lastModified();

    String[] teamMembers();

    int meaningOfLife();
}