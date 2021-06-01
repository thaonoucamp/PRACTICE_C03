package thread.runable;

public class Demo implements Runnable {
    private Thread thread;
    private final String name;

    public Demo(String name) {
        this.name = name;
        System.out.println("creat " + name);
    }

    @Override
    public void run() {
        System.out.println("run " + name);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("thread " + name + "," + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("thread " + name + "interrupted");
        }
        System.out.println("thread " + name + "exiting");
    }

    public void start() {
        System.out.println("Start " + name);
        if (thread == null) {
            thread = new Thread(this, name);
            thread.start();
        }
    }

    public static void main(String[] args) {
        Demo thread1 = new Demo("thread-1");
        Demo thread2 = new Demo("thread-2");

        thread1.start();
        thread2.start();
    }
}
