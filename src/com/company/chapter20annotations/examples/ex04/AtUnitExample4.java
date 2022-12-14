package com.company.chapter20annotations.examples.ex04;

import com.company.chapter20annotations.examples.ex01.Test;

import java.util.*;

import static jdk.nashorn.internal.objects.Global.print;

public class AtUnitExample4 {
    static String theory = "All brontosauruses " +
            "are thin at one end, much MUCH thicker in the " +
            "middlej and then thin again at the far end.";
    private String word;
    private Random rand = new Random(); // Случайная раскрутка

    public AtUnitExample4(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public String scrambleWord() {
        List<Character> chars = new ArrayList<Character>();
        for (Character c : word.toCharArray()) chars.add(c);
        Collections.shuffle(chars, rand);
        StringBuilder result = new StringBuilder();
        for (char ch : chars) result.append(ch);
        return result.toString();
    }

    @TestProperty
    static List<String> input =
            Arrays.asList(theory.split(" "));
    @TestProperty
    static Iterator<String> words = input.iterator();

    @TestObjectCreate
    static AtUnitExample4 create() {
        if (words.hasNext())
            return new AtUnitExample4(words.next());
        else
            return null;
    }

    @Test
    boolean words() {
        print(" " + getWord() + " ");
        return getWord().equals("are");
    }

    @Test
    boolean scramblel() {
// Замена инициализацией конкретным значением // для получения воспроизводимых результатов: rand = new Random(47);
        print(" " + getWord() + " ");
        String scrambled = scrambleWord();
        print(scrambled);
        return scrambled.equals("lAl");
    }

    @Test
    boolean scramble2() {
        rand = new Random(74);
        print(" " + getWord() + " ");
        String scrambled = scrambleWord();
        print(scrambled);
        return scrambled.equals("tsaeborornussu");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("starting");
        OSExecute.command(
                "java net.mindview.atunit.AtUnit AtUnitExample4");
    }
}