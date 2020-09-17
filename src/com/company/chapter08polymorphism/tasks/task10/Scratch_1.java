package com.company.chapter08polymorphism.tasks.task10;

/**
 * 10. (3) Создайте базовый класс с двумя методами.
 * В первом методе вызовите второй метод.
 * Определите производный класс и переопределите второй метод.
 * Создайте объект производного класса, выполните восходящее преобразование к базовому
 * типу и вызовите первый метод.
 * Объясните результат.
 */
class Scratch_1 {
    public static void main(String[] args) {
        Food food = new Soup();
        Soup soup = new Soup();

        food.make();
        soup.make();

        soup.testPrivate();
        //food.testPrivate();
    }
}