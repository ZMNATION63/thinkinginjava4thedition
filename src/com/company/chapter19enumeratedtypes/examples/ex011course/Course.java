package com.company.chapter19enumeratedtypes.examples.ex011course;

import com.company.chapter19enumeratedtypes.examples.ex010food.Food;
import com.company.chapter19enumeratedtypes.examples.ex09enums.Enums;

/**
 * Впрочем, при работе с набором типов от интерфейса меньше пользы, чем от перечисления.
 * Если вы хотите создать «перечисление перечислений», создайте окружающее перечисление,
 * содержащее один экземпляр для каждого перечисления из Food:
 */
public enum Course {
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);
    private Food[] values;

    private Course(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }

    public Food randomSelection() {
        return Enums.random(values);
    }
}