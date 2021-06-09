package behavioral.template_mothod;

public class Pizza extends Meal{
    @Override
    public void clean() {
        System.out.println("clean pizza");
    }

    @Override
    public void cook() {
        System.out.println("cook pizza");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void prepare() {
        System.out.println("prepare pizza");
    }
}
