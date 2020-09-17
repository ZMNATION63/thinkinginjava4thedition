package com.company.chapter20annotations.examples.ex02simulatingnull;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Компилятор ревностно следит за значениями элементов по умолчанию. Ни один элемент не может иметь
 * неопределенного значения. Это означает, что либо элемент должен иметь значение по умолчанию,
 * либо значения должны предоставляться классом, который использует аннотацию.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SimulatingNull {
    public int id() default -1;

    public String description() default "";
}