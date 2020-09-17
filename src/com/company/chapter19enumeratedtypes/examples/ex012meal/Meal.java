package com.company.chapter19enumeratedtypes.examples.ex012meal;

import com.company.chapter19enumeratedtypes.examples.ex010food.Food;
import com.company.chapter19enumeratedtypes.examples.ex011course.Course;

/**
 * В этом случае «перечисление перечислений» создается для перебора по всем видам Course.
 */
public class Meal {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (Course course : Course.values()) {
                Food food = course.randomSelection();
                System.out.println(food);
            }
            System.out.println("----------");
        }
    }
}
