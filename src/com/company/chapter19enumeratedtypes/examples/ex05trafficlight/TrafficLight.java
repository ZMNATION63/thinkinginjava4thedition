package com.company.chapter19enumeratedtypes.examples.ex05trafficlight;

import static com.company.chapter19enumeratedtypes.examples.ex05trafficlight.Signal.RED;

/**
 * Одна из самых удобных возможностей перечисления связана с их использованием в командах switch.
 * Обычно switch работает только с целочисленными значениями, но перечисления имеют четко определенный
 * целочисленный порядок, а очередность экземпляров может быть получена методом ordinal()
 */
enum Signal {GREEN, YELLOW, RED,}

public class TrafficLight {
    Signal color = RED;

    public void change() {
        switch (color) {
            case RED:
                color = Signal.GREEN;
                break;
            case GREEN:
                color = Signal.YELLOW;
                break;
            case YELLOW:
                color = RED;
                break;
        }
    }

    public String toString() {
        return "The traffic light is " + color;
    }

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();
        for (int i = 0; i < 7; i++) {
            System.out.println(t);
            t.change();
        }

    }
}
