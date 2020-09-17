package com.company.chapter11objectcollections.examples.ex017kollekciiIIterator;

public class Cat extends Pet {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name) {
        this.name = name;
    }
}
