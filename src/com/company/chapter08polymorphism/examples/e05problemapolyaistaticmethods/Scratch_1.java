package com.company.chapter08polymorphism.examples.e05problemapolyaistaticmethods;

/**
 * При восходящем преобразовании объекта Sub в ссылку на Super все обращения к полям
 * разрешаются компилятором, и это поведение не является полиморфным. В этом примере для
 * Super.fieldиSub.field выделяются разные области памяти. Таким образом,
 * Sub фактически содержит два поля с именем field : собственное и унаследованное от
 * Super.
 * При этом версйя^ирег не используется по умолчанию при обращении к полю
 * в Sub; чтобы получить доступ к полю из Super , необходимо использовать явную запись
 * super.field.
 */
class Scratch_1 {
    public static void main(String[] args) {
        Super sup = new Sub();//Upcast
        System.out.println("sup.field = " + sup.field +
                " ,sup.getField() = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = " +
                sub.field + " ,sub.getField()=" +
                sub.getField() +
                " ,sub.getSuperField() = " +
                sub.getSuperField());

        StaticSuper sup2 = new StaticSub();//Восходящеепреобразование
        System.out.println(sup2.staticGet());//разница в объявлении, в базовом классе метод статичен и по этому
        //выводится именно статчный метод базового класса
        System.out.println(sup2.dynamicGet());
    }
}
/* O u tp u t:
        s u p . f i e l d = 0 , s u p . g e t F ie ld ( ) = 1
        s u b . f i e l d = 1 , s u b . g e t F ie l d ( ) = 1 , s u b .g e t S u p e r F ie ld ( ) = 0
        *///:~