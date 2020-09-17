package com.company.chapter15generictypes.examples.ex011genericvarargs;
//Списки аргументов переменной длины и обобщенные методы


import java.util.ArrayList;
import java.util.List;

class GenericVarargs {
    public static <T> List<T> makeList(T... args) {//упаковать можно сколь угодно много аргументов
        List<T> result = new ArrayList<T>();
        for (T item : args)
            result.add(item);
        return result;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("A", "B", "C");
        System.out.println(ls);
        ls = makeList("ABCDEFFHIJKLMNOPQRSTUVWXYZ".split(""));
        System.out.println(ls);
    }
}