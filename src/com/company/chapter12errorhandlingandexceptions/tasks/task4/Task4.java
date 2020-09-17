package com.company.chapter12errorhandlingandexceptions.tasks.task4;

/**
 * 9. (2) Создайте три новых типа исключений.
 * Напишите класс с методом, возбуждающим каждое из них.
 * В методе main() вызовите этот метод, используя одно предложение catch, способное перехватить все три исключения.
 * <p>
 * 13. (2) Измените упражнение 9, добавив туда блок f i n a l l y .
 * Проверьте, что блок выполняется даже в случае возбуждения NullPointerException .
 */
public class Task4 {
    public static void main(String[] args) /*throws SecondException, FirstException*/ {
        try {
            SpecilClass specilClass = new SpecilClass();
            specilClass.f1().printStackTrace();
            specilClass.f2().printStackTrace();
        } catch (FirstException | SecondException se2) {
            se2.printStackTrace();
        } catch (NullPointerException a) {
            a.printStackTrace();
        } finally {
            System.out.println("Этот блок выполняется всегда!");
        }
    }
}
/**
 * Цель - научиться ловить 2 иболее исключений в одно блоке catch
 * Полезно - тем, что минизирует громадные конструкции блока
 */