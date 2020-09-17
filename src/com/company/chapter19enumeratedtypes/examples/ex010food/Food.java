package com.company.chapter19enumeratedtypes.examples.ex010food;

/**
 * Невозможность наследования от перечислений иногда раздражает.
 * Категории можно реализовать группировкой элементов внутри интерфейса и созданием перечисления на основе
 * этого интерфейса. Допустим, вы хотите создать перечисления для разных видов еды, но при этом каждое из них
 * должно оставаться частным случаем типа Food.
 */
public interface Food {
    enum Appetizer implements Food {
        SALAD, SOUP, SPRING_ROLLS;
    }

    enum MainCourse implements Food {
        LASAGNE, BURRIT0, PAD_THAI,
        LENTILS, HUMMOUS, VINDALOO;
    }

    enum Dessert implements Food {
        TIRAMISU, GELATO, BLACK_FOREST_CAKE,
        FRUIT, CREME_CARAMEL;
    }

    enum Coffee implements Food {
        BLACK_COFFEE, DECAF_COFFEE, ESPRESSO,
        LATTE, CAPPUCCINO, TEA, HERB_TEA;
    }
}
