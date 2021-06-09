package behavioral.template_mothod;

public abstract class Meal {
    public final void doMail() {
        prepare();
        cook();
        eat();
        clean();
    }

    public abstract void clean();

    public void eat() {
        System.out.println("Mmm, that's good !");
    }

    public abstract void cook();

    public abstract void prepare();

}
