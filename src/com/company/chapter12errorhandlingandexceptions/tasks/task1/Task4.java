package com.company.chapter12errorhandlingandexceptions.tasks.task1;

/**
 * * 4. (2) Создайте ваш собственный класс исключения, используя ключевое слово
 * * extends . Напишите конструктор, получающий строковый аргумент, и сохраните этот
 * * аргумент внутри объекта по ссылке на String . Напишите метод, который выводит
 * * эту строку. Подсоедините новый блок try - catch для проверки нового исключения.
 * * <p>
 */
public class Task4 {
    public static void main(String[] args) {
        TestClassEx testClassEx4 = new TestClassEx();
        try {
            testClassEx4.f1();
            //throw new MyTaskException ("a");
        } catch (MyTaskException em) {
            System.err.println("Ловим ВОТ ЭТО исключение в задании 4");
            System.err.println(em.fillInStackTrace());
        }
    }
}
/*
 * На сколько понял - в этом задании необходимо проверить работоспособность своего исключения, которое необходима
 * самому вызвать, прольза в том что можно создавать любое исключение на свое усмотрение
 *
 * */