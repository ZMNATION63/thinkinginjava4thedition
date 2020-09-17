package com.company.chapter08polymorphism.examples.e07nasledovanieizavershaushiedeystv;

public class Frog extends Amphibian {
    private Characteristic p = new Characteristic("Квакает");
    private Description t = new Description("Ест жуков");

    public Frog() {
        System.out.println("Frog()");
    }

    public Frog(Description description) {
        System.out.println("Frog()");
        this.t = description;
        this.t.addRef();
        System.out.println("Description = " + this.t.getCounter());
    }

    protected void dispose() {
        System.out.println("Завершение Frog");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
