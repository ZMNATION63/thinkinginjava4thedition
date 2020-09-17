package com.company.chapter07reusingclasses.examples.e12final;

import java.util.Random;

/**
 * ак как v a lu e O n e и VALUE_TWO являются примитивными типами со значениями,
 * заданными на стадии компиляции, они оба могут использоваться в качестве констант времени
 * компиляции, и принципиальных различий между ними нет.
 * <p>
 * 18. (2) Создайте класс, содержащий два поля: static fin al и final. Продемонстрируйте
 * различия между ними.
 */
public class FinalData {
    private static Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    //Могутбытьконстантамивременикомпиляции:
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    //Типичнаяоткрытаяконстанта:
    public static final int VALUE_THREE = 39;
    //Неможетбытьконстантойвременикомпиляции:
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    protected Value vl = new Value(11);
    protected final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    //Массивы:
    protected final int[] a = {1, 2, 3, 4, 5, 6};

    public String toString() {
        return id + ":" + "i4=" + i4 + ",INT_5=" + INT_5;
    }


}
