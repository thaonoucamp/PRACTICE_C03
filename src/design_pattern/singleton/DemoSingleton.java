package design_pattern.singleton;

public class DemoSingleton {
    private static DemoSingleton instance = new DemoSingleton();

    private DemoSingleton() {
    }

    public static DemoSingleton getInstance() {
        return instance;
    }

    public void print() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public void show() {
        for (int i = 10; i < 20; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        DemoSingleton instance = DemoSingleton.getInstance();
        DemoSingleton instance_1 = DemoSingleton.getInstance();

        if (instance == instance_1){
            System.out.println("The instance is only");
        }else {
            System.err.println("The instance is not only !");
        }
    }
}
