import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    System.out.print("Enter first integer: ");
    int num1 = input.nextInt();
    System.out.print("Enter second integer: ");
    int num2 = input.nextInt();

    greatestCommonDivisor(num1, num2);
    
    }

    public static void greatestCommonDivisor(int num1, int num2) {
        int commonDivisor = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                commonDivisor = i;
            }
        }
        System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + commonDivisor);
    }
}
    
    
        
        
