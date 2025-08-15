import java.util.Scanner;

public class MoneyChanger {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Enter 1 to convert bnd to rm and 2 vise versa: ");
        int userChoice = input.nextInt();

        System.out.print("Enter the amount to be converted: $");
        double userAmt = input.nextDouble();

        final double ratio = 3.0;

        double convertedAmt = (userChoice == 1) ? userAmt * ratio : userAmt / ratio;

        // Display the result formatted to 2 decimal places
        System.out.printf("The change is $%.2f\n", convertedAmt);

    }
}
