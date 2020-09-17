package com.company.chapter12errorhandlingandexceptions.tasks.task1;

import java.sql.SQLException;

public class TestClassEx {
    public static String str;

    public void f() throws SQLException {
    }

    public static void f1() throws MyTaskException {
        System.out.println("Возбуждает исключение MyTaskException");
        System.out.println(str);
        //throw new MyTaskException ();
    }
}
