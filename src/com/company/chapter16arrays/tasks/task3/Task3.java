package com.company.chapter16arrays.tasks.task3;

import java.util.Random;

/**
 * (4) Напишите метод, который создает и инициализирует двумерный массив double.
 * Размер массива определяется аргументами метода, а значения инициализации лежат в диапазоне,
 * определяемом начальным и конечным индексами, также передаваемыми в аргументах метода.
 * <p>
 * Создайте второй метод для вывода массива, сгенерированного первым методом. Протестируйте методы в main ( ) — создайте
 * и выведите массивы нескольких разных размеров.
 */
public class Task3 {
    static Double[][] doubleArray(int a, int b) {
        Random r = new Random(47);
        Double[][] aDouble = new Double[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                aDouble[i][j] = r.nextDouble();
            }
        }
        return aDouble;
    }

    //строки столбцы
    static void printDoubleArray(Double[][] doubles) {

        for (int i = 0; i < doubles.length; i++) {
            String row = "{ ";
            for (int j = 0; j < doubles.length; j++) {
                row = row + "[ " + doubles[i][j] + " ]" + " ";
            }
            row = row + " }";
            System.out.println(row);
        }
    }

    public static void main(String[] args) {
        Double[][] k = doubleArray(5, 5);
        printDoubleArray(k);
    }
}
