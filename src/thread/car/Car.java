package thread.car;

import java.util.Random;

public class Car implements Runnable {
    private final int DISTANCE = 100;
    private final int STEP = 5;
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        while (runDistance < DISTANCE) {
            try {
                int speed = (new Random().nextInt(20));
                runDistance += speed;
                String log = "|";
                int percentTravel = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel <= i + STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car " + this.name + ":" + log + "" + Math.min(DISTANCE, runDistance) + " KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car " + this.name + " broken....");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car " + this.name + " finish in " + (endTime - startTime) / 1000 + " s");
    }

    public static void main(String[] args) {
        Car car_1 = new Car("car_1");
        Car car_2 = new Car("car_2");
        Car car_3 = new Car("car_3");

        Thread thread_1 = new Thread(car_1);
        Thread thread_2 = new Thread(car_2);
        Thread thread_3 = new Thread(car_3);

        System.out.println("DISTANCE : 100 KM");

        thread_1.start();
        thread_2.start();
        thread_3.start();

    }
}
