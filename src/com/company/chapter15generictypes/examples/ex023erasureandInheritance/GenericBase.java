package com.company.chapter15generictypes.examples.ex023erasureandInheritance;

public class GenericBase<T> {
    private T element;

    public void set(T arg) {
        arg = element;
    }

    public T get() {
        return element;
    }
}
