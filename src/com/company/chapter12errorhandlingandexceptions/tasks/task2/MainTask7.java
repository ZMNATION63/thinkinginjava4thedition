package com.company.chapter12errorhandlingandexceptions.tasks.task2;

/**
 * 7. (1) Измените упражнение 3 так, чтобы информация об исключении выводилась в блоке catch.
 */
public class MainTask7 {
    public static void main(String[] args) {
        int[] arr = new int[30];
        try {
            arr[35] = 1520; //java.lang.ArrayIndexOutOfBoundsException:

        } catch (ArrayIndexOutOfBoundsException e1) {
            System.err.println(e1.fillInStackTrace());
            e1.printStackTrace();
            System.out.println();
        } finally {
            System.out.println("Выполнение программы остановлено");
        }
    }
}
