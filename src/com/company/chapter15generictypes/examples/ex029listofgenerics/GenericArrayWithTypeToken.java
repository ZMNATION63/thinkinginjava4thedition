package com.company.chapter15generictypes.examples.ex029listofgenerics;
/**
 * Маркер типа class<T> передается конструктору для восстановления последствий стирания,
 * чтобы мы могли создать фактический тип нужного массива, хотя предупреждения от приведения
 * типа приходится подавлять аннотацией @SuppressWarnings. После
 * получения фактического типа можно вернуть его и получить нужные результаты, как
 * показано в main(). Типом массива на стадии выполнения является точный тип T[].
 */

import java.lang.reflect.Array;

public class GenericArrayWithTypeToken<T> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArrayWithTypeToken(Class<T> type, int sz) {
        array = (T[]) Array.newInstance(type, sz);
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    // Предоставляет нижележащее представление:
    public T[]

    rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArrayWithTypeToken<Integer> gai = new GenericArrayWithTypeToken<Integer>(Integer.class, 10);
        // Теперь работает:
        Integer[] ia = gai.rep();
    }
}