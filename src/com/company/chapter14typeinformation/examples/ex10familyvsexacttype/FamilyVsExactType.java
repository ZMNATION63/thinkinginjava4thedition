package com.company.chapter14typeinformation.examples.ex10familyvsexacttype;

/**
 * Метод test() осуществляет проверку типов полученного объекта, используя для этого
 * обе формы оператора instanceof. Затем он получает ссылку на объект Class и использу
 * операцию сравнения ссылок == и метод equals(), чтобы проверить объекты Class на
 * равенство. Пример доказывает справедливость утверждения о том, что действие оператора
 * instanceof и метода isInstance() одинаково.
 */
class Base {
}

class Derived extends Base {
}

public class FamilyVsExactType {
    static void test(Object x) {
        System.out.println("Tecтируем x типа " + x.getClass());
        System.out.println("x instanceof Base " + (x instanceof Base));
        System.out.println("x instanceof Derived " + (x instanceof Derived));
        System.out.println("Base.isInstance(x) " + Base.class.isInstance(x));
        System.out.println("Derived.isInstance(x) " + Derived.class.isInstance(x));
        System.out.println("x.getClass() == Base.class " + (x.getClass() == Base.class));
        System.out.println("x.getClass() == Derived.class " + (x.getClass() == Derived.class));
        System.out.println("x.getClass().equals(Base.class)) " + (x.getClass().equals(Base.class)));
        System.out.println("x.getClass().equals(Derived.class)) " + (x.getClass().equals(Derived.class)));
    }

    public static void main(String[] args) {
        test(new Base());
        System.out.println("");
        test(new Derived());
    }
}