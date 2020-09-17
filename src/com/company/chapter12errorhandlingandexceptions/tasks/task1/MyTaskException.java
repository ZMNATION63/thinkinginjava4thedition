package com.company.chapter12errorhandlingandexceptions.tasks.task1;

public class MyTaskException extends Exception {
    private String rootCause;

    public MyTaskException() {
    }

    MyTaskException(String s) {
        super(s);
    }

}
