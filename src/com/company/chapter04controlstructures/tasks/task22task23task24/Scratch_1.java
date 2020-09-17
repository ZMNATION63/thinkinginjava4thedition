package com.company.chapter04controlstructures.tasks.task22task23task24;

import java.util.ArrayList;
import java.util.Random;

/**
 * 22. (2) Создайте команду switch, которая выводит сообщение в каждой секции case.
 * Разместите ее в цикле for, проверяющем все допустимые значения case. Каждая
 * секция case должна завершаться командой break. Затем удалите команды break
 * и посмотрите, что произойдет.
 * <p>
 * 23. (4) Числами Фибоначчи называется числовая последовательность 1,1,2,3,5,8,13,
 * 21, 34 и т. д., в которой каждое число, начиная с третьего, является суммой двух
 * предыдущих. Напишите метод, который получает целочисленный аргумент и выводит указанное
 * количество чисел Фибоначчи. Например, при запуске командой java
 * Fibonacci 5 (где Fibonacci — имя класса) должна выводиться последовательность
 * 1, 1, 2, 3, 5.
 */
class Scratch_1 {
    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<>();
        Random rand = new Random();
        int seqNumberFromSun;
        for (int i = 0; i < 9; i++) {
            seqNumberFromSun = rand.nextInt(8);
            switch (seqNumberFromSun) {
                case 1:
                    result.add("Нет атмосферы");
                    break;
                case 3:
                    result.add("Азот");
                    result.add("Кислород");
                case 2:
                    break;
                case 4:
                    result.add("Углекислый газ");
                    break;
                case 7:
                    break;
                case 8:
                    result.add("Метан");
                    break;
                case 5:
                    break;
                case 6:
                    result.add("Водород");
                    result.add("Гелий");
                    break;
            }
        }

        System.out.println("++++++++++++++");
        for (int j = 0; j < result.size(); j++) {
            System.out.println(result.get(j));
        }
        System.out.println("++++++++++++++");
        /**
         *  * 23. (4) Числами Фибоначчи называется числовая последовательность 1,1,2,3,5,8,13,
         *  * 21, 34 и т. д., в которой каждое число, начиная с третьего, является суммой двух
         *  * предыдущих. Напишите метод, который получает целочисленный аргумент и выводит указанное
         *  * количество чисел Фибоначчи. Например, при запуске командой java
         *  * Fibonacci 5 (где Fibonacci — имя класса) должна выводиться последовательность
         *  * 1, 1, 2, 3, 5.
         *  */
        Fibonachi f = new Fibonachi();
        f.fibo(9);

    }
}