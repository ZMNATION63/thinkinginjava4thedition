package com.company.chapter08polymorphism.examples.e11nasledovaniepriprotektirovanii;

public class Stage {
    private Actor actor = new HappyActor();

    public void change() {
        actor = new SadActor();
    }

    public void performPlay() {
        actor.act();
    }

}
