package com.company.chapter11objectcollections.examples.ex11linkedlist;

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
