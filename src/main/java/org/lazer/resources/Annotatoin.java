package org.lazer.resources;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Annotatoin{
    String str() default "test";
    int val() default 9090;
}

