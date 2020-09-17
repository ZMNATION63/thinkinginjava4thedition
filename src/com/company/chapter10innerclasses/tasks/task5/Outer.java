package com.company.chapter10innerclasses.tasks.task5;

/**
 * 5. (1) Создайте класс с внутренним классом. В отдельном классе создайте экземпляр
 * внутреннего класса.
 */
public class Outer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    Inner makeInner() {
        return new Inner();
    }

    class Inner {

        void setManeOuter(String name) {
            setName(name);
        }
    }
}
