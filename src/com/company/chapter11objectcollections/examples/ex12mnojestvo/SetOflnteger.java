package com.company.chapter11objectcollections.examples.ex12mnojestvo;//: holding/SetOfInteger.java

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * В Set добавляются десять тысяч случайных чисел от 0 до 29; понятно, что в каждое
 * значение добавляется огромное количество дубликатов. Однако мы видим,
 * что в итоговом множестве каждое значение присутствует только в одном экземпляре.
 */
class SetOflnteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<Integer>();
        for (int i = 0; i < 10000; i++)
            intset.add(rand.nextInt(30));
        System.out.println(intset);
    }
}