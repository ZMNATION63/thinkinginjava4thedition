package com.company.chapter10innerclasses.examples.example01sozdanievnutrclassa;

/**
 * Внутренний класс, используемый внутри метода ship(), выглядит так же, как и все
 * остальные классы. Очевидное отличие одно — имена классов вложены в класс Parcell.
 * Вскоре вы увидите, что это не единственное отличие
 */
class Scratch {
    public static class Parcell {
        class Contents {
            private int i = 11;

            public int value() {
                return i;
            }
        }

        static class Destination {
            private String label;

            Destination(String whereTo) {
                label = whereTo;
            }

            String readLabel() {
                return label;
            }
        }

        // Использование внутренних классов очень похоже
        // на использование любых других классов,
        // в пределах Parcell:
        public void ship(String dest) {
            Contents c = new Contents();
            Destination d = new Destination(dest);
            System.out.println(d.readLabel() + " " + c.value());
        }

        public static void main(String[] args) {
            Parcell p = new Parcell();
            p.ship("Tanzaniya");
            Parcell.Destination destination = new Destination("SAMARA - GORODOOOOK");
            System.out.println(destination.label);
        }
    } /* Output:
Танзания
*///:~
}