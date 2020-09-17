package com.company.chapter10innerclasses.examples.example09inicializacyaekzemplyara;

import com.company.chapter10innerclasses.examples.example04vnutrennieclassyIvoshodpreobr.Destination;

/**
 * Ниже приведена вариация на тему Parcel с инициализацией экземпляра. Помните,
 * что аргументы destination() должны быть объявлены с ключевым словом final, так
 * как они будут использоваться в анонимном классе
 * <p>
 * В инициализаторе экземпляра присутствует код, который не может быть выполнен
 * как часть инициализатора поля (а именно команда if). Таким образом, по сути
 * инициализатор экземпляра является конструктором для анонимного внутреннего класса.
 * Конечно, эта модель имеет свои ограничения; инициализаторы экземпляров не могут
 * перегружаться, поэтому такой «конструктор» может быть только один.
 */


class Parcell0 {
    public Destination
    destination(final String dest, final float price) {
        return new Destination() {
            private int cost;

            // Инициализация экземпляра для каждого объекта:
            {
                cost = Math.round(price);
                if (cost > 100)
                    System.out.println("Превышение бюджета!");
            }

            private String label = dest;

            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcell0 p = new Parcell0();
        Destination d = p.destination("Танзания", 101.395F);
    }
}