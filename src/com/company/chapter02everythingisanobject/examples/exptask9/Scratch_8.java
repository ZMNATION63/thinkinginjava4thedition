package com.company.chapter02everythingisanobject.examples.exptask9;

/**
 * 9. (1) Выведите наибольшее и наименьшее число в экспоненциальной записи для
 * типов float и double
 */
class Scratch_8 {
    public static void main(String[] args) {
        // Прописная и строчная буквы 'e' эквивалентны:
        float expFloat = 1.39e-43f;
        expFloat = 1.39E-43f;
        System.out.println(expFloat);
        double expDouble = 47e47d; // Суффикс *d' не обязателен
        double expDouble2 = 47e47; // Автоматически определяется double
        System.out.println(expDouble);
        System.out.println(expDouble2);
        float minFl = 3.4e-38f;        //педелы float от ±1.18 x 10 в -38 до ±3.4 x 10 в 38
        float maxFl = 3.4e38f;
        System.out.println("Float min = " + minFl + " Float max = " + maxFl);
        double doudMin = 2.23e-308d;    //от ±2.23 x 10 в -308 до ±1.80 x 10 в 308
        double doudMax = 2.23e307d;     //от ±2.23 x 10 в -308 до ±1.80 x 10 в 308
        System.out.println("Double min = " + doudMin + " Double max = " + doudMax);

    }
}
/* Output:
1.39E-43
4.7E48
*///:~