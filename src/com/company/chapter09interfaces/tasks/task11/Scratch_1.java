package com.company.chapter09interfaces.tasks.task11;

/**
 * 11. (4) Создайте класс с методом, который получает аргумент String и переставляет
 * местами каждую пару символов в полученной строке. Адаптируйте класс так, чтобы
 * он работал с interfaceprocessor.Apply.process().
 */
class Scratch_1 {
    public static void main(String[] args) {
        ChangeStr s = new ChangeStr();
        System.out.println(s.name("Миша"));
    }
}