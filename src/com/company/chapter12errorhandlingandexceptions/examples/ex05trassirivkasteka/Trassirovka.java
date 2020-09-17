package com.company.chapter12errorhandlingandexceptions.examples.ex05trassirivkasteka;

class WhoCalled {
    static void f() {
// Генерируем исключение для заполнения трассировки стека
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste : e.getStackTrace())// благодаря перебору стеку мы можем видить какие методы вызывались до
                //до появления исключения
                System.out.println(ste.getMethodName());
        }
    }

    static void g() {
        f();
    }

    static void h() {
        g();
    }

    public static void main(String[] args) {
        f();
        System.out.println("--------------------------------------------------------");
        g();
        System.out.println("--------------------------------------------------------");
        h();
    }
}

/**
 * Цель данного примера в том, можно отследить цепочку методов до того, который вызвал исключение
 */