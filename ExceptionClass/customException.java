import java.util.Scanner;

class myException extends Exception{
    myException(String msg){
        super(msg);
    }
}

public class customException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int age = sc.nextInt();
            if(age < 18){
                throw new myException("Not a valid age to vote!");
            }
            else{
                System.out.println("Voting Age!");
            }
        }catch(myException e){
            System.out.println(e);
        }
        finally{
            sc.close();
        }
    }
}
