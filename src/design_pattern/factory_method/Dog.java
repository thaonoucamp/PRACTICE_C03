package design_pattern.factory_method;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("W o o f");
    }
}
