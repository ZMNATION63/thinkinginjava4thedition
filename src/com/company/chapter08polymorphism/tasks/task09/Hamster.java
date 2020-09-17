package com.company.chapter08polymorphism.tasks.task09;

public class Hamster extends Rodent {
    @Override
    protected void say() {
        System.out.println("Hamster say - MNUM NUM NUM NUM");
    }

    @Override
    protected void move() {
        System.out.println("Lazy HAMSTER have seated on his ass:)");
    }


}
