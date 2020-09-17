package com.company.chapter03operators.tasks.task14;

/***
 * 14. (3) Напишите метод, который получает два аргумента String, выполняет с ними
 * все операции логических сравнений и выводит результаты. Для операций == и !=
 * также выполните проверку equals(). Вызовите свой метод из main() для нескольких
 * разных объектов String.
 *
 * > — оператор «больше».
 * >= — оператор «больше или равно».
 * < — оператор «меньше».
 * <= — оператор «меньше или равно».
 * != — оператор «не равно».
 * == — оператор эквивалентности (равенства).
 */
class Scratch_1 {
    public static void main(String[] args) {
        String str1 = "Привет МИР";
        String str2 = "Привет Мир";
        compareStrings(str1, str2);

    }

    static void compareStrings(String s1, String s2) {
        System.out.println("Строка 1 != строка 2 " + s1 != s2);
        System.out.println("Строка 1 == строка 2 " + s1 == s2);
        System.out.println("Строка 1 equals строка 2 " + s1.equals(s2));
        System.out.println("Строка 1 !equals строка 2 " + !s1.equals(s2));


    }
}