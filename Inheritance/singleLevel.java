
class Animal{
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound(){
        System.out.println(name + "Make a sound!");
    }
    void Display(){
        System.out.println("Name of animal: "+ name);
    }
}

class Dog extends Animal{
    String type;

    Dog(String name){
        super(name);
    }

    void makeSound(){
        System.out.println(name + " barks!");
    }
}

public class singleLevel {
    public static void main(String[] args) {
        
        Dog dog = new Dog("Buddy");
        dog.makeSound();
        dog.Display();
    }
}
