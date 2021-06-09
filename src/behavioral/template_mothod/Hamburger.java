package behavioral.template_mothod;

public class Hamburger extends Meal {
    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void clean() {
        System.out.println("clean burger");
    }

    @Override
    public void cook() {
        System.out.println("cook burger");
    }

    @Override
    public void prepare() {
        System.out.println("prepare burger!");
    }
}
