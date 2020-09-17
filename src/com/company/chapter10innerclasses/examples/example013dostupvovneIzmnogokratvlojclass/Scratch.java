package com.company.chapter10innerclasses.examples.example013dostupvovneIzmnogokratvlojclass;

/**
 * Вы можете видеть, что в классе MNA.A.B методы f() и g() вызываются без дополнительных уточнений
 * (несмотря на то, что они объявлены как private). Этот пример также
 * демонстрирует синтаксис, который следует использовать при создании объектов внутренних классов
 * произвольного уровня вложенности из другого класса. Выражение
 * . new дает верную область действия, и вам не приходится уточнять его полное имя при
 * вызове конструктора
 * <p>
 * !!!
 * Каждый внутренний класс способен независимо наследовать определенную реализацию.
 * Таким образом, внутренний класс не ограничен при наследовании в ситуациях,где
 * внешний класс уже наследует реализацию.
 * <p>
 * выступает как «довесок» множественного наследования.
 * !!!
 */
class Scratch {
    static class MNA {
        private void f() {
        }

        class A {
            private void g() {
            }

            public class B {
                void h() {
                    g();
                    f();
                }
            }
        }
    }

    public static class MultiNestingAccess {
        public static void main(String[] args) {
            MNA mna = new MNA();
            MNA.A mnaa = mna.new A();
            MNA.A.B mnaab = mnaa.new B();
            mnaab.h();
        }
    }
}