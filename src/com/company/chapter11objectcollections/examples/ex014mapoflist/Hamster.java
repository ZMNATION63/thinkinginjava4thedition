package com.company.chapter11objectcollections.examples.ex014mapoflist;

public class Hamster extends Pet {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    Hamster(String name) {
        this.name = name;
    }
}
