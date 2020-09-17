package com.company.chapter07reusingclasses.examples.e014neizmenyaemieargumenty;

public class FinalArguments {
    void with(final Gizmo g) {
        // g = new Gizmo()j // Запрещено -- g объявлено final
    }

    void without(Gizmo g) {
        g = new Gizmo(); // Разрешено -- g не является final
        g.spin();
    }

    // void f( fin a l int i) { i++; } Нельзя изменят^
    // неизменные примитивы доступны только для чтения:
    int g(final int i) {
        return i + 1;
    }
}
