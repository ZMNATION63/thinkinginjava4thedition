package com.company.chapter08polymorphism.examples.e08unicttojeniesovmispob;

public class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Создаем " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0)
            System.out.println("Disposing " + this);
    }

    public String toString() {
        return "Shared " + id;
    }

}
