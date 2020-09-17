package com.company.chapter03operators.examples.operatoryprivedeniya;

//Слово приведение используется в смысле «приведение к другому типу»
class Scratch_1 {
    public static void main(String[] args) {
        int i = 200;
        System.out.println(i);
        long lng = (long) i;
        System.out.println(lng);
        lng = i; // ’’Расширение", явное преобразование не обязательно
        long lng2 = (long) 200;
        System.out.println(lng2);
        lng2 = 200;
        System.out.println(lng2);
        // "Сужающее" преобразование
        i = (int) lng2; // Преобразование необходимо
        System.out.println(i);
    }
}