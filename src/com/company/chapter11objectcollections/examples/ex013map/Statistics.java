package com.company.chapter11objectcollections.examples.ex013map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * MAP хранит в себе ключи и значения, ключи не могут повторяться,
 * Именно эта особенность помогает подсчитать количество выброшенных
 * одинаковых элементов
 */
public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> m =
                new HashMap<Integer, Integer>();
        for (int i = 0; i < 10000; i++) {
// Produce a number between 0 and 20:
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }
}
