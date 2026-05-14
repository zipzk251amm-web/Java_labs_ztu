package com.education.ztu;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String name() default "DefaultName";
    int value() default 0;
    String description() default "No description";
}