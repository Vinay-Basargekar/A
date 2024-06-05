class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Animal Name: " + name);
    }

    void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks.");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " meows.");
    }
}

public class hierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Carlo");
        Cat cat = new Cat("Simba");

        dog.display();
        dog.makeSound();

        cat.display();
        cat.makeSound();
    }
}
