package com.company.chapter16arrays.tasks.task3;

/**
 * 6. (1)Напишите метод, который получает два аргумента int , определяющие два размера двумерного массива.
 * Метод должен создавать и заполнять двумерный массив объектов BerylliumSphere , соответствующий переданным аргументам.
 * <p>
 * 7. (1) Повторите предыдущее упражнение для трехмерного массива.
 */
public class Task6 {
    static BerylliumSphere[][] berylliumSpheresArray(int a, int b) {
        //Random r = new Random(47);
        BerylliumSphere[][] berylliumSpheres = new BerylliumSphere[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                berylliumSpheres[i][j] = new BerylliumSphere();
            }
        }
        return berylliumSpheres;
    }

    //строки столбцы
    static void printBerylliumSphere(BerylliumSphere[][] doubles) {

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
        BerylliumSphere[][] b = berylliumSpheresArray(5, 6);
        printBerylliumSphere(b);
    }
}
