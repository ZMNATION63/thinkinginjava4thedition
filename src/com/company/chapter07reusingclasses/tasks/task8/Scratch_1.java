package com.company.chapter07reusingclasses.tasks.task8;

/**
 * * <p>
 * * 8. (1) Создайте базовый класс с единственным конструктором, не являющимся конструктором по умолчанию,
 * * и производный класс с конструктором как по умолчанию (без аргументов), так и с аргументами.
 * * В конструкторе производного класса вызовите конструктор базового класса.
 */
class Scratch_1 {
    public static void main(String[] args) {
        B2 b = new B2();
        System.out.println("++++++++++++");
        B2 b2 = new B2(123456789);
    }
}