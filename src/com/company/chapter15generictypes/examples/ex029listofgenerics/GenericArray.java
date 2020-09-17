package com.company.chapter15generictypes.examples.ex029listofgenerics;

public class GenericArray<T> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArray(int sz) {
        array = (T[]) new Object[sz];
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    // Предоставляет нижележащее представление:
    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArray<Integer> gai = new GenericArray<Integer>(10);

        // Приводит к возбуждению ClassCastException:
        //! Integer[] ia = gai.rep();
        // А это допустимо:
        Object[] oa = gai.rep();
    }
}