package com.company.chapter08polymorphism.examples.e02poteryatipaobyekta;

class Bicycle extends Cycle {
    private String name = "Bicycle";
    private int wheels = 2;

    @Override
    public int wheels() {
        return wheels;
    }

    public String toString() {
        return this.name;
    }

}