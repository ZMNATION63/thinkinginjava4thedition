package com.company.chapter08polymorphism.examples.e05problemapolyaistaticmethods;

public class Sub extends Super {
    public int field = 1;

    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}
