package com.company.chapter15generictypes.examples.ex02twotuple;

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence<T> {

    //    private Object[] items;
    private T[] items;
    private int next;

    public Sequence(int size) {
//        items = new Object[size];
        items = (T[]) new Object[size];
    }

    public void add(T x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {

        private int i = 0;

        public boolean end() {
            return i == items.length; // using private field "items" of outer class !
        }

        public Object current() {
            return items[i]; // using private field "items" of outer class !
        }

        public void next() {
            if (i < items.length) { // using private field "items" of outer class !
                i++;
            }
        }
    }

    public Selector getSelector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
//            sequence.add(Integer.toString(i));
            sequence.add("String i = " + i);
        }

        Selector selector = sequence.getSelector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}

