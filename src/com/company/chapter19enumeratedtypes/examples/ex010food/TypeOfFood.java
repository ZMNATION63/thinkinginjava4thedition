package com.company.chapter19enumeratedtypes.examples.ex010food;

/**
 * Так как единственной формой создания подтипов для перечислений является реализация интерфейса,
 * каждое вложенное перечисление реализует окружающий интерфейс Food.
 */
public class TypeOfFood {
    public static void main(String[] args) {
        Food food = Food.Appetizer.SALAD;
        food = Food.MainCourse.LASAGNE;
        food = Food.Dessert.GELATO;
        food = Food.Coffee.CAPPUCCINO;
    }
}
