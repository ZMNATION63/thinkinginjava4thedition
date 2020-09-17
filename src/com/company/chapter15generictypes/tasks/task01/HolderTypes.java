package com.company.chapter15generictypes.tasks.task01;

public class HolderTypes<T> {
    private T a1;
    private T a2;
    private T a3;

    @Override
    public String toString() {
        return "HolderTypes{" +
                "a1= " + a1 +
                ", a2= " + a2 +
                ", a3= " + a3 +
                '}';
    }

    public HolderTypes(T a1, T a2, T a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public T getA1() {
        return a1;
    }

    public void setA1(T a1) {
        this.a1 = a1;
    }

    public T getA2() {
        return a2;
    }

    public void setA2(T a2) {
        this.a2 = a2;
    }

    public T getA3() {
        return a3;
    }

    public void setA3(T a3) {
        this.a3 = a3;
    }
}
