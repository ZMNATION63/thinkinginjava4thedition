package com.company.chapter19enumeratedtypes.examples.ex017enummaps;

import com.company.chapter19enumeratedtypes.examples.ex015alarmpoints.AlarmPoints;

import java.util.EnumMap;
import java.util.Map;

import static com.company.chapter19enumeratedtypes.examples.ex015alarmpoints.AlarmPoints.*;

/**
 * EnumMap — специализированная карта, ключи которой хранятся в одном перечислении.
 * Из-за ограничений, действующих для перечислений, внутренняя реализация EnumMap
 * может базироваться на массиве. Такие контейнеры работают исключительно быстро
 * <p>
 * Следующий пример демонстрирует использование паттерна проектирования «Команда».
 * Этот паттерн начинается с интерфейса, содержащего (обычно) один метод, и создает
 * несколько реализаций с разным поведением этого метода
 */
interface Command {
    void action();
}

public class EnumMaps {
    public static void main(String[] args) {
        EnumMap<AlarmPoints, Command> em = new EnumMap<AlarmPoints, Command>(
                AlarmPoints.class);
        em.put(KITCHEN, new Command() {
            public void action() {
                System.out.println("Kitchen fire!");
            }
        });
        em.put(BATHROOM, new Command() {
            public void action() {
                System.out.println("Bathroom alert!");
            }
        });
        for (Map.Entry<AlarmPoints, Command> e : em.entrySet()) {
            System.out.println(e.getKey() + ": ");
            e.getValue().action();
        }
        try {
            em.get(UTILITY).action();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
