package com.company.chapter08polymorphism.examples.e02poteryatipaobyekta;

class Tricycle extends Cycle {
    private String name = "Tricycle";
    private int wheels = 3;

    @Override
    public int wheels() {
        return wheels;
    }


    public String toString() {
        return this.name;
    }
}