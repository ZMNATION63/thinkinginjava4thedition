package com.company.chapter12errorhandlingandexceptions.tasks.task2;

//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 6. (1) Создайте два класса исключения, каждый из которых автоматически выводит информацию о себе. Продемонстрируйте, что эти классы работают.
 * <p>
 */
public class MainTask6 {
    public static void main(String[] args) {

        try {
            try {
                throw new Task6Exception2("Вызываем TaskException2");
            } catch (Task6Exception2 exception2) {
                System.out.println(exception2.fillInStackTrace());
            }

            throw new Task6Exception1("Вызываем TaskException1");

        } catch (Task6Exception1 ex1) {
            System.err.println(ex1.fillInStackTrace());
        }
    }

}
/**
 * Так понял, что нужно реализовать 2 класса, которые будут наследоваться от одного родителя, изменить стоит только инфо
 * о классе, которое передается из самого класса. В свою очередь мы эту информацию представляем в классе
 */