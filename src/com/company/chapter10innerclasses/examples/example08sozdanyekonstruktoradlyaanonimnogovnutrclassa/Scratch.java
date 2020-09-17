package com.company.chapter10innerclasses.examples.example08sozdanyekonstruktoradlyaanonimnogovnutrclassa;

/**
 * Анонимный класс не может содержать именованный конструктор (так
 * как у такого конструктора не может быть имени!), но при ИНИЦИАЛИЗАЦИИ экземпляра
 * можно фактически моделировать конструктор для анонимного внутреннего класса
 * Создание конструктора для анонимного внутреннего класса
 * <p>
 * В данном случае переменная i не обязана быть final.
 */
class Scratch {
    abstract static class Base {
        public Base(int i) {
            System.out.println("Вызываем конструктор, i = " + i);
        }

        public abstract void f();
    }

    public static class AnonymousConstructor {
        public static Base getBase(int i) {
            return new Base(i) {
                {
                    System.out.println("B инициализаторе экземпляра");
                }

                public void f() {
                    System.out.println("B анонимном f()");
                }
            };
        }

        public static void main(String[] args) {
            Base base = getBase(47);
            base.f();
        }
    }
}