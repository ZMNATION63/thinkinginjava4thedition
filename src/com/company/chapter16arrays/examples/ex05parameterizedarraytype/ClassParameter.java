package com.company.chapter16arrays.examples.ex05parameterizedarraytype;

public class ClassParameter<T> {
    public T[] f(T[] arg) {
        return arg;
    }
}
