package com.company.chapter15generictypes.examples.ex04randomlist;

import com.company.chapter15generictypes.examples.ex01automobile.Automobile;

import java.util.ArrayList;
import java.util.Random;

/**
 * 6. (1) Используйте RandomList ещесдвумя типами (кроме представленного в main()).
 *
 * @param <T>
 */
public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<String>();
        for (String s : ("The quick brown fox jumped over " +
                "the lazy brown dog").split(" "))
            rs.add(s);
        for (int i = 0; i < 11; i++)
            System.out.print(rs.select() + " ");

        System.out.println("");

        RandomList<Integer> rInt = new RandomList<>();
        Random randNumber = new Random();
        for (int i = 0; i < 50; i++) {
            rInt.add(i + 1);
        }
        for (int i = 0; i < 50; i++) {
            System.out.print(rInt.select() + " ");
        }

        System.out.println("");
        RandomList<Automobile> automobileRandomList = new RandomList<>();
        for (int i = 0; i < 10; i++) {
            automobileRandomList.add(new Automobile());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(automobileRandomList.select());
        }

    }
}
