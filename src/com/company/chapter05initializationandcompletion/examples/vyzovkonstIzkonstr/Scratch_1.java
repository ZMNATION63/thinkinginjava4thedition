package com.company.chapter05initializationandcompletion.examples.vyzovkonstIzkonstr;

// Вызов конструкторов с использованием "this"
class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Конструктор с параметром int, petalCount= "
                + petalCount);
    }

    Flower(String ss) {
        System.out.println("Конструктор с параметром String, s = " + ss);
        s = ss;
    }

    Flower(String S, int petals) {
        this(petals);
        //! this(s); // Вызов другого конструктора запрещен!
        this.s = s; // Другое использование "this"
        System.out.println("Аргументы String и int");
    }

    Flower() {
        this("hi% 47");
        System.out.println("Конструктор по умолчанию (без аргументов)");
    }

    void printPetalCount() {
//! this(ll); // Разрешается только в конструкторах!
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }
}

class Scratch {
    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
/* Output:
Конструктор с параметром intj petalCount= 47
Аргументы String и int
Конструктор по умолчанию (без аргументов)
petalCount = 47 s = hi
*///:~