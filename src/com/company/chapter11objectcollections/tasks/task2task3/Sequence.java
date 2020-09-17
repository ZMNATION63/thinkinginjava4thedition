package com.company.chapter11objectcollections.tasks.task2task3;

import java.util.ArrayList;

/**
 * * 3. (2) Измените пример innerclasses/Sequence.java так, чтобы в контейнер можно было
 * * добавить произвольное количество элементов.
 */
interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private ArrayList<Object> items;
    private int next = 0;
    private int max_element_from_user;

    public Sequence(int size) {
        items = new ArrayList<Object>();
        //items = new Object[size];
    }

    public void add(Object x) {
        items.add(x);
//        if(next < items.length)
//            items[next++] = x;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.size(); /*i == items.length;*/
        }

        @Override
        public Object current() {
            return items.get(i); /*items[i];*/
        }

        @Override
        public void next() {
            if (i < items.size()) i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}