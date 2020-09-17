package com.company.chapter06accesscontrol.examples.e10dostupkklassamtask8.soups;


public class Soup2 {
    private Soup2() {
    }

    // (2) Создаем один статический объект
    // и по требованию возвращаем ссылку на него,
    private static Soup2 psl = new Soup2();


    public static Soup2 access() {

        return psl;

    }

    public void f() {
    }
}
