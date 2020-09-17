package com.company.chapter15generictypes.tasks.task08;

public class Characters {
    private static long counter = 0;
    private final long id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
