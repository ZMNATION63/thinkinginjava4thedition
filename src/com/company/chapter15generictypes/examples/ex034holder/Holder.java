package com.company.chapter15generictypes.examples.ex034holder;

/**
 * Класс Holder содержит метод set(), который получает T; метод get(), который получает т, и метод equals(),
 * который получает Object. Как вы уже видели, при создании объекта Holder<Apple> вы не сможете выполнить
 * его восходящее преобразование в Holder<Fruit>, но можно повыситьдо Holder<? extends Fruit>. Если вызвать get(),
 * метод вернет Fruit — это максимальная информация, которой он располагает при наличии ограничения «любой класс,
 * расширяющий Fruit».
 *
 * @param <T>
 */
public class Holder<T> {
    private T value;

    public Holder() {
    }

    public Holder(T val) {
        value = val;
    }

    public void set(T val) {
        value = val;
    }

    public T get() {
        return value;
    }

    public boolean equals(Object obj) {
        return value.equals(obj);
    }


    public static void main(String[] args) {
        Holder<Apple> Apple = new Holder<>(new Apple());
        Apple d = Apple.get();
        Apple.set(d);

        // Holder<Fruit> Fruit = Apple; // Не может выполнить
        // восходящее преобразование
        Holder<? extends Fruit> fruit = (Holder<? extends Fruit>) Apple; // 0K
        Fruit p = fruit.get();
        d = (Apple) fruit.get(); // Возвращает 'Object'
        try {
            Orange с = (Orange) fruit.get(); // Без предупреждений
        } catch (Exception e) {
            System.out.println(e);
        }

        // fruit.set(new Apple()); // Вызов set() невозможен
        // fruit.set(new Fruit()); // Вызов set() невозможен
        System.out.println(fruit.equals(d)); // 0K
    }
}
