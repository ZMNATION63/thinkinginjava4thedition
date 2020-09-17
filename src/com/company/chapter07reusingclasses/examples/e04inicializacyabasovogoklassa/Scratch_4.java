package com.company.chapter07reusingclasses.examples.e04inicializacyabasovogoklassa;

/**
 * 3. (2) Докажите предыдущее утверждение.
 * <p>
 * 4. (2) Докажите, что конструкторы базового класса: (а) всегда вызываются и (б) всегда
 * вызываются перед исполнением конструкторов производного класса.
 * Вызовы конструкторов при проведении наследования
 */
class Scratch_4 {
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
        x.testArt();
    }
}