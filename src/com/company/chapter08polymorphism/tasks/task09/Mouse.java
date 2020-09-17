package com.company.chapter08polymorphism.tasks.task09;

public class Mouse extends Rodent {
    @Override
    protected void say() {
        System.out.println("Mouse say - mi mi mi");
    }

    @Override
    protected void move() {
        System.out.println("Mouse moved to wall");
    }
}
