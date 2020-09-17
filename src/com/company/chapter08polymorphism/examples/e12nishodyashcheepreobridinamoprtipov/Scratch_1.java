package com.company.chapter08polymorphism.examples.e12nishodyashcheepreobridinamoprtipov;

/**
 * // Нисходящее преобразование и динамическое определение типов (RTTI).
 * // {ThrowException}
 * <p>
 * Система не может найти метод производного класса при нисходящем преобразовании,
 * преобразуется базовый класс к производному. Метод U существует только в MoreUseful
 */
class Scratch_1 {
    public static void main(String[] args) {
        Useful[] x = {
                new Useful(),
                new MoreUseful()
        };

        x[0].f();
        x[1].g();
        // Стадия компиляции: метод не найден в классе Useful:
        // ! x[l].u();
        ((MoreUseful) x[1]).u(); // Нисходящее преобразование /RTTI
//        ((MoreUseful) x[0]).u (); // Происходит исключение
    }
}