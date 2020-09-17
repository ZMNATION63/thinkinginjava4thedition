package com.company.chapter17containerdetails.examples.ex018listperformance;

import java.util.AbstractList;
import java.util.Arrays;

public class StringContainer extends AbstractList<String> {
    private static final int DEFAULT_SIZE = 16;
    private String[] strings;
    private int size;

    public StringContainer() {
        strings = new String[DEFAULT_SIZE];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(String s) {
        if (size >= strings.length) {
            strings = Arrays.copyOf(strings, size * 2);
        }
        strings[size] = s;
        size++;
        return true;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return strings[index];
    }

    @Override
    public void clear() {
        size = 0;
    }
}