package com.company.chapter12errorhandlingandexceptions.tasks.task1415;

/**
 * 14. (2) Покажите, что программа OnOffSwitch.java может завершиться сбоем при возбуждении
 * R u n t im e E x c e p t io n внутри блока t r y .
 * <p>
 * 15 . (2) Продемонстрируйте, что программа WithFinally.java работает корректно при
 * возбуждении R u n t im e E x c e p t io n внутри блока t r y .
 */
public class SAAS {
    public static class Switch {
        private boolean state = false;

        public boolean read() {
            return state;
        }

        public void on() {
            state = true;
            System.out.println(this);
        }

        public void off() {
            state = false;
            System.out.println(this);
        }

        public String toString() {
            return state ? "вкл" : "выкл";
        }
    } // : ~

    //: exceptions/OnOffExceptionl.java
    public static class OnOffExceptionl extends Exception {
    } //f:~

    //: exceptions/0n0ffException2.java
    public class OnOffException2 extends Exception {
    } ///:~

    //: exceptions/OnOffSwitch.java
    // Для чего используется finally?
    public static class OnOffSwitch {
        private static Switch sw = new Switch();

        public static void f() throws OnOffExceptionl, OnOffException2 {
            throw new OnOffExceptionl();
        }

        public static void main(String[] args) {
            try {
                sw.on();
                // Код, который может возбуждать исключения...
                f();
                sw.off();
            } catch (OnOffExceptionl | OnOffException2 e) {
                System.out.println("OnOffExceptionl");

            } finally {
                System.out.println("Блок finally");
                sw.off();
            }

        }
    }
}
