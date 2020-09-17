package com.company.chapter08polymorphism.examples.e06poryadokvizovakonstruktorov;

public class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();

    public Sandwich() {
        System.out.println("Sandwich()");
    }
}
