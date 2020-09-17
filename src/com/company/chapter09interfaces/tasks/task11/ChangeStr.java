package com.company.chapter09interfaces.tasks.task11;

public class ChangeStr implements Processor {
    @Override
    public void inName(String s) {
    }

    @Override
    public String name(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length - 1; i++) {
            char letter = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = letter;
            i++;
        }
        String res = "";
        for (char x : arr) {
            res = res + x;
        }
        return res;
    }

    @Override
    public Object process(Object input) {
        return null;
    }
}
