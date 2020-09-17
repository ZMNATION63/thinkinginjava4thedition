package com.company.chapter07reusingclasses.examples.e02inicialisaciyavkonstruktoreskompoztask1;

public class Soap {
    private String s;

    Soap() {
        System.out.println("Soap()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}
