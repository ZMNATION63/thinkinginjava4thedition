package com.company.chapter09interfaces.tasks.task14task15;

/**
 * 14. (2) Создайте три интерфейса, каждый из которых содержит два метода. Объявите
 * новый интерфейс, производный от первых трех, включите в него новый метод. Создайте класс,
 * который реализует новый интерфейс, а также является производным
 * от конкретного класса. Напишите четыре метода, каждый из которых получает один из четырех
 * интерфейсов в аргументе. Создайте в main() объект этого класса
 * и передайте его каждому из методов
 * <p>
 * !!!ссылка интерфейсв но объект класса!!!
 * <p>
 * 15. (2) Измените предыдущее упражнение — создайте абстрактный класс и унаследуйте
 * производный класс от него.
 * <p>
 * Синтаксис, использованный в интерфейсе Vampire, работает только при наследовании
 * интерфейсов. Обычно ключевое слово extends может использоваться всего с одним
 * классом, но так как интерфейс можно составить из нескольких других интерфейсов,
 * extends подходит для написания нескольких имен интерфейсов при создании нового
 * интерфейса.
 */
class Scratch_1 {
    public static void main(String[] args) {
        Inter1 inter1 = new ClImolInterAll();
        Inter2 inter2 = new ClImolInterAll();
        Inter3 inter3 = new ClImolInterAll();
        InterAll interAll = new ClImolInterAll();

        ClImolInterAll clImolInterAll = new ClImolInterAll(); //объект класса

        clImolInterAll.met1(inter1);
        clImolInterAll.met2(inter2);
        clImolInterAll.met3(inter3);
        clImolInterAll.met4(interAll);
        inter1.in1Met1();
        inter2.in2Met2();
        inter3.in3Met1();
        interAll.inAllMet1();
        interAll.in2Met1();
    }
}