package com.company.chapter10innerclasses.examples.example6anonymnyevnutrclassy;

import com.company.chapter10innerclasses.examples.example04vnutrennieclassyIvoshodpreobr.ContentsMZ;

/**
 * Метод contents() объединяет создание возвращаемого значения с определением класса,
 * представляющего это возвращаемое значение! Кроме того, класс анонимен, то есть
 * у него нет имени. Ситуация усугубляется тем, что на первый взгляд мы собираемся
 * создать объект Contents.
 * <p>
 * Но опеределяем анонимный внутренний класс
 */

//import com.company.Examples.Example04VnutrennieClassyIVoshodPreobr.ContentsMZ;

class Scratch {
    public static class Parcel7 {
        public ContentsMZ contents() { //Интерфейс из примера 4
            return new ContentsMZ() { // Вставка определения класса

                private int i = 11;

                public int value() {
                    return i;
                }
            }; // Точка с запятой здесь необходима
        }

        public static void main(String[] args) {
            Parcel7 p = new Parcel7();
            ContentsMZ c = p.contents();
            System.out.println(c.value());
        }
    }
}