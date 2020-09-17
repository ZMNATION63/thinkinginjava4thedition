package com.company.chapter19enumeratedtypes.examples.ex09enums;

/**
 * Несколько странный синтаксис <T extends Enum<T>> описывает т как экземпляр перечисления. Передавая class<T>,
 * мы предоставляем доступ к объекту класса для получения массива экземпляров класса. Перегруженному методу
 * random(^ocraT04HO знать, что он получает T[], потому что ему не нужно выполнять операции Enum; все,
 * что от него требуется, — случайный выбор элемента массива. Возвращаемым типом является точный тип enum.
 * <p>
 * Вы увидите, что несмотря на небольшие размеры, класс Enutns предотвращает значительный объем дублирования кода.
 * Дублирование повышает вероятность ошибок, поэтому его устранение является полезным делом.
 */

import java.util.Random;

public class Enums {
    private static Random rand = new Random(47);

    public static <T extends Enum<T>> T random(Class<T> ec) {
        return random(ec.getEnumConstants());
    }

    public static <T> T random(T[] values) {
        return values[rand.nextInt(values.length)];
    }
}
