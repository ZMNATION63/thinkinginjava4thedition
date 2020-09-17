package com.company.chapter15generictypes.examples.ex029listofgenerics;

public class ArrayOfGeneric {
    static final int SIZE = 100;
    static Generic<Integer>[] gia;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Компилируется; выдает ClassCastException:
        //! gia = (Generic<Integer>[])new Object[SIZE];
        // Тип времени выполнения - низкоуровневый (стертый) тип:

        gia = (Generic<Integer>[]) new Generic[SIZE];
        System.out.println(gia.getClass().getSimpleName());
        gia[0] = new Generic<Integer>();

        //! gia[l] = new Object(); // Ошибка времени компиляции
        // Обнаруживается несоответствие типов:
        //! gia[2] = new Generic<Double>();
    }
}
