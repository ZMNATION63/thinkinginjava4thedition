package com.company.chapter16arrays.examples.ex05parameterizedarraytype;

public class MethodParameter {
    public static <T> T[] f(T[] arg) {
        return arg;
    }
}
