package com.company.chapter08polymorphism.examples.e07nasledovanieizavershaushiedeystv;

public class Description {
    private String s;

    private int refcount = 0;

    public static long getCounter() {
        return counter;
    }

    private static long counter = 0;
    private final long id = counter++;

    public void addRef() {

        refcount++;
        System.out.println("Description.refcount = " + this.refcount);
    }

    public Description() {

        System.out.println("Создаем " + this);
    }

    Description(String s) {
        this.s = s;
        System.out.println("Создаем MDescription" + s);
    }

    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("Disposing " + this + "counter ");
            System.out.println("Description " + this.getCounter());
            System.out.println("Завершаем MDescription" + s);
        }
    }
}
