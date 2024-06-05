import java.util.Scanner;

abstract class Shape {
    double a;
    double b;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.print("Enter a : ");
        a = sc.nextDouble();
        System.out.print("Enter b : ");
        b = sc.nextDouble();
    }

    abstract void computeArea();
}

class Triangle extends Shape {
    @Override
    public void computeArea() {
        double a1 = (1.0 / 2) * a * b;
        System.out.println("Area of Triangle: " + a1);
    }
}

class Rectangle extends Shape {
    @Override
    public void computeArea() {
        double a2 = a * b;
        System.out.println("Area of Rectangle: " + a2);
    }
}

public class Dynamic_Binding {
    public static void main(String[] args) {
        Shape t = new Triangle();
        Shape r = new Rectangle();
        t.input();
        t.computeArea();
        System.out.println("\n");
        r.input();
        r.computeArea();
    }
}
