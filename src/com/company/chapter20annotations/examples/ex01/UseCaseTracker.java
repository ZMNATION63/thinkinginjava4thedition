package com.company.chapter20annotations.examples.ex01;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Ниже приведен очень простой обработчик аннотаций, который читает класс PasswordUtils,
 * снабженный аннотациями, и использует отражение для поиска меток @UseCase.
 * По списку значений id он выводит перечень найденных сценариев использования
 */
public class UseCaseTracker {
    public static void
    trackUserCase(List<Integer> useCases, Class<?> cl) {
        for (Method m : cl.getDeclaredMethods()) {
            UseCase uc = m.getAnnotation(UseCase.class);
            if (uc != null) {
                System.out.println("Found Use Case: " + uc.id() +
                        " " + uc.description());
                useCases.remove(new Integer(uc.id()));

            }

        }
        for (int i : useCases) {
            System.out.println("Warning: Missing use case-" + i);

        }
    }

    public static void main(String[] args) {
        List<Integer> useCase = new ArrayList<Integer>();
        Collections.addAll(useCase, 47, 48, 49, 50);
        trackUserCase(useCase, PasswordUtils.class);
    }
}
