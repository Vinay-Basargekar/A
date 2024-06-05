
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

    Dog(String name,String type){
        super(name);
        this.type = type;
    }

    void makeSound(){
        System.out.println(name + " barks!");
    }
    void Display(){
        super.Display();
        System.out.println("Type of Animal: "+type);
    }
}

public class singleLevel {
    public static void main(String[] args) {
        
        Dog dog = new Dog("Buddy","Labra Dog");
        dog.makeSound();
        dog.Display();
    }
}
