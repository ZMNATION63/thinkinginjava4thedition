package com.company.chapter15generictypes.tasks.task08;


import java.util.Iterator;
import java.util.Random;

public class FilmMaker implements Film<Characters>, Iterable<Characters> {
    private Class[] types = {BadCharacters.class, GoodCharacter.class,};
    private static Random rand = new Random(47);

    public FilmMaker() {
    }

    // Для перебора:
    private int size = 0;

    public FilmMaker(int sz) {
        size = sz;
    }

    public Characters next() {
        try {
            return (Characters) types[rand.nextInt(types.length)].newInstance();
            // Сообщить программисту об ошибках во время выполнения:
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CharactersIterator implements Iterator<Characters> {
        int count = size;

        public boolean hasNext() {
            return count > 0;
        }

        public Characters next() {
            count--;
            return FilmMaker.this.next();
        }

        public void remove() { // Не реализован
            throw new UnsupportedOperationException();
        }
    }

    ;

    public Iterator<Characters> iterator() {
        return new CharactersIterator();
    }

    public static void main(String[] args) {
        FilmMaker gen = new FilmMaker();

        for (int i = 0; i < 5; i++)
            System.out.println(gen.next());

        for (Characters c : new FilmMaker(5))
            System.out.println(c);
    }
}
