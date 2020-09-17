package com.company.chapter10innerclasses.tasks.task5;

/**
 * 5. (1) Создайте класс с внутренним классом. В отдельном классе создайте экземпляр
 * внутреннего класса.
 * <p>
 * Внутренний класс привязан к экземпляру вненего класса и без экземпляра не оздается
 */
class Scratch {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.makeInner();
        inner.setManeOuter("переданное значение из Inner в Outer");
    }
}