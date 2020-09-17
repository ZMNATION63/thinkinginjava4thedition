/**
 * 2. (1) Создайте класс с полем типа float. Используйте его для демонстрации совмещения имен.
 */
package com.company.chapter02everythingisanobject.examples.prisvaivanietask2;

class Scratch_4 {
    public static void main(String[] args) {
        Tank tl = new Tank();
        Tank t2 = new Tank();
        tl.level = 9;
        t2.level = 47;
        System.out.println("l: tl.level: " + tl.level + ", t2.1evel: " + t2.level);
        tl = t2; //потерян указатель на t1
        System.out.println("2: tl.level: " + tl.level + ", t2.1evel: " + t2.level);
        tl.level = 27; //Присваиваем уровень по ссылке t1 получаем изменения в 2-х объектах
        System.out.println("3: tl.level: " + tl.level + ", t2.1evel: " + t2.level);

    }
}/* Output:
1: tl.level: 9, t2.1evel: 47
2: tl.level: 47, t2.1evel: 47
3: tl.level: 27, t2.1evel: 27
*///:~