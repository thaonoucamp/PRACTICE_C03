package design_pattern.objectPool;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TaxiThread implements Runnable {
    private TaxiPool taxiPool;

    public TaxiThread(TaxiPool taxiPool) {
        this.taxiPool = taxiPool;
    }

    @Override
    public void run() {
        takeTaxi();
    }

    private void takeTaxi() {
        try {
            System.out.println("New client " + Thread.currentThread().getName());
            Taxi taxi = taxiPool.getTaxi();
            TimeUnit.MICROSECONDS.sleep(rantInt(1000, 1500));
            taxiPool.release(taxi);
            System.out.println("Served the client " + Thread.currentThread().getName());
        } catch (InterruptedException | TaxiNotFoundException e) {
            System.out.println(">>>Rejected the client " + Thread.currentThread().getName());
        }
    }

    private int rantInt(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }
}
