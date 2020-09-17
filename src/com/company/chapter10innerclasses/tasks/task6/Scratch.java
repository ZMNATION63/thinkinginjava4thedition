package com.company.chapter10innerclasses.tasks.task6;

import com.company.chapter10innerclasses.tasks.task6.c1.C1;
import com.company.chapter10innerclasses.tasks.task6.c2.C2;
import com.company.chapter10innerclasses.tasks.task6.p1.Interface1;

/**
 * 6. (2) Создайте интерфейс, содержащий хотя бы один метод, в отдельном пакете.
 * Создайте класс в другом пакете. Добавьте защищенный внутренний класс, реализующий интерфейс.
 * В третьем пакете создайте производный класс; внутри метода
 * верните объект защищенного внутреннего класса, преобразованный в интерфейс.
 */
class Scratch {
    public static void main(String[] args) {
        C1 c1 = new C1();
        Interface1 interface1 = c1.makeInner();
        //interface1.metInter1 ();
        C2 c2 = new C2();
        Interface1 interface11 = c2.inter();

    }
}