import java.util.Scanner;

abstract class shape{
    double a,b;

    // void input(){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a: ");
    //     a = sc.nextDouble();
    //     System.out.print("Enter b: ");
    //     b = sc.nextDouble();
    //     sc.nextLine();
    // }
    shape(double a,double b){
        this.a = a;
        this.b = b;
    }
    abstract void compute_area();
}

class triangle extends shape{
    triangle(double a,double b){
        super(a, b);
    }
    @Override
    void compute_area() {
        double area = 0.5 * a * b;
        System.out.println("Area of triangle is: "+ area);
    }
}

class rectangle extends shape{

    rectangle(double a, double b) {
        super(a, b);
    }

    void compute_area(){
        double area = a * b;
        System.out.println("Area of rectangle is: "+area);
    }
}

public class area{
    public static void main(String[] args) {
        double a,b;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = sc.nextDouble();
        System.out.print("Enter b: ");
        b = sc.nextDouble();
        sc.nextLine();

        triangle t = new triangle(a,b);
        rectangle r = new rectangle(a,b);
        // t.input();

        t.compute_area();
        r.compute_area();

        sc.close();
    }
}
