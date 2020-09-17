package com.company.chapter08polymorphism.examples.e03poluchenienujnogorezultata;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.drawQ");
    }

    @Override
    public void erase() {
        System.out.println("Square.eraseQ");
    }

}
