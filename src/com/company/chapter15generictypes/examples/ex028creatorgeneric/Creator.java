package com.company.chapter15generictypes.examples.ex028creatorgeneric;

public class Creator extends GenericWithCreate<X> {
    X create() {
        return new X();
    }

    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}

