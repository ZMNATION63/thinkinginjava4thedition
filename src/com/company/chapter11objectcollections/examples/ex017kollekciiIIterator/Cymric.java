package com.company.chapter11objectcollections.examples.ex017kollekciiIIterator;

public class Cymric extends Pet {
    private String name;

    public Cymric(String name1) {
        //super (name);
        this.name = name1;
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
