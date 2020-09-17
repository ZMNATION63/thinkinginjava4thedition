package com.company.chapter15generictypes.examples.ex025classtypecapture;
/*
Как мы видели, стирание приводит к невозможности выполнения некоторых операций в обобщенном коде.
 Любые операции, требующие знания точного типа во время выполнения, работать не будут:

public class Erased<T> {
    private final int SIZE = 100;
    public static void f(Object arg) {
        if (arg instanceof T) {} // Ошибка
            T var = new T(); // Ошибка
            T[] array = new T[SIZE]; // Ошибка
            T[] array = (T) new Object[SIZE]; // Неконтролируемое предупреждение
        }
    }*/
