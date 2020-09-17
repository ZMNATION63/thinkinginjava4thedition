package com.company.chapter08polymorphism.tasks.task10;

public class Soup extends Food {
    @Override
    public void make() {
        System.out.println("Soup.make()");
    }

    void testPrivate() { //Проблема: «переопределение» закрытых методов
        System.out.println("Private Soup.testPrivate");
    }
}
