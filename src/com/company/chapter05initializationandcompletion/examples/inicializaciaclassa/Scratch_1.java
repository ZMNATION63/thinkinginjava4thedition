package com.company.chapter05initializationandcompletion.examples.inicializaciaclassa;

// Вывод начальных значений, присваиваемых по умолчанию,
class InitialValues {
    boolean t = true;
    char c;
    byte b;
    short s;
    int i = 1233;
    long l;
    float f;
    double d;
    InitialValues reference;

    InitialValues() {
        f = 12340;
    }

    double f() {
        return d = 12.123;
    }

    void printInitialValues() {
        f();//явно инициализируем double через функцыю
        System.out.println("Тип данных Начальное значение");
        System.out.println("boolean " + t);
        System.out.println("char [" + c + "]");
        System.out.println("byte " + b);
        System.out.println("short " + s);
        System.out.println("int " + i);
        System.out.println("long " + l);
        System.out.println("float " + f);
        System.out.println("double " + d);
        System.out.println("faference " + reference);
    }
}

class Scratch {
    public static void main(String[] args) {
        InitialValues iv = new InitialValues();
        iv.printInitialValues();
/* Тут возможен следующий вариант:
new InitialValues().printInitialValues();
*/
    }
}