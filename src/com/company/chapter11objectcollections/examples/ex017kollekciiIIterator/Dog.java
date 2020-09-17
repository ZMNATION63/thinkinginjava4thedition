package com.company.chapter11objectcollections.examples.ex017kollekciiIIterator;

public class Dog extends Pet {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name) {
        this.name = name;
    }
}
