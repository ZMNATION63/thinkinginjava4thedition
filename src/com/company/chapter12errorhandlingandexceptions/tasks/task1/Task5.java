package com.company.chapter12errorhandlingandexceptions.tasks.task1;

public class Task5 {
    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            try {
                if (count++ == 0)
                    throw new MyTaskException("Перво исключение, которое не сработает в данных условиях");
                System.out.println("Нет исключений");
            } catch (MyTaskException e) {
                System.err.println("MyTaskException");
            } finally {
                System.out.println("B блоке finally");
                if (count == 2) break;
            }
        }
    }
}
/**
 * ЗАдание показывает, что можно в цыкле запустить попутку исправления ситуации
 * но не всегда это удается
 * один из способов управлять исключениями
 */