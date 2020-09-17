package com.company.chapter11objectcollections.examples.ex014mapoflist;

public class Mutt extends Dog {
    public Mutt(String name) {
        super(name);
    }

    private String name;

    public Mutt(String name, String name1) {
        super(name);
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
