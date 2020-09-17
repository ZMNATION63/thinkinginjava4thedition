package com.company.chapter15generictypes.examples.ex024arraymaker;

/**
 * Моздав экземпляр обобщенного класса и добавив в него геттор и сеттор
 * можно генерить элементы типа экземпляра обобщенного класса, удобно для создания переменных динамического типа
 *
 * @param <T>
 */

public class GenericHolder<T> {
    private T obj;

    public void set(T obj) {
        this.obj = obj;
    }

    public T get() {
        return obj;
    }

    public static void main(String[] args) {
        GenericHolder<String> holder = new GenericHolder<String>();
        holder.set("Item");
        String s = holder.get();
        System.out.println(s);
    }
}
