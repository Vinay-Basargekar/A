public class complex {
    double real,img;

    //default constructor
    complex(){
        this.real = 0;
        this.img = 0;
    }
    // Parameterized constructor    
    complex(double real,double img){
        this.real = real;
        this.img = img;
    }

    //obj as argument 
    void add(complex c1, complex c2){
        // complex c1 = new complex();

        real = c1.real + c2.real;
        img = c1.img + c2.img;
        
        System.out.println(real + " + " + img + "i");
    }

    //obj as return type
    complex sub(complex c){
        complex c1 = new complex();

        c1.real = this.real - c.real;
        c1.img = this.img - c.img;

        return c1;
    }

    //obj as return type
    complex mul(complex c){
        complex c1 = new complex();

        c1.real = this.real * c.real - this.img * c.img; 
        c1.img = this.real * c.img + this.img * c.real;

        return c1;
    }
    //obj as return type
    complex div(complex c){
        complex c1 = new complex();

        double denominator = c.real * c.real + c.img * c.img;
        c1.real = (this.real * c.real + this.img * c.img) / denominator; 
        c1.img = (this.img * c.real - this.real * c.img) / denominator;

        return c1;
    }

    void display() {
        System.out.println(this.real + " + " + this.img + "i");
    }
    public static void main(String args[]){
        complex c1 = new complex(8,0.3);
        complex c2 = new complex(4.2,1.7);

        complex c = new complex();

        System.out.print("Addition: ");
        c.add(c1,c2);

        System.out.print("Subtraction: ");
        //by calling it on a obj, avoid modifying the original complex objects
        c = c1.sub(c2);
        c.display();

        System.out.print("Multiplication: ");
        c = c1.mul(c2);
        c.display();

        System.out.print("Division: ");
        c = c1.div(c2);
        c.display();

    }
}
