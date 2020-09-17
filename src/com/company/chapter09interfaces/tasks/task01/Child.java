package com.company.chapter09interfaces.tasks.task01;

public class Child extends AbsMet {
    private int i = 123;

    @Override
    void print1() {
        System.out.println("Met child " + i);
    }
}
