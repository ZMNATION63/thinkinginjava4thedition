package com.company.chapter05initializationandcompletion.examples.peregruzkametodov;

/*
: initialization/Overloading.java
 Демонстрация перегрузки конструкторов наряду
 с перегрузкой обычньа методов,
*/
class Tree {
    int height;

    Tree() {
        System.out.println("Сажаем росток");
        height = 0;
    }

    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Зоздание нового дерева высотой " +
                height + " м.");
    }

    void info() {
        System.out.println("Дерево высотой " + height + " м.");
    }

    void info(String s) {
        System.out.println(s + ": Дерево высотой " + height + " м.");
    }
}

class Scratch {

    static void f(String s, int i) {
        System.out.println("String: " + s + ", int: " + i);
    }

    static void f(int i, String s) {
        System.out.println("int: " + i + ", String: " + s);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("Перегруженный метод");

            // Перегруженный конструктор:
            new Tree();

            System.out.println();
        }

        /**
         * Перегрузка методов
         */
        f("Сначала строка", 11);
        f(99, "Сначала число");
    }
} /* Output:
Создание нового дерева высотой 0 м.
Дерево высотой 0 м.
Перегруженный метод: Дерево высотой 0 м.
Создание нового дерева высотой 1 м.
Дерево высотой 1 м.
Перегруженный метод: Дерево высотой 1 м.
Создание нового дерева высотой 2 м.
Дерево высотой 2 м.
Перегруженный метод: Дерево высотой 2 м.
Создание нового дерева высотой 3 м.
Дерево высотой 3 м.
Перегруженный метод: Дерево высотой 3 м.
Создание нового дерева высотой 4 м.
Дерево высотой 4 м.
Перегруженный метод: Дерево высотой 4 м.
Сажаем росток
*///:~