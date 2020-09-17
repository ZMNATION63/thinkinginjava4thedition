package com.company.chapter06accesscontrol.examples.e10dostupkklassamtask8.soups;

// Спецификаторы доступа для классов.
// Использование конструкторов, объявленных private,
// делает класс недоступным при создании объектов.
public class Soup1 {
    private static int countSoup = 0;

    private Soup1() {
        System.out.println("Возвращаем объект Soup1");
    }

    // (1) Разрешаем создание объектов в статическом методе:
    public static Soup1 makeSoup() {

        return new Soup1();

    }

}
