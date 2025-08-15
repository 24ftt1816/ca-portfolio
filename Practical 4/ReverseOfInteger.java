import java.util.Scanner;

public class ReverseOfInteger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 100 and 999: ");
        int num = input.nextInt();

        // e.g : 123 % 10 = 3 , 123 / 10 = 12

        int hundreds = num / 100;
        int tens = ((num % 100) / 10);
        int ones = num % 10;

        String reverse = "" + ones + tens + hundreds;

        System.out.print("The reverse of " + num + " is " + reverse);

    }
}
