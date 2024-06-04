import java.util.LinkedList;
import java.util.List;

public class ass9{
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        countEvenNumbers(numbers);
        countOddNumbers(numbers);
        countPrimeNumbers(numbers);
        countPalindromes(numbers);
    }

    public static void countEvenNumbers(List<Integer> numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        System.out.println("Number of even numbers: " + count);
    }

    public static void countOddNumbers(List<Integer> numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                count++;
            }
        }
        System.out.println("Number of odd numbers: " + count);
    }

    public static void countPrimeNumbers(List<Integer> numbers) {
        int count = 0;
        for (int number : numbers) {
            if (isPrime(number)) {
                count++;
            }
        }
        System.out.println("Number of prime numbers: " + count);
    }

    public static void countPalindromes(List<Integer> numbers) {
        int count = 0;
        for (int number : numbers) {
            if (isPalindrome(number)) {
                count++;
            }
        }
        System.out.println("Number of palindromes: " + count);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int reversed = 0;
        int original = number;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }
}