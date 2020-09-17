package com.company.chapter20annotations.examples.ex04;

import com.company.chapter20annotations.examples.ex01.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class AtUnitExample2 {
    public String methodOne() {
        return "This is methodOne";
    }

    public int methodTwo() {
        System.out.println("This is methodTwo");
        return 2;
    }

    @Test
    void assertExample() {
        assert methodOne().equals("This is methodOne");
    }

    @Test
    void assertFailureExample() {
        assert 1 == 2 : "What a surprise!";
    }

    @Test
    void exceptionExample() throws IOException {
        new FileInputStream("nofile.txt"); // Возбуждает исключение
    }

    @Test
    boolean assertAndReturn() {
// Assert с сообщением:
        assert methodTwo() == 2 : "methodTwo must equal 2";
        return methodOne().equals("This is methodOne");
    }

    public static void main(String[] args) throws Exception {
        OSExecute.command(
                "java annotations.ex.ex04 AtUnitExample2");
    }
}