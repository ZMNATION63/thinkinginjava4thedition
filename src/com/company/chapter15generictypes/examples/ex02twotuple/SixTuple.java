package com.company.chapter15generictypes.examples.ex02twotuple;

public class SixTuple<A, B, C, D, E, G> extends FiveTuple<A, B, C, D, E> {
    public final G six;

    public SixTuple(A a, B b, C c, D d, E e, G six) {
        super(a, b, c, d, e);
        this.six = six;
    }

    public String toString() {
        return "(" + first + "," + second + ", " +
                third + ", " + fourth + ", " + fifth + ", " + six + ")";
    }
}
