package com.company.chapter08polymorphism.examples.e03poluchenienujnogorezultata;

public class ClassTask extends Shape {
    @Override
    public void draw() {
        System.out.println("ClassTask.draw()");
    }

    @Override
    public void erase() {
        System.out.println("ClassTask.erase()");
    }

    @Override
    public void methodNew() {
        System.out.println("ClassTask.methodNew()");
    }
}
