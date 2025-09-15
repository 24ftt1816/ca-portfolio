import java.util.Scanner;

public class SimpleCalculatorUsingSwitch {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        System.out.print("Enter an arithmetic expression: ");
        String expression = input.nextLine();

        String[] parts = expression.trim().split(" ");
        int num1 = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int num2 = Integer.parseInt(parts[2]);

        switch (operator) {
            case "+":
                System.out.println("The sum is " + (num1 + num2));
            break;
            case "-":
                System.out.println("The subtraction is " + (num1 - num2));
            break;
            case "*":
                System.out.println("The multiplication is " + (num1 * num2));
            break;
            case "/":
            if (num2==0) {
                System.out.println("Math error: The divisor cannot be Zero ");
            }
            else {
                System.out.println("The division is " + (num1 / num2));
            }
            break;
            default :
            System.out.println("Invalid operator. Please use +, -, *, or /");
            }
    
    input.close();
    }
}
