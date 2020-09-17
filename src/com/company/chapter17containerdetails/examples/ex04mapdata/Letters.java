package com.company.chapter17containerdetails.examples.ex04mapdata;

import com.company.chapter17containerdetails.examples.ex02collectiondatatest.Generator;
import com.company.chapter17containerdetails.examples.ex03collectiondatageneration.Pair;

import java.util.Iterator;

public class Letters implements Generator<Pair<Integer, String>>, Iterable<Integer> {
    private int size = 9;
    private int number = 1;
    private char letter = 'A';

    public Pair<Integer, String> next() {
        return new Pair<Integer, String>(
                number++, "" + letter++);
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public Integer next() {
                return number++;
            }

            public boolean hasNext() {
                return number < size;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
