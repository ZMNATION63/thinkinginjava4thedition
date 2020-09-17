package com.company.chapter14typeinformation.examples.ex04classinitialization;
/**
 * Цель показать, что объект класса можно создать не обращаясь к классу на прямую, можно обратиться к
 * бинарному файлу класса по имени и получить объект, порабоать с ним
 * Что позволяет нам получить доступ к элементам класса
 * <p>
 * По сути инициализация откладывается настолько, насколько возможно.
 * Из создания ссылки initable мы видим, что простое использование синтаксиса .class для
 * получения ссылки на класс не приводит к инициализации.
 */

import java.util.Random;

class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
    static private int anInt = 11111;

    static {
        System.out.println("Инициaлизaция Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 147;

    static {
        System.out.println("Инициализация Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 74;

    static {
        System.out.println("Инициaлизaция Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws Exception {
        Class initable = Initable.class;
        System.out.println("nocne создания ссылки на Initable");
        // Не запускает процесс инициализации:
        System.out.println(Initable.staticFinal);
        // Запускает процесс инициализации:
        System.out.println(Initable.staticFinal2);
        // Запускает процесс инициализации:
        System.out.println(Initable2.staticNonFinal);

        System.out.println(initable.getDeclaredField("anInt")); //по крайней мере увидели, что доступ получен к приватному полю
        Class initable3 = Class.forName("com.company.Examples.Ex04ClassInitialization.Initable3");
        System.out.println("nocne создания ссылки на Initable3");
        System.out.println(Initable3.staticNonFinal);
    }
}
