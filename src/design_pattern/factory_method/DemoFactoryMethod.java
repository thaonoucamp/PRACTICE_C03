package design_pattern.factory_method;

public class DemoFactoryMethod {
    public Animal getAnimal(String animal) {
        if ("dog".equals(animal)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }

    public static void main(String[] args) {
        DemoFactoryMethod factory = new DemoFactoryMethod();
        Animal animal = factory.getAnimal("meo");
        animal.makeSound();
    }
}
