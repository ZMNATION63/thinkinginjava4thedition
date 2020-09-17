package com.company.chapter15generictypes.examples.ex02twotuple;

public class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {
    public final D fourth;

    public FourTuple(A a, B b, C с, D d) {
        super(a, b, с);
        fourth = d;
    }

    public String toString() {
        return "(" + first + ", " + second + ", " +
                third + ", " + fourth + ")";
    }
}