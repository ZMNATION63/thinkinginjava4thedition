package com.company.chapter10innerclasses.examples.example012classyvnutryinterfacov;

/**
 * Вложение классов в интерфейсы особенно удобно при создании общего кода, который
 * должен использоваться со всеми реализациями этого интерфейса
 */
class Scratch {
    interface ClassInInterface {
        void howdy();

        class Test implements ClassInInterface {
            public void howdy() {
                System.out.println("Привет!");
            }

            public static void main(String[] args) {
                new Test().howdy();
            }
        }
    }

}