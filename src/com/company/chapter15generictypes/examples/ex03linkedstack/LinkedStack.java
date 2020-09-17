package com.company.chapter15generictypes.examples.ex03linkedstack;

/**
 * 5. (2) Удалите параметр-тип класса Node и измените остальной код LinkedStack.java так,
 * чтобы показать, что для внутреннего класса доступны обобщенные параметры-типы
 * внешнего класса.
 *
 * @param <T>
 */
public class LinkedStack<T> {
    /*    private static class Node<U> {
            U item;
            Node<U> next;

            Node() {
                item = null;
                next = null;
            }

            Node(U item, Node<U> next) {
                this.item = item;
                this.next = next;
            }

            boolean end() {
                return item == null && next == null;
            }
        }*/
    private static class Node<T> {
        T item;
        Node<T> next;

        Node() {
            item = null;
            next = null;
        }

        Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }


        public LinkedStack<T> f1STR(T ty, LinkedStack<T> list) {
            LinkedStack<T> lss = new LinkedStack<T>();
            for (String s : "Phasers on stun!".split(" "))
                lss.push((T) s);
            String s;
            while ((s = (String) lss.pop()) != null)
                System.out.println(s);
            return lss;
        }

    }

    private Node<T> top = new Node<T>(); // Сторож

    public void push(T item) {
        top = new Node<T>(item, top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end())
            top = top.next;
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<String>();
        Node<String> k = new Node<>();
        k.f1STR("Phasers on stun!", lss);


        /*for (String s : "Phasers on stun!".split(" "))
            lss.push(s);
        String s;
        while ((s = lss.pop()) != null)
            System.out.println(s);
*/
    }
}
