package com.company.chapter09interfaces.examples.e01abstractclassmethods;

abstract class Instrument {
    private int i; // Память выделяется для каждого объекта

    public abstract void play(Note n);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();
}
