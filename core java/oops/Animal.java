package oops;

public class Animal {
    public void makeSound() {
        // Method to be overridden by the child classes
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    // Overriding the methods of the parent class
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    // Overriding the methods of the parent class
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}
class Main {
    // Creating objects of the child classes
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Animal dog = new Dog();
        dog.makeSound();

        Animal cat = new Cat();
        cat.makeSound();
    }
}