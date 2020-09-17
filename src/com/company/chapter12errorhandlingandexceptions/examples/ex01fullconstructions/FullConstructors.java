package com.company.chapter12errorhandlingandexceptions.examples.ex01fullconstructions;

class MyException extends Exception {
    public MyException() {
    }

    public MyException(String msg) {
        super(msg);
    }
}

public class FullConstructors {

    public static void f() throws MyException {
        System.out.println("Bo36y*flaeM MyException из f(J");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("Bo36yxAaeM MyException из g()");
        throw new MyException("Co3flaHo в g()");
    }

    public static void main(String[] args) {
        try {
            FullConstructors.f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }
}