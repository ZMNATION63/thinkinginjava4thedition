package com.company.chapter12errorhandlingandexceptions.examples.ex04extrafeatures1;

public class ExtraFeatures1 {
    static class MyException2 extends Exception {
        private int x;

        public MyException2() {
        }

        public MyException2(String msg) {
            super(msg);
        }

        public MyException2(String msg, int x) {
            super(msg);
            this.x = x;
        }

        public int val() {
            return x;
        }

        public String getMessage() {
            return "Подробное сообщение: " + x + " " + super.getMessage();
        }
    }

    public static class ExtraFeatures {
        public static void f() throws MyException2 {
            System.out.println("Возбуждаем MyException2 из f()");
            throw new MyException2();
        }

        public static void g() throws MyException2 {
            System.out.println("Возбуждаем MyException2 из g()");
            throw new MyException2("Создано в g()");
        }

        public static void h() throws MyException2 {
            System.out.println("Возбуждаем MyException2 из h()");
            throw new MyException2("Создано в h(>", 47);

        }

        public static void main(String[] args) {
            try {
                f(); //Генерируем исключение по конструктору по умолчанию
            } catch (MyException2 e) {
                e.printStackTrace(System.out);
            }
//----------------------------------------
            try {
                g(); //Генерируем исключение конструктор с передачей стринги
            } catch (MyException2 e) {
                e.printStackTrace(System.out);
            }
//----------------------------------------
            try {
                h();//Генерируем исключение конструктор с передачей стринги и int
            } catch (MyException2 e) {
                e.printStackTrace(System.out);
                System.out.println("e.val() = " + e.val()); //val() - геттер int в классе исключения
            }
        }
    }
}
/**
 * Пример показывает возможности создания разновидных классов исключений
 * функционал можно расширять безгранично много, но минус в том, что он может быть проигнорирован программистами-клиентами
 */