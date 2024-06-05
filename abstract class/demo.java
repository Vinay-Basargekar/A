
abstract class Animal{

    String name,type;
    Animal(String name,String type){
        this.name = name;
        this.type = type;
    }
    void display() {
        System.out.println("Animal Name: " + name);
    }
    abstract void makeSound();
}

class dog extends Animal{

    dog(String name,String type){
        super(name, type);
    }
    void makeSound(){
        System.out.println(name + " barks.");
    }
}

class cat extends Animal{

    cat(String name,String type){
        super(name, type);
    }
    void makeSound(){
        System.out.println(name + " meowws.");
    }
}

public class demo{
    public static void main(String[] args) {
        Animal dog = new dog("Buddy","LabraDog");
        Animal cat = new cat("Whiskers","Persian cat");

        dog.display();
        dog.makeSound();

        cat.display();
        cat.makeSound();
    }
}