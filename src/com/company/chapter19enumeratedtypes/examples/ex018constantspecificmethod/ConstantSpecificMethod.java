package com.company.chapter19enumeratedtypes.examples.ex018constantspecificmethod;

import java.text.DateFormat;
import java.util.Date;

/**
 * Перечисления^уа обладают очень интересной возможностью, которая позволяет назначить каждому экземпляру
 * перечисления свое поведение. Для этого следует определить один или несколько абстрактных методов в составе
 * перечисления, а затем определить методы для каждого экземпляра перечисления.
 */
public enum ConstantSpecificMethod {
    DATE_TIME {
        String getInfo() {
            return DateFormat.getDateInstance().format(new Date());
        }
    },
    CLASSPATH {
        String getInfo() {
            return System.getenv("CLASSPATH");
        }
    },
    VERSION {
        String getInfo() {
            return System.getProperty("java.version");
        }
    };

    abstract String getInfo();

    public static void main(String[] args) {
        for (ConstantSpecificMethod csm : values()) {
            System.out.println(csm.getInfo());
        }
    }
}
