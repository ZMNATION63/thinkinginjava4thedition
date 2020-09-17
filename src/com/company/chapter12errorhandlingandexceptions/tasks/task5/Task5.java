package com.company.chapter12errorhandlingandexceptions.tasks.task5;

/**
 * 10. (2) Создайте класс с двумя методами, f() и g(). В методе g() возбудите исключение
 * того типа, который вы определили ранее. В методе f() вызовите g(), перехватите
 * исключение и в предложении catch возбудите новое исключение (второй тип, который вам необходимо определить).
 * Проверьте этот код в методе main()'
 * <p>
 * 11. (1) Повторите предыдущее упражнение, но на этот раз в предложении catch преобразуйте исключение метода g()
 * в RuntimeException.
 */
public class Task5 {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        someClass.f();

    }
}
