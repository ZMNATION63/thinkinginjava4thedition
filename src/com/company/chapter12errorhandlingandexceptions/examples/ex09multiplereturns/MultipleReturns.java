package com.company.chapter12errorhandlingandexceptions.examples.ex09multiplereturns;

/**
 * Цель - показать, что выход из блока try можно контролировать return, после точки выхода, дальнейший код не выполняется
 */
public class MultipleReturns {
    public static int f(int i) {
        System.out.println("f(i): Инициализация, требующая завершения");
        try {
            System.out.println("Вывод 1");
            if (i == 1) return 1;
            System.out.println("Вывод 2");
            if (i == 2) return 2;
            System.out.println("Вывод 3");
            if (i == 3) return 3;
            System.out.println("Конец");
            return -1;
        } finally {
            System.out.println("Метод Finally");
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            int result = f(i);
//            System.out.println("f(" + i + ") return value: " + result);
            System.out.println("--------------------------------");
        }
    }
}
