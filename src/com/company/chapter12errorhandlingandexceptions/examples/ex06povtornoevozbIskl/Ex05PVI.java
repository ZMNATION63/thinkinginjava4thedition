package com.company.chapter12errorhandlingandexceptions.examples.ex06povtornoevozbIskl;

public class Ex05PVI {
    public static void f() throws Exception {
        System.out.println("Co3flaHne исключения в f()");
        throw new Exception("B036yxAeHO из fQ");
    }

    public static void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("B методе g()je.printStackTrace()");
            e.printStackTrace(System.out);
            throw e;
        }
    }

    public static void h() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("B методе h(),e.printStackTrace()");
            e.printStackTrace(System.out);
            throw (Exception) e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
        try {
            h();
        } catch (Exception e) {
            System.out.println("main:printStackTrace() ");
            e.printStackTrace(System.out);
        }
    }

}
