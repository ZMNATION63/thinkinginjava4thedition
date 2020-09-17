package com.company.chapter08polymorphism.examples.e04rasshiriaemost;

import static com.company.chapter08polymorphism.examples.e04rasshiriaemost.Music3.tuneAll;

/**
 * оперируя только с интерфейсом базового класса. Такая программа является расширяемой,
 * поскольку в нее можно добавить дополнительную
 * функциональность, определяя новые типы данных от общего базового класса. Методы,
 * работающие на уровне интерфейса базового класса, совсем не нужно изменять, чтобы
 * приспособить их к новым классам
 * 6. ( 1) Измените программу Music3.java так, чтобы метод what() стал методом корневого
 * KnaccaObject t o S t r i n g ( ). Попробуйте вывести информацию об объектах I n s tru m e n t
 * вызовом S y s te m . o u t . p r i n t l n ( ) (без использования преобразований).
 */
class Scratch_1 {
    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                //new Woodwind()
        };

        Instrument i = new Wind();
//        Wind a = (Wind) i;
        tuneAll(orchestra);
    }
}