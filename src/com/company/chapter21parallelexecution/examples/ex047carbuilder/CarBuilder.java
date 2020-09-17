package com.company.chapter21parallelexecution.examples.ex047carbuilder;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

class Car {
    private final int id;
    private boolean engine = false;
    private boolean driveTrain = false;
    private boolean wheels = false;
    private boolean engage = false;

    public synchronized void addDriveTrain() {
        driveTrain = true;
    }

    public Car(int id) {
        this.id = id;
    }

    public Car() {
        this.id = -1;
    }

    public synchronized void addWheels() {
        wheels = true;
    }

    public synchronized String toString() {
        return "Car " + id + " [" + " engine: " + engine
                + " driveTrain: " + driveTrain
                + " wheels: " + wheels + " ]";
    }
}

class CarQueue extends LinkedBlockingQueue<Car> {
}

class ChassiBuilder implements Runnable {
    private CarQueue carQueue;
    private int counter = 0;

    public ChassiBuilder(CarQueue cq) {
        carQueue = cq;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                TimeUnit.MILLISECONDS.sleep(500);
                /**
                 * Создание рамы
                 */
                Car c = new Car(counter++);
                System.out.println("ChassisBuilder " + c);
                /**
                 * Помещение в очередь
                 */
                carQueue.put(c);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted ChassisBuilder ");
        }
        System.out.println("ChassisBuilder off");
    }
}

class Assembler implements Runnable {
    private CarQueue chassisQueue;
    private CarQueue finishingQueue;
    private Car car;
    private CyclicBarrier barrier = new CyclicBarrier(4);
    private RobotPool robotPool;

    public Assembler(CarQueue cq, CarQueue fq, RobotPool rp) {
        chassisQueue = cq;
        finishingQueue = fq;
        robotPool = rp;
    }

    public Car car() {
        return car;
    }

    public CyclicBarrier barrier() {
        return barrier;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                /**
                 * Блокировка пока рама не будет доступна
                 */
                car = chassisQueue.take();
                /**
                 * Привлечение роботов для выполнения работы
                 */
                robotPool.hire(EngineRobot.class, this);
                robotPool.hire(DriveTrainRobot.class, this);
                robotPool.hire(WheelRobot.class, this);
                barrier.await();
                /**
                 * пока роботы не закончат работу
                 * Машина помещается в очередь finishQueue
                 * для дальнейшей работы
                 */
                finishingQueue.put(car);
            }
        } catch (InterruptedException e) {
            System.out.println("Exiting Assembler via interrupt");
        } catch (BrokenBarrierException e) {
            /**
             * Исключение о котором нужно знать
             */
            throw new RuntimeException(e);
        }
        System.out.println("Assembler off");
    }
}

class Reporter implements Runnable {
    private CarQueue carQueue;

    public Reporter(CarQueue cq) {
        carQueue = cq;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println(carQueue.take());
            }
        } catch (InterruptedException e) {
            System.out.println("Exiting Reporter via interrupt");
        }
        System.out.println("Reporter off");
    }
}

abstract class Robot implements Runnable {
    private RobotPool pool;
    protected Assembler assembler;

    public Robot(RobotPool p) {
        pool = p;
    }

    public Robot assignAssembler(Assembler assembler) {
        this.assembler = assembler;
        return this;
    }

    private boolean engage = false;

    public synchronized void engage() {
        engage = true;
        notifyAll();
    }

    /**
     * Часть run() отличная для каждого робота
     */
    abstract protected void performService();

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                performService();
                assembler.barrier().await();
                /**
                 * Синхронизация
                 * Заание выполнено
                 */
                powerDown();
            }
        } catch (InterruptedException e) {
            System.out.println("Exiting " + this + " via interrupt");
        } catch (BrokenBarrierException e) {
            /**
             * Исключеине о котором нужно знать
             */
            throw new RuntimeException(e);
        }
        System.out.println(this + " off");
    }

    private synchronized void powerDown() throws InterruptedException {
        /**
         * Отключение от Assembler
         * возвращение в null
         */
        engage = false;
        assembler = null;
        pool.release(this);
        while (engage == false) {
            wait();
        }
    }

    public String toString() {
        return getClass().getName();
    }
}

class EngineRobot extends Robot {
    public EngineRobot(RobotPool pool) {
        super(pool);
    }

    protected void performService() {
        System.out.println(this + " installing engine");
        assembler.car().addWheels();
    }
}

class DriveTrainRobot extends Robot {
    public DriveTrainRobot(RobotPool pool) {
        super(pool);
    }

    protected void performService() {
        System.out.println(this + " installing DriveTrain");
        assembler.car().addDriveTrain();
    }
}

class WheelRobot extends Robot {
    public WheelRobot(RobotPool pool) {
        super(pool);
    }

    protected void performService() {
        System.out.println(this + " installing Wheels");
        assembler.car().addWheels();
    }
}

class RobotPool {
    /**
     * незаметно предотвращает испольщование идентичных элементов
     */
    private Set<Robot> pool = new HashSet<>();

    public synchronized void add(Robot r) {
        pool.add(r);
        notifyAll();
    }

    public synchronized void hire(Class<? extends Robot> robotType, Assembler d) throws InterruptedException {
        for (Robot r : pool) {
            if (r.getClass().equals(robotType)) {
                pool.remove(r);
                r.assignAssembler(d);
                r.engage();
                return;
            }
            /**
             * Нет доступных кандидатов
             * повторная попытка с рекурсией
             */
            wait();
            hire(robotType, d);
        }

    }

    public synchronized void release(Robot r) {
        add(r);
    }

}

public class CarBuilder {
    public static void main(String[] args) throws InterruptedException {
        CarQueue chassisQueue = new CarQueue();
        CarQueue finishingQueue = new CarQueue();
        ExecutorService executorService = Executors.newCachedThreadPool();
        RobotPool robotPool = new RobotPool();
        executorService.execute(new EngineRobot(robotPool));
        executorService.execute(new DriveTrainRobot(robotPool));
        executorService.execute(new WheelRobot(robotPool));
        executorService.execute(new Assembler(chassisQueue, finishingQueue, robotPool));
        executorService.execute(new Reporter(finishingQueue));
        /**
         * Создание рамы приводит коныеер в движение
         */
        executorService.execute(new ChassiBuilder(chassisQueue));
        TimeUnit.SECONDS.sleep(7);
        executorService.shutdownNow();
    }
}
