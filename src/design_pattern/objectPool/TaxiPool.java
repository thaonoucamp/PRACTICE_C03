package design_pattern.objectPool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class TaxiPool {
    public static final long EXPIRED_TIME = 1200;
    public static final int QUANTITY_TAXI = 4;
    private final List<Taxi> serving = Collections.synchronizedList(new ArrayList<>());
    private final List<Taxi> available = Collections.synchronizedList(new ArrayList<>());
    private final AtomicInteger count = new AtomicInteger(0);
    private final AtomicBoolean waiting = new AtomicBoolean(false);

    public synchronized void release(Taxi taxi) {
        serving.remove(taxi);
        available.add(taxi);
        System.out.println(taxi.getName() + "is free");
    }

    public synchronized Taxi getTaxi() throws TaxiNotFoundException {
        if (!available.isEmpty()) {
            Taxi taxi = available.get(0);
            serving.add(taxi);
            return taxi;
        }
        if (count.get() == QUANTITY_TAXI) {
            this.waitingUntilTaxiAvailable();
            return this.getTaxi();
        }
        Taxi taxi = this.creatTaxi();
        serving.add(taxi);
        return taxi;
    }

    private Taxi creatTaxi() {
        waiting(200);
        Taxi taxi = new Taxi("Taxi " + count.incrementAndGet());
        System.out.println(taxi.getName() + "isCreated");
        return taxi;
    }

    private void waitingUntilTaxiAvailable() throws TaxiNotFoundException {
        if (waiting.get()) {
            waiting.set(false);
            throw new TaxiNotFoundException("TAXI IS NOT FIND");
        }
        waiting.set(true);
        waiting(EXPIRED_TIME);
    }

    private void waiting(long time) {
        try {
            TimeUnit.MICROSECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
