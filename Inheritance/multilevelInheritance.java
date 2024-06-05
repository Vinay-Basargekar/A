
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

class Puppy extends Dog {

    Puppy(String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println(name + " barks very lightly.");
    }

    void play() {
        System.out.println(name + " is playing.");
    }
}

public class multilevelInheritance {
    public static void main(String[] args) {
        Puppy puppy = new Puppy("Buddy");

        puppy.display();
        puppy.makeSound();
        puppy.play();
    }
}
