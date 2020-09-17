package com.company.chapter14typeinformation.examples.ex07generictoytest;

/**
 * добавлен новый синтаксис приведения типа для ссылок на  * Class — метод cast():
 * Метод cast() получает аргумент-объект и преобразует его к типу ссылки на Class.
 * Конечно, приведенный выше код вроде бы выполняет много лишней работы по сравнению с
 * последней строкой main(), которая делает то же самое.
 * <p>
 * Новый синтаксис приведения типов полезен в ситуациях, в которых нельзя использовать обычное приведение типа.
 */
class Building {
}

class House extends Building {
}

public class ClassCasts {
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        h = (House) b; // ... или так.
    }
}