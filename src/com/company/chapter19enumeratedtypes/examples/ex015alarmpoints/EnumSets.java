package com.company.chapter19enumeratedtypes.examples.ex015alarmpoints;

import java.util.EnumSet;

import static com.company.chapter19enumeratedtypes.examples.ex015alarmpoints.AlarmPoints.*;

//import static chapter019enumeratedtypes.ex.ex015alarmpoints.AlarmPoints.*;

/**
 * Главной целью при проектировании класса EnumSet была высокая скорость, потому что он
 * должен успешно конкурировать с наборами битовых флагов
 * одним значением long, которое интерпретируется как битовый вектор, поэтому все операции
 * выполняются исключительно быстро и эффективно.
 */
public class EnumSets {
    public static void main(String[] args) {
        EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);
        // set
        points.add(BATHROOM);
        System.out.println(points);
        points.addAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
        System.out.println(points);
        points = EnumSet.allOf(AlarmPoints.class);
        points.removeAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
        System.out.println(points);
        points.removeAll(EnumSet.range(OFFICE1, OFFICE4));
        System.out.println(points);
        points = EnumSet.complementOf(points);
        System.out.println(points);

    }
}
