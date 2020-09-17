package com.company.chapter17containerdetails.examples.ex018listperformance;

public abstract class Test<C> {
    String name;

    public Test(String name) {
        this.name = name;
    }

    public abstract int test(C container, TestParam tp);
}
