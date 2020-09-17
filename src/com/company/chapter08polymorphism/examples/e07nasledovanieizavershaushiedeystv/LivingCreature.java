package com.company.chapter08polymorphism.examples.e07nasledovanieizavershaushiedeystv;

public class LivingCreature {

    private Characteristic p =
            new Characteristic("Живое существо существо");
    private Description t =
            new Description("обычное живое существо");

    LivingCreature() {
        System.out.println("LivingCreature()");
    }

    protected void dispose() {
        System.out.println("dispose() в LivingCreature");
        t.dispose();
        p.dispose();
    }
}
