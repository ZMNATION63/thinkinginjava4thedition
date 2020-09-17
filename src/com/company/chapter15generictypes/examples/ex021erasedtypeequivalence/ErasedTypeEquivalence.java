package com.company.chapter15generictypes.examples.ex021erasedtypeequivalence;

import java.util.ArrayList;

/**
 * Логика подсказывает, что ArrayList<String> и ArrayList<Integer> являются разными
 * типами. Разные типы ведут себя по-разному; так, при попытке поместить Integer
 * в ArrayList<String> вы получите другое поведение (ошибка), чем при помещении Integer в ArrayList<Integer> (успех).
 * И все же из приведенной программы следует, что они относятся к одному типу.Логика подсказывает,
 * что ArrayList<String> и ArrayList<Integer> являются разными
 * типами. Разные типы ведут себя по-разному; так, при попытке поместить Integer
 * в ArrayList<String> вы получите другое поведение (ошибка), чем при помещении Integer в ArrayList<Integer> (успех).
 * И все же из приведенной программы следует, что они относятся к одному типу.
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class cl = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(cl == c2);
    }
}