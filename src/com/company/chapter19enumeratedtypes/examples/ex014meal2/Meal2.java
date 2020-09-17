package com.company.chapter19enumeratedtypes.examples.ex014meal2;

//import chapter019enumeratedtypes.ex.ex09enums.Enums;

import com.company.chapter19enumeratedtypes.examples.ex09enums.Enums;

/**
 * Конечным результатом является всего лишь реорганизация кода, но в некоторых
 * случаях его структура становится более четкой.
 */
public enum Meal2 {
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCoures.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);
    private Food[] values;

    private Meal2(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }

    public interface Food {
        enum Appetizer implements Food {
            SALAD, SOUP, SPRING_ROLLS;
        }

        enum MainCoures implements Food {
            LASAGNE, BURRITO, PAD_THAI,
            LENTILS, HUMMOUS, VINDALOO;
        }

        enum Coffee implements Food {
            BLACK_COFFEE, DECAF_COFFEE, ESPRESSO,
            LATTE, CAPPUCCINO, TEA, HERB_TEA;
        }

        enum Dessert implements Food {
            TIRAMISU, GELATO, BLACK_FOREST_CAKE,
            FRUIT, CREME_CARAMEL;
        }

    }

    public Food randomSelection() {
        return Enums.random(values);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (Meal2 meal2 : Meal2.values()) {
                Food food = meal2.randomSelection();
                System.out.println(food);
            }
            System.out.println("---------");
        }
    }
}