package com.company.chapter11objectcollections.examples.ex017kollekciiIIterator;

public class Pet {
    private String name;
    int id;
    static int allId;

    public Pet() {
        allId++;
    }

    public Pet(String name, int id) {
        allId++;
        this.name = name;
        this.id = id;
    }

    public Pet(int id) {
        allId++;
        this.id = id;
    }

    public Pet(String name) {
        allId++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int id() {
        return id;
    }
}
