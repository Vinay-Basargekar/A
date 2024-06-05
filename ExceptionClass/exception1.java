import java.util.Scanner;

public class exception1 {
    public static void main(String[] args) {
        int result,a,b=0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        try{
            result = a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        sc.close();
    }
}
