package com.company.chapter05initializationandcompletion.examples.konstruktorgarantInicializa;

class Scratch_1 {
    static class Rock {
        Rock() { // Это и есть конструктор
            System.out.print("Rock ");
        }
    }

    static class Rock2 {
        Rock2(int i) {
            System.out.print("Rock " + (i + 1) + " ");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            new Rock2(i);
        }
    }
}/* Output:
Rock Rock Rock Rock Rock Rock Rock Rock Rock Rock
*///:~