package com.company.chapter10innerclasses.examples.example015callbacks;

/**
 * // Использование внутренних классов
 * // для реализации обратных вызовов
 * <p>
 * Этот пример также показывает, какая существует разница при реализации интерфейса внешним
 * или внутренним классом. Класс Calleel — наиболее очевидное решение
 * задачи с точки зрения написания программы. Класс Callee2 наследует от класса
 * MyIncrement, в котором уже есть метод increment(), выполняющий действие, никак не
 * связанное с тем, что ожидает от него интерфейс lncrementable.
 */
interface Incrementable {
    void increment();
}

class Calleel implements Incrementable {
    private int i = 0;

    public void increment() {
        i++;
        System.out.println(i);
    }
}

class MyIncrement {
    public void increment() {
        System.out.println("Другая операция");
    }

    public static void f(MyIncrement mi) {
        mi.increment();
    }
}

// Если ваш класс должен вызывать метод increment()
// по-другому> необходимо использовать внутренний класс:
class Callee2 extends MyIncrement {
    private int i = 0;

    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }

    private class Closure implements Incrementable {
        public void increment() {
// Указывается метод внешнего класса> иначе
// возникнет бесконечная рекурсия:
            Callee2.this.increment();
        }
    }

    Incrementable getCallbackReference() {
        return new Closure();
    }
}

class Caller {
    private Incrementable callbackReference;

    Caller(Incrementable cbh) {
        callbackReference = cbh;
    }

    void go() {
        callbackReference.increment();
    }
}

public class Callbacks {
    public static void main(String[] args) {
        Calleel cl = new Calleel();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Caller callerl = new Caller(cl);
        Caller caller2 = new Caller(c2.getCallbackReference());
        callerl.go();
        callerl.go();
        caller2.go();
        caller2.go();
    }
}