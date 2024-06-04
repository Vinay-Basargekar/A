import java.util.InputMismatchException;
import java.util.Scanner;

public class exception1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,result;
        try{
            System.out.print("Enter Num1: ");
            num1 = Integer.parseInt(sc.nextLine());
            System.out.print("Enter Num2: ");
            num2 = sc.nextInt();

            result = num1 / num2;
            System.out.println(result);
        }catch(NumberFormatException e){
            System.out.println("invalid conversion: string to integer " + e);
        }catch(ArithmeticException e){
            System.out.println("Division by 0: Invalid "+ e);
        }catch(InputMismatchException e){
            System.out.println("Enter valid input "+ e);
        }
        sc.close();
    }    
}
