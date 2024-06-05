public class exception4 {

    public static int divide(int a,int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try{
            int div = divide(44, 0);
            System.out.println(div);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
