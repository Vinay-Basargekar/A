// Define the vehicle interface with methods for vehicle operations
interface vehicle {
    int maxSpeed = 60;

    void gearChange(int gear);  
    void speedUp(double increment);  
    void applyBreak();  
}
class bicycle implements vehicle {
    int gear = 0;  
    double speed = 0.0;  

    @Override
    public void gearChange(int newGear) {
        gear = newGear;  
        System.out.println("Gear changed to " + gear);
    }
    @Override
    public void speedUp(double increment) {
        if(speed + increment <= maxSpeed) {  
            speed += increment;  
            System.out.println("Current speed: " + speed);
        } else {
            System.out.println("Cannot exceed maximum speed of " + maxSpeed);
        }
    }

    @Override
    public void applyBreak() {
        speed--;  
        if (speed < 0) speed = 0;  
        System.out.println("Current speed after applying break: " + speed);
    }
}

class Bike implements vehicle {
    int gear = 0;  
    double speed = 0.0;  

    @Override
    public void gearChange(int newGear) {
        gear = newGear;  
        System.out.println("Bike gear changed to " + gear);
    }

    @Override
    public void speedUp(double increment) {
        if(speed + increment <= maxSpeed) {  
            speed += increment;  
            System.out.println("Bike current speed: " + speed);
        } else {
            System.out.println("Bike cannot exceed maximum speed of " + maxSpeed);
        }
    }

    @Override
    public void applyBreak() {
        speed -= 2;  
        if (speed < 0) speed = 0;  
        System.out.println("Bike current speed after applying break: " + speed);
    }
}

class Car implements vehicle {
    int gear = 0;  
    double speed = 0.0;  

    @Override
    public void gearChange(int newGear) {
        gear = newGear;  
        System.out.println("Car gear changed to " + gear);
    }

    @Override
    public void speedUp(double increment) {
        if(speed + increment <= maxSpeed) {  
            speed += increment;  
            System.out.println("Car current speed: " + speed);
        } else {
            System.out.println("Car cannot exceed maximum speed of " + maxSpeed);
        }
    }

    @Override
    public void applyBreak() {
        speed -= 5;  
        if (speed < 0) speed = 0;  
        System.out.println("Car current speed after applying break: " + speed);
    }
}



public class vehicleMain {
    public static void main(String[] args) {
        vehicle bicycle = new bicycle();  
        vehicle bike = new Bike();
        vehicle car = new Car();

        System.out.println("Testing Bicycle:");
        bicycle.gearChange(2);  
        bicycle.speedUp(10);  
        bicycle.applyBreak();  

        System.out.println("\nTesting Bike:");
        bike.gearChange(3);  
        bike.speedUp(20);  
        bike.applyBreak();  

        System.out.println("\nTesting Car:");
        car.gearChange(4);  
        car.speedUp(30);  
        car.applyBreak();   
    }
}
