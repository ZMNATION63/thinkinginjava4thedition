package com.company.chapter12errorhandlingandexceptions.tasks.task1415;

public class WithFinally {
    static SAAS.Switch sw = new SAAS.Switch();

    public static void main(String[] args) {
        try {
            sw.on();
// Код, способный возбуждать исключения...
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("OnOffExceptionl");
        } finally {
            sw.off();
        }
    }
}
