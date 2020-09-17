package com.company.chapter07reusingclasses.examples.e015neizmenyaemyemetody;

/**
 * Любой закрытый (private) метод в классе косвенно является неизменным (final)
 * методом. Так как вы не в силах получить доступ к закрытому методу, то не сможете
 * и переопределить его. Ключевое слово fin al можно добавить к закрытому методу, но
 * его присутствие ни на что не повлияет
 * 20. ( 1) Продемонстрируйте, что аннотация @Override решает проблему, упомянутую в
 * этом разделе.
 * 21. Создайте класс с неизменным (final) методом. Создайте производный класс и попытайтесь переопределить этот метод.
 * Все выглядет так, будто закрытый (и неизменный) метод
 * можно переопределить, но это заблуждение,
 */
class Scratch_2 {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
// Можно провести восходящее преобразование:
        Overridingprivate op = op2;
// Но методы при этом вызвать невозможно:
//! op.f();
//! op.g();
// И то же самое здесь:
        WithFinals wf = op2;
// wf.f();
//! wf.g();
        Overridingprivate overridingprivate = new Overridingprivate();
        overridingprivate.metod2();

        DemonstarateClass demonstarateClass = new DemonstarateClass();
        demonstarateClass.metod2();
    }
}