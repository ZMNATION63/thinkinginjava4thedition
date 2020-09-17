package com.company.chapter03operators.tasks.task02task03;

/**
 * 2. (1) Создайте класс с полем типа float. Используйте его для демонстрации совмещения имен.
 * <p>
 * <p>
 * 3. (1) Создайте класс с полем типа float. Используйте его для демонстрации совмещения имен при вызове методов.
 * <p>
 * Во многих языках программирования метод f() создал бы копию своего параметра
 * Letter у внутри своей области действия. Но из-за передачи ссылки строка:
 * y.c = 'z*;
 * на самом деле изменяет объект за пределами метода f().
 */
class Scratch_1 {
    static void changeZ(ExampleF e) {
        e.z = 163;
    }

    public static void main(String[] args) {
        ExampleF ex = new ExampleF();
        ex.z = 13;
        System.out.println(ex.z);
        changeZ(ex);
        System.out.println(ex.z);
    }
}