package com.company.chapter15generictypes.tasks.task38decoration;

/**
 * 38. (4) Создайте простую систему декораторов: начните с базового типа Coffee, а затем
 * добавьте декораторы для разных кофейных напитков: капучино, с декоративной
 * пенкой, с шоколадом, с карамелью и взбитыми сливками
 */
public class Decoration {
    public static void main(String[] args) {
        TimeStamped t = new TimeStamped(new Basic());
        TimeStamped t2 = new TimeStamped(new SerialNumbered(new Basic()));

        //! t2.getSerialNumber(); // Недоступно
        SerialNumbered s = new SerialNumbered(new Basic());
        SerialNumbered s2 = new SerialNumbered(new TimeStamped(new Basic()));

        //! s2.getStamp(); // Недоступно
    }
}
