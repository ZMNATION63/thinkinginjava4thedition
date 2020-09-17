package com.company.chapter14typeinformation.examples.ex01shapes;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}