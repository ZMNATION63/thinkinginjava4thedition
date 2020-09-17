package com.company.chapter15generictypes.examples.ex025classtypecapture;

/**
 * 21. (4) Измените пример ClassTypeCapture.java: добавьте в него контейнер Map<String,-
 * Class<?>>,мeтoдaddType(String typename, Class<?> kind)HMeTOflcreateNew(String
 * typename). Метод createNew() либо создает новый экземпляр класса, связанный
 * с аргументом-строкой, либо выводит сообщение об ошибке.
 */
class Building {
}

class House extends Building {
}

public class ClassTypeCapture<T> {
    Class<T> kind;

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> cttl = new ClassTypeCapture<Building>(Building.class);

        System.out.println(cttl.f(new Building()));
        System.out.println(cttl.f(new House()));

        ClassTypeCapture<House> ctt2 = new ClassTypeCapture<House>(House.class);

        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));
    }
}