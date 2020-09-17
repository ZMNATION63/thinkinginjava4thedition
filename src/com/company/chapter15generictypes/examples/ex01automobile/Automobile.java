package com.company.chapter15generictypes.examples.ex01automobile;

public class Automobile {
    String pole;
    static int count = 0;
    static final int id = count++;

    public Automobile() {
        this.count++;
        pole = "Автомобиль №" + this.id;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                " pole= '" + pole + '\'' +
                ", id= " + id +
                '}';
    }
}
