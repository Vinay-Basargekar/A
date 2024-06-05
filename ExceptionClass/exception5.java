import java.util.Scanner;

public class exception5 {

    static void divide(){
        Scanner sc = new Scanner(System.in);
        int a , b, c;

        System.out.print("Enter First Number : ");
        a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        b = sc.nextInt();

        if(b == 0){
            throw new ArithmeticException("Divide by 0 ");
        }
        c = a/b;
        System.out.println("Division of Both the Numbers is : " +c);
        sc.close();
    }
    public static void main(String[] args) {
        divide();
    }
}
