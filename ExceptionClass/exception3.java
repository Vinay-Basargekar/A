import java.util.InputMismatchException;
import java.util.Scanner;

public class exception3 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 44;
        arr[1] = 33;
        arr[2] = 2;

        System.out.print("Enter index: ");
        Scanner sc = new Scanner(System.in);
        try{
            int index = sc.nextInt();
            System.out.println("Array at index is: "+arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Enter Valid Index \n"+ e);
        }
        catch(InputMismatchException e){
            System.out.println("Enter Integer value \n"+e);
        }
        sc.close();
    }
}
