package com.company.chapter15generictypes.tasks.task09;

/**
 * 9. (1) Измените пример GenericMethods.java, чтобы метод f() получал три аргумента,
 * относящихся к разным параметризованным типам
 * <p>
 * Автоматическая упаковка в действии
 */
public class Tsk9 {
    public <T, U, K> void f(T x, U u, K k) {
        System.out.print(x.getClass().getSimpleName() + " ");
        System.out.print(u.getClass().getSimpleName() + " ");
        System.out.print(k.getClass().getSimpleName() + " ");
        System.out.println("");
    }

    public static void main(String[] args) {
        Tsk9 gm = new Tsk9();
        gm.f("STR", 123, 12.2);
        gm.f(1, new Integer(123), new Tsk9());
        gm.f(1.0, "", 753);
        gm.f(1.0F, new Object(), 4);
        gm.f('c', 'a', 124f);
        gm.f("", gm, 717717);
    }
}
