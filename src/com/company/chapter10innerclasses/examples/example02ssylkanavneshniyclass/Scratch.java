package com.company.chapter10innerclasses.examples.example02ssylkanavneshniyclass;

/**
 * существует один нюанс:
 * объект внутреннего класса получает ссылку на внешний объект, который его создал,
 * и поэтому может обращаться к членам внешнего объекта без дополнительных уточнений.
 * Кроме того, для внутренних классов доступны все элементы внешнего класса
 */
class Scratch {
    interface Selector {
        boolean end();

        Object current();

        void next();
    }

    public static class Sequence {
        private Object[] items;
        private int next = 0;

        public Sequence(int size) {
            items = new Object[size];
        }

        public void add(Object x) {
            if (next < items.length)
                items[next++] = x;
        }

        private class SequenceSelector implements Selector {
            private int i = 0;

            public boolean end() {
                return i == items.length;
            }

            public Object current() {
                return items[i];
            }

            public void next() {
                if (i < items.length) i++;
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
            System.out.println("");
            System.out.println(sequence.next);
        }
    }
}