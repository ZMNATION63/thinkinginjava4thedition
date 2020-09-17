package com.company.chapter20annotations.examples.ex01;

/**
 * Если не считать знака @, определение g T e s t сильно напоминает определение пустого
 * интерфейса. Определение аннотации также требует мета-аннотаций @ T a r g e t и 0 R e t e n -
 * t i o n . ^ T a r g e t определяет, к чему может применяться данная аннотация (например,
 * к методу или к полю), а g R e t e n t i o n определяет, доступны ли аннотации в исходном
 * коде (S O U R CE ), в файлах классов ( C L A S S ) или во время выполнения (RU N TIM E)
 */
public class Testable {
    public void execute() {
        System.out.println("Executing..");
    }

    @Test
    void testExecuting() {
        execute();
    }
}
