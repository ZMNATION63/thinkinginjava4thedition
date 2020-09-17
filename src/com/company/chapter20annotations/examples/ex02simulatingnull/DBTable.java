package com.company.chapter20annotations.examples.ex02simulatingnull;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)//Appliestoclassesonly
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
    public String name() default "";
}
