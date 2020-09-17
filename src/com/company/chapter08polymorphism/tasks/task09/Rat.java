package com.company.chapter08polymorphism.tasks.task09;

public class Rat extends Rodent {
    @Override
    protected void say() {
        System.out.println("Rat say - pshiii! F@*&");
    }

    @Override
    protected void move() {
        System.out.println("Rat moved to you, you'll be eaten");
    }
}
