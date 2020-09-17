package com.company.chapter21parallelexecution.examples.ex013joining;

class Sleeper extends Thread {
    private int duration;

    public Sleeper(String name, int sleepTime) {
        super(name);
        duration = sleepTime;
        start();
        /**
         * не самый лучший вариант для создания потока, тк данные могут быть заняты другим
         * потоком который начал работвть в момент вызова этого потока
         */
    }

    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(getName() + " was isInterrupted. isInterrupted(): " + isInterrupted());
            return;
        }
        System.out.println(getName() + " has awaked");
    }

}

class Joiner extends Thread {
    private Sleeper sleeper;

    public Joiner(String name, Sleeper sleeper) {
        super(name);
        this.sleeper = sleeper;
        start();
    }

    @Override
    public void run() {
        try {
            sleeper.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted ");
        }
        System.out.println(getName() + " join completed");
    }
}

public class Joining {
    public static void main(String[] args) {
        Sleeper sleeper = new Sleeper("Sleeper", 1500);
        Sleeper grumpy = new Sleeper("Grumpy", 1500);
        Joiner dopey = new Joiner("Dopey", sleeper);
        Joiner doc = new Joiner("Doc", grumpy);

    }
}
