package com.company.chapter10innerclasses.examples.example03thisnew.part2parcel;

/**
 * Чтобы создать объект внутреннего класса, обязательно должен существовать объект внешнего класса.
 * Это объясняется тем, что объект внутреннего класса незаметно
 * связывается с объектом внешнего класса, на базе которого он был создан. С другой
 * стороны, при создании вложенного класса (статического внутреннего класса) ссылка
 * на объект внешнего класса не нужна.
 */
class Scratch {
    public static class Parcel3 {
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

        public static void main(String[] args) {
            Parcel3 p = new Parcel3();
            //Mustuseinstanceofouterclass
            //tocreateaninstanceoftheinnerclass:
            Parcel3.Contents c = p.new Contents();
            Parcel3.Destination d = p.new Destination("Tanzanya");
            System.out.println(d.readLabel());
        }
    }
}