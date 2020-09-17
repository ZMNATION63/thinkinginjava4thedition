package com.company.chapter11objectcollections.examples.ex015ochered;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Класс LinkedList содержит несколько методов для поддержки поведения очередей
 * и реализует интерфейс Queue; соответственно, LinkedList может использоваться как
 * реализация Queue. Восходящее преобразование LinkedList в Queue позволяет использовать в этом примере методы, специфические для Queue:
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++)
            queue.offer(rand.nextInt(i + 10));
        System.out.println(queue);
        Queue<Character> qc = new LinkedList<Character>();
        for (char c : "Brontosaurus".toCharArray())
            qc.offer(c);
        System.out.println(qc);
    }
}
