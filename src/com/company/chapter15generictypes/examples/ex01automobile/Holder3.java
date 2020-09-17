package com.company.chapter15generictypes.examples.ex01automobile;

import com.company.chapter15generictypes.tasks.task01.HolderTypes;

/**
 * 1. ( 1) Используйте Holder3 с библиотекой typeinfo.pets продемонстрируйте, что объект
 * Holder3, объявленный с базовым типом, также может хранить производный тип.
 */
public class Holder3<T> {
    private T a;

    public Holder3(T а) {
        this.a = а;
    }

    public void set(T а) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        HolderTypes<?> h4 = new HolderTypes<>(new ElectroCar(), "Строка в контейнере", 809);
        Holder3<ElectroCar> h3 = new Holder3<ElectroCar>(new ElectroCar());
//        Automobile а = h3.get(); // Преобразование не требуется
//        Class<?> c = Class.forName("com.company.Examples.Ex01Automobile.Automobile");
//        System.out.println(c.getSimpleName());

        System.out.println(h3.get() + " поле a Обобщенного типа Holdet3<T>");
        System.out.println(h3.toString());
        System.out.println(h4);
//         h3.set("Not an Automobile"); // Ошибка
//         h3.set(l); // Ошибка
    }
}
