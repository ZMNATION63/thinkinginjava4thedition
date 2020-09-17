package com.company.chapter08polymorphism.examples.e03poluchenienujnogorezultata;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    @Override
    public void methodNew() {
        System.out.println("Triangle.methodNew()");
    }

}
