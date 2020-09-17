package com.company.chapter19enumeratedtypes.examples.ex022input;

import java.util.Random;

public enum Input {
    NIKLE(5), DIME(10), QUARTER(25), DOLLAR(100),
    TOOTHPASTE(200), CHIPS(75), SODA(100), SOAP(50),
    ABORT_TRANSACTION {
        public int amount() {
            throw new RuntimeException("ABORT.amount()");
        }
    },
    STOP {
        public int amount() { // Запрещено
            throw new RuntimeException("SHUT_D0WN.amount()");
        }
    };
    int value;

    Input(int value) {
        this.value = value;
    }

    Input() {
    }

    int amount() {
        return value;
    }

    static Random random = new Random(47);

    public static Input randomSelection() {
        return values()[random.nextInt(values().length - 1)];
    }
}
