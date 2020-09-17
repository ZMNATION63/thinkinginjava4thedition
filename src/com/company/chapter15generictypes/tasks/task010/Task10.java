package com.company.chapter15generictypes.tasks.task010;

/**
 * 10. (1) Измените предыдущее упражнение так, чтобы один из аргументов^() был непараметризованным.
 */
public class Task10 {
    public <T, U, K> void f(T x, U u, K... k) {
        System.out.print(x.getClass().getSimpleName() + " ");
        System.out.print(u.getClass().getSimpleName() + " ");
        System.out.print(k.getClass().getSimpleName() + " ");
        System.out.println("");
    }

    public static void main(String[] args) {
        Task10 gm = new Task10();
        gm.f("STR", 123, 12.2, 1282, 6456, "");
        gm.f(1, new Integer(123), new Task10());
        gm.f(1.0, "", 753);
        gm.f(1.0F, new Object(), 4);
        gm.f('c', 'a', 124f);
        gm.f("", gm, 717717);
    }
}
