public class exception2 {
    public static void main(String[] args) {
        String str = "abc";
        try {
            int num = Integer.parseInt(str);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}
