package com.company.chapter10innerclasses.examples.example014multiInterafaces;

/**
 * Интерфейсы берут на себя
 * часть этой задачи, в то время как внутренние классы фактически обеспечивают «множественное наследование реализации».
 * То есть внутренние классы позволяют вам наследовать от нескольких «ненинтерфейсов»
 */
class Scratch {
    interface A {
    }

    interface B {
    }

    static class X implements A, B {
    }

    static class Y implements A {
        B makeB() {
// Анонимный внутренний класс:
            return new B() {
            };
        }
    }

    public static class Multiinterfaces {
        static void takesA(A a) {
        }

        static void takesB(B b) {
        }

        public static void main(String[] args) {
            X x = new X();
            Y y = new Y();
            takesA(x);
            takesA(y);
            takesB(x);
            takesB(y.makeB());
        }
    }
}