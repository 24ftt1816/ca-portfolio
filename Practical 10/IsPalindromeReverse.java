import java.util.Scanner;

public class IsPalindromeReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int random = (int)(Math.random() * 900) + 100;

        System.out.print("Enter the reverse of " + random + " : ");
        int userInput = input.nextInt();

        while (userInput < 100 || userInput > 999) {
            System.out.print("Please enter a 3-digit reverse number of " + random + ": ");
            userInput = input.nextInt();
        }

        boolean result = isPalindrome(random, userInput);
        System.out.println("\nThe digit " + userInput + " is palindrome of " + random + " is " + result + ".");
    }

    public static boolean isPalindrome(int original, int userInput) {
        int reversed = reverse(userInput);
        return original == reversed;
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}