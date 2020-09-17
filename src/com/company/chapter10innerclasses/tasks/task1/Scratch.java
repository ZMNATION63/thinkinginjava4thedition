package com.company.chapter10innerclasses.tasks.task1;

/**
 * 1. ( 1) Напишите класс с именем 0uter, содержащий внутренний класс с именем lnner.
 * Добавьте в 0uter метод, возвращающий объект типа Inner. В методе main() создайте
 * и инициализируйте ссылку на lnner
 * <p>
 * Если вам понадобится создать объект внутреннего класса где-либо еще, кроме как в
 * нестатическом методе внешнего класса, нужно будет указать тип этого объекта следующим
 * образом: ИмяВнешнегоКласса.ИмяВнутреннегоКласса, что и делается в методе main ()
 * <p>
 * 3. (1) Измените упражнение 1 так, чтобы класс O u t e r содержал закрытое поле S t r i n g
 * (инициализируемое в конструкторе), а класс l n n e r содержал метод t o S t r i n g ( ) для
 * вывода этого поля. Создайте объект типа l n n e r и выведите его.
 * <p>
 * Показывает, что внутренние классы имеют доступ, даже к скрытым полям внешнего класса
 */
class Scratch {
    static class Outer {
        private String strOuter;

        Outer() {
            strOuter = "Инициалзирована в конструкторе Outer private String strOuter!";
        }

        class Inner {
            String toSrting() {
                return strOuter;
            }

            String nameInner;

            Inner(String s) {
                nameInner = s;
                System.out.println("Конструктор Inner!");
            }
        }

        Inner makeInner(String n) {
            return new Inner(n);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner i = outer.makeInner("Внутренний Класс Inner");
        System.out.println("Имя внутреннего класса: " + i.nameInner);
        System.out.println(i.toSrting());
    }
}