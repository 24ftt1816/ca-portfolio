import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int term1 = 0;
        int term2 = 1;
        int temporaryTerm = 0;

        System.out.print("Please enter the term: ");
        int term = input.nextInt();

        for (int i = 1; i < term; i++) {
            temporaryTerm = term1 + term2;
            term1 = term2;
            term2 = temporaryTerm; 
        }
        System.out.println("At term " + term + " the number is " + temporaryTerm);
    }
}





