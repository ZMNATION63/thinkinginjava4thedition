package com.company.chapter08polymorphism.examples.e03poluchenienujnogorezultata;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void methodNew() {
        System.out.println("Circle.methodNew()");
    }
}
