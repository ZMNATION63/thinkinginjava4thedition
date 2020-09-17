package com.company.chapter10innerclasses.examples.example10fabrychniymetod;

public class Implementationl implements Service {
    private Implementationl() {
    }

    public void methodl() {
        System.out.println("Implementationl methodl");
    }

    public void method2() {
        System.out.println("Implementationl method2");
    }

    public static ServiceFactory factory =
            new ServiceFactory() {
                public Service getService() {
                    return new Implementationl();
                }
            };
}
