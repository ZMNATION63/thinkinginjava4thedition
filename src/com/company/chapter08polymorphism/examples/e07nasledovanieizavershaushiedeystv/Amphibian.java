package com.company.chapter08polymorphism.examples.e07nasledovanieizavershaushiedeystv;

public class Amphibian extends Animal {
    private Characteristic p =
            new Characteristic("MoжeT жить вводе");
    private Description t =
            new Description("nвводе,и наземле");

    Amphibian() {
        System.out.println("Amphibian()");
    }

    protected void dispose() {
        System.out.println("dispose() в Amphibian");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
