package com.company.chapter10innerclasses.examples.example7vyzovkonstruktorabazovogoklassa;

//import com.company.Examples.Example04VnutrennieClassyIVoshodPreobr.Destination;

import com.company.chapter10innerclasses.examples.example04vnutrennieclassyIvoshodpreobr.Destination;

class Parcel9 {
    // Для использования в анонимном внутреннем классе
    // аргумент должен быть объявлен как final.

    /**
     * Если вы определяете анонимный внутренний класс и хотите использовать объект,
     * определенный внутри анонимного внутреннего класса, компилятор требует, чтобы
     * ссылка на аргумент была объявлена как final
     */
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;

            public String readLabel() {
                return label;
            }
        };  // Точка с запятой в конце анонимного внутреннего класса отмечает не конец тела класса,
        // а конец выражения, содержащего анонимный класс.
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Танзания");
        System.out.println(d.readLabel());
    }
}
///:~
