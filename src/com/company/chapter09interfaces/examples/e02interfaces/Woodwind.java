package com.company.chapter09interfaces.examples.e02interfaces;

public class Woodwind extends Wind {
    public void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    public String what() {
        return "Woodwind";
    }

    @Override
    public String toString() {
        return "Woodwind ";
    }
}
