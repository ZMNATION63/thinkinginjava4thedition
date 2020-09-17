package com.company.chapter08polymorphism.examples.e02poteryatipaobyekta;

class Cycle {
    private String name = "Cycle";
    private int wheels = 0;

    public static void travel(Cycle c) {
        System.out.println("Cycle.ride() " + c);
    }

    public int wheels() {
        return wheels;
    }

    public String toString() {
        return this.name;
    }
}
