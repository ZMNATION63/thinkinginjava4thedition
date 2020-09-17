package com.company.chapter12errorhandlingandexceptions.tasks.task6;

public class Sequence1 {

    public static void main(String[] args) {
        int[] arr = new int[30];
        try {
            arr[50] = 152;
        } catch (RuntimeException e) {
            System.out.println("Блок catch");
            System.err.println(e.fillInStackTrace());
        }
    }
}
/*
 * Цель - показать, что не обязательно знать все исключения, можно отправлять в RuntimeException
 * А н сам разберется что деать с типом исключения и выаст тот который необходим
 * */