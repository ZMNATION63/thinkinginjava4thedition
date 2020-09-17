package com.company.chapter15generictypes.examples.ex027factoryconstraint;

public class Foo2<T> {
    private T x;

    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create();
    }
}
