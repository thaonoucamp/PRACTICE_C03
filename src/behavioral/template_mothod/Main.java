package behavioral.template_mothod;

public class Main {
    public static void main(String[] args) {
        Meal burger = new Hamburger();
        burger.doMail();

        System.out.println();

        Meal pizza = new Pizza();
        pizza.doMail();
    }
}
