package com.company.chapter07reusingclasses.examples.e11protected;

public class Villain {
    private String name;

    protected void set(String nm) {
        name = nm;
    }

    public Villain(String name) {
        this.name = name;
    }

    public String toString() {
        return "fl объект Villain и мое имя " + name;
    }
}
