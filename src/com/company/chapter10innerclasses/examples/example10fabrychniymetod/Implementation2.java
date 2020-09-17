package com.company.chapter10innerclasses.examples.example10fabrychniymetod;

public class Implementation2 implements Service {
    private Implementation2() {
    }

    public void methodl() {
        System.out.println("Implementation2 methodl");
    }

    public void method2() {
        System.out.println("Implementation2 method2");
    }

    public static ServiceFactory factory =
            new ServiceFactory() {
                public Service getService() {
                    return new Implementation2();
                }
            };
}
