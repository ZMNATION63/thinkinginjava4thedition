package com.company.chapter11objectcollections.examples.ex016priorityqueue;

import java.util.*;

/**
 * Термин FIFO описывает самую типичную дисциплину очереди — правило, которое
 * для группы элементов очереди определяет, какой элемент будет извлечен следующим
 * В приоритетной очереди PriorityQueue следующим извлекается элемент, обладающий
 * наивысшим приоритетом.
 * <p>
 * Как видите, дубликаты допустимы, а наименьшие значения обладают наивысшим
 * приоритетом (в случае S t r i n g пробелы также считаются значениями, которые обладают более высоким приоритетом, чем буквы).
 * Для демонстрации изменения порядка
 * приоритетной очереди посредством передачи собственного объекта C o m p a r a t o r третий
 * вызов конструктора P r i o r i t y Q u e u e < I n t e g e r > и второй вызов P r i o r i t y Q u e u e < S t r i n g >
 * использует обратный компаратор, полученный при вызове C o l l e c t i o n s . r e v e r s e O r d e r ( )
 */
public class PriorityQueueDemo {
    public static void printQ(Queue queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        Random rand = new Random(47);

        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(rand.nextInt(i + 10));
        }
        printQ(priorityQueue);

        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        priorityQueue = new PriorityQueue<Integer>(ints);
        printQ(priorityQueue);

        priorityQueue = new PriorityQueue<Integer>(ints.size(), Collections.reverseOrder());
        priorityQueue.addAll(ints);
        printQ(priorityQueue);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringPQ = new PriorityQueue<String>(strings);
        printQ(stringPQ);

        stringPQ = new PriorityQueue<String>(strings.size(), Collections.reverseOrder());
        stringPQ.addAll(strings);
        printQ(stringPQ);

        Set<Character> charSet = new HashSet<Character>();
        for (char c : fact.toCharArray()) {
            charSet.add(c);
        }
        PriorityQueue<Character> characterPQ = new PriorityQueue<Character>(charSet);
        printQ(characterPQ);
    }

}
