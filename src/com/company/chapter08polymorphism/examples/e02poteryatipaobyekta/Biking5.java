package com.company.chapter08polymorphism.examples.e02poteryatipaobyekta;

public class Biking5 {
    public static void ride(Cycle c) {

        c.travel(c);
        System.out.println("wheels: " + c.wheels());
    }
}
