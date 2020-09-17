package com.company.chapter21parallelexecution.examples.ex021serialnumberchecker;

public class SerialNuraberGenerator {
    private static volatile int serialNumber = 0;

    public static synchronized int nextSerialNumber() {
        return serialNumber++;
    }
}
