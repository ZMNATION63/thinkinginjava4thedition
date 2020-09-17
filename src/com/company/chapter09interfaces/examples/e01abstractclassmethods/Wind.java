package com.company.chapter09interfaces.examples.e01abstractclassmethods;

public class Wind extends Instrument {
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    public String what() {
        return "Wind";
    }

    public void adjust() {
    }
}
