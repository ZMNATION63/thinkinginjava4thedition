package com.company.chapter15generictypes.examples.ex027factoryconstraint;

/**
 * Это решение — всего лишь разновидность передачи Class<T>. В обоих решениях используются фабрики;
 * просто Class<T> — встроенный объект-фабрика, а в приведенном решении фабрика создается явно.
 * Но в этом случае вы можете пользоваться преимуществами проверки на стадии компиляции.
 */
public class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.Factory());
    }
}
