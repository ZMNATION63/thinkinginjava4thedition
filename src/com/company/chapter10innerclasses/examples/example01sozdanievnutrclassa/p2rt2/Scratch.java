package com.company.chapter10innerclasses.examples.example01sozdanievnutrclassa.p2rt2;

/**
 * Если вам понадобится создать объект внутреннего класса где-либо еще, кроме как
 * в нестатическом методе внешнего класса, нужно будет указать тип этого объекта следующим
 * образом: ИмяВнешнегоКласса.ИмяВнутреннегоКласса, что и делается в методе main ()
 */
class Scratch {
    //: innerclasses/Parcel2.java
// Возврат ссылки на внутренний класс.
    public static class Parcel2 {
        class Contents {
            private int i = 11;

            public int value() {
                return i;
            }
        }

        class Destination {
            private String label;

            Destination(String whereTo) {
                label = whereTo;
            }

            String readLabel() {
                return label;
            }
        }

        public Destination to(String s) {
            return new Destination(s); //Возвращает новый объект класса Destination
        }

        public Contents contents() {
            return new Contents();
        }

        public void ship(String dest) {
            Contents c = contents();
            Destination d = to(dest); //Создает новый элемент тип Destination
            System.out.println(d.readLabel());
        }

        public static void main(String[] args) {
            Parcel2 p = new Parcel2();
            p.ship("Tanzanya");
            Parcel2 q = new Parcel2();

            // Определение ссылок на внутренние классы:
            Parcel2.Contents c = q.contents();
            Parcel2.Destination d = q.to("5opHeo");
        }
    } /* Output:
Танзания
*///:-
}