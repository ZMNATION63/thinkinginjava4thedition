package com.company.chapter08polymorphism.tasks.task01poteryanniytipobekta;

public class Rider {
    /**
     * p u b l ic s t a t i c v o id tu n e (Wind i ) {
     * i . p la y ( N o t e . MIDDLE C ) ;
     * }
     * p u b lic s t a t i c v o id t u n e ( Stringed i ) {
     * i . p la y ( N o t e . MIDDLE_C) ;
     * }
     */
    public static void riderRede(Cycleс r) {
        r.ride();
    }

    public static void riderRede(Tricycle r) {
        r.ride();
    }

    public static void riderRede(Unicycle r) {
        r.ride();
    }

    public static void riderRede(Bicycle r) {
        r.ride();
    }
}
