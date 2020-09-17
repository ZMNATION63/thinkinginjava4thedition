package com.company.chapter11objectcollections.examples.ex017kollekciiIIterator;

public class Rat extends Pet {
    private String name;

    public Rat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
