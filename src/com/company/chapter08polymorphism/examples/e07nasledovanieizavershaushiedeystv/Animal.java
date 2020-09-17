package com.company.chapter08polymorphism.examples.e07nasledovanieizavershaushiedeystv;

public class Animal extends LivingCreature {
    private Characteristic p =
            new Characteristic("Имеет сердце");
    private Description t =
            new Description("животное, нерастение");

    Animal() {
        System.out.println("Animal()");
    }

    protected void dispose() {
        System.out.println("dispose() в Animal");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
