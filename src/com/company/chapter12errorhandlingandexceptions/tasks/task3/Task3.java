package com.company.chapter12errorhandlingandexceptions.tasks.task3;

import com.company.chapter12errorhandlingandexceptions.tasks.task1.MyTaskException;
import com.company.chapter12errorhandlingandexceptions.tasks.task1.TestClassEx;

/**
 * 8. (1) Напишите класс с методом, который возбуждает исключение, созданное вами в упражнении 4.
 * Попробуйте откомпилировать его без спецификации исключений и посмотрите, что «скажет» компилятор.
 * После этого добавьте необходимую спецификацию исключений.
 * Протестируйте свой класс и его исключение внутри блока try-catch.
 */
public class Task3 {

    public static void main(String[] args) /*throws MyTaskException*/ {

//        try {
        try {
            TestClassEx testClassEx4 = new TestClassEx();
            testClassEx4.f1();
//            throw new MyTaskException();
        } catch (MyTaskException e) {
            System.out.println(e.fillInStackTrace());
        }
        //throw new MyTaskException ("a");
//        } catch (MyTaskException em) {
//            System.err.println ("Ловим ВОТ ЭТО исключение в задании 4");
//            System.err.println (em.fillInStackTrace ());
//        }
    }

}
/**
 * Понял, что нужно проэеспериментировать тип перехвата исключений
 * try - catch b и при объвлении класса
 * <p>
 * Посмотрел
 */