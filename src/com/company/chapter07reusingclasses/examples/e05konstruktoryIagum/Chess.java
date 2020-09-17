package com.company.chapter07reusingclasses.examples.e05konstruktoryIagum;

public class Chess extends BoardGame {
    Chess(int z) {
        super(z);
        System.out.println("Конструктор Chess");
    }
}
