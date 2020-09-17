package com.company.chapter11objectcollections.examples.ex11linkedlist;

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
