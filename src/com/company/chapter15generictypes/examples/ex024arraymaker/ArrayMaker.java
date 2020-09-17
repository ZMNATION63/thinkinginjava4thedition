package com.company.chapter15generictypes.examples.ex024arraymaker;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Создаем обощенный массив, перед добавлением элементов приводим наугад к нужному нам типу, без проверки с варнингом
 * успешно подавляем его
 * <p>
 * Метод Array.newlnstance() рекомендуется использовать для создания массивов в обобщениях.
 *
 * @param <T>
 */
public class ArrayMaker<T> {
    private Class<T> kind;

    public ArrayMaker(Class<T> kind) {
        this.kind = kind;
    }

    @SuppressWarnings("unchecked")
    T[] create(int size) {
        return (T[]) Array.newInstance(kind, size);
    }

    public static void main(String[] args) {
        ArrayMaker<String> stringMaker = new ArrayMaker<String>(String.class);
        String[] stringArray = stringMaker.create(10);
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = "El_" + (i + 1);
        }
        System.out.println(Arrays.toString(stringArray));
    }
}