package com.company.chapter12errorhandlingandexceptions.tasks.task1;

//import static misha.newpac.Print.printplus;

import java.sql.SQLException;

/**
 * 1. (2) Создайте класс с методом main( ) , возбуждающим исключение типа Exception из
 * блока try . Задайте в конструкторе для Exception строковый аргумент. Перехватите
 * исключение в блоке catch и распечатайте текст аргумента. Добавьте блок finally
 * и выведите сообщение как доказательство его выполнения.
 * <p>
 * 2. ( 1) Определите ссылку на объект и присвойте ей значение null. Попробуйте вызвать
 * метод объекта, пользуясь этой ссылкой. Потом вставьте этот код в блок try-catch
 * и перехватите исключение.
 * <p>
 * 3. ( 1) Напишите код, который генерирует и перехватывает исключение ArraylndexOut -
 * OfBoundsException .
 * <p>
 * <p>
 * 5. (3) Создайте собственную реализацию модели возобновления, используя цикл
 * w h ile , который выполняется до тех пор, пока исключение не перестанет выдаваться.
 */
public class Task1 {


    public static void main(String[] args) throws SQLException {
        TestClassEx testClassEx = null; //java.lang.NullPointerException
        int[] arr = new int[30];
        try {
            arr[35] = 1520; //java.lang.ArrayIndexOutOfBoundsException:

            testClassEx.f(); //java.lang.NullPointerException

            //throw new Exception ();

//        } catch (ArrayIndexOutOfBoundsException e1) {
//            System.out.println ("Вот это мы ловим во задании 3");
//            System.out.println (e1.fillInStackTrace ());
            //printplus ();
        } catch (NullPointerException ex) {
            System.out.println("Вот это мы ловим во задании 2");
            System.out.println(ex.fillInStackTrace());
            //printplus ();
//        } catch (SQLException e) {
//            System.out.println ("Ловим ВОТ ЭТО исключение в задании 1");
//            System.err.println (e.fillInStackTrace ());
            //printplus ();
//        } catch (Exception e) {
//            e.printStackTrace();
        } finally {
            System.out.println("Блок finally выполняется в любом случае");
        }
    }
}
/*
 * пользоа от этого задания в том, что мы можем обработать не проверяемые компилятором ичключения,
 * try - попытайся
 * catch - схвати это исключение
 * finally - выполняется вне зависимости отвыполнения кода
 * поиск исключений - от частного к общему.
 * */
