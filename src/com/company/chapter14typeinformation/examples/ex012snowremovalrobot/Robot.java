package com.company.chapter14typeinformation.examples.ex012snowremovalrobot;


import com.sun.xml.internal.ws.wsdl.writer.document.Operation;

import java.util.*;

public interface Robot {
    String name();
    String model();
    List<Operation> operations();
    class Test {
//        public static void test(Robot r) {
//            if(r instanceof Null)
//                System.out.println("[Null Robot]");
//            System.out.println("Robot name: " + r.name());
//            System.out.println("Robot model: " + r.model());
//            for(Operation operation : r.operations()) {
//                System.out.println(operation.description());
//                operation.command();
//            }
        }
    }

