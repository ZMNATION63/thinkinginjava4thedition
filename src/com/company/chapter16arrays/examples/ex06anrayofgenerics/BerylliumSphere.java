package com.company.chapter16arrays.examples.ex06anrayofgenerics;

public class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}
