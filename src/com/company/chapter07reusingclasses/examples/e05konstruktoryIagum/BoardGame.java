package com.company.chapter07reusingclasses.examples.e05konstruktoryIagum;

public class BoardGame extends Game {

    BoardGame(int i) {
        super(i);
        System.out.println("Конструктор BoardGame");
    }
}
