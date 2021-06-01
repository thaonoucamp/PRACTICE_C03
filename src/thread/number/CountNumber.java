package thread.number;

public class CountNumber implements Runnable {
    private Thread thread;

    public Thread getThread() {
        return thread;
    }

    public CountNumber() {
        thread = new Thread(this, "my runnable thread");
        System.out.println("my thread created " + thread);
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("printing  the count " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread is run over");
    }

    public static void main(String[] args) {
        CountNumber count = new CountNumber();
        try {
            while (count.getThread().isAlive()) {
                System.out.println("Main thread will be alive till child thread is alive");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted");
        }
        System.out.println("main is run over");
    }
}
