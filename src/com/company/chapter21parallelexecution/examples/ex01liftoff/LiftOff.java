package com.company.chapter21parallelexecution.examples.ex01liftoff;

public class LiftOff implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff") + "), ";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(status());
            Thread.yield();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        /**
         * выполнение в один поток
         */
//        LiftOff liftOff = new LiftOff(10);
//        liftOff.run();

        /**
         * ДДля выоленеия в несколько потоков необходимо
         * создать класс поток Thread и запустить задачу
         */
        Thread thread = new Thread(new LiftOff(10));
        thread.start();
        /**
         * Иллюстрация параллельности вычислений
         */
        System.out.println("Ожидаем вывода Liftoff ");
    }
}
