package com.company.chapter11objectcollections.examples.ex017kollekciiIIterator;

public class Pug extends Pet {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Pug(String name) {
        this.name = name;
    }
}
