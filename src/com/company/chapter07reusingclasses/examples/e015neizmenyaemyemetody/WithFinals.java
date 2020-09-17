package com.company.chapter07reusingclasses.examples.e015neizmenyaemyemetody;

public class WithFinals {
    // То же, что и просто private:
    private final void f() {
        System.out.println("WithFinals.f()");
    }

    // Также автоматически является fin a l:
    private void g() {
        System.out.println("WithFinals.g()");
    }
}
