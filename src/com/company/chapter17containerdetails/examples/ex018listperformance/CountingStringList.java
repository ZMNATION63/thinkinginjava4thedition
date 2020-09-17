package com.company.chapter17containerdetails.examples.ex018listperformance;

import com.company.chapter17containerdetails.examples.ex02collectiondatatest.Generator;
import com.company.chapter17containerdetails.examples.ex03collectiondatageneration.RandomGenerator;

import java.util.AbstractList;

public class CountingStringList extends AbstractList<String> {
    private static Generator<String> rand = new RandomGenerator.String();
    private int size;

    public CountingStringList(int size) {
        this.size = size < 0 ? 0 : size;
    }

    public CountingStringList(int size, int length) {
        this.size = size < 0 ? 0 : size;
        rand = new RandomGenerator.String(length);
    }

    public String get(int index) {
        return rand.next();
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        System.out.println(new CountingStringList(30));
    }
}
