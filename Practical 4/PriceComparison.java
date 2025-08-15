import java.util.Scanner;

public class PriceComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the cost of the first package: $");
        double cost1 = input.nextDouble();

        System.out.print("Enter the weight of the first package (in grams): ");
        double weight1 = input.nextDouble();

        System.out.print("Enter the cost of the second package: $");
        double cost2 = input.nextDouble();

        System.out.print("Enter the weight of the second package (in grams): ");
        double weight2 = input.nextDouble();

        double pricePerGram1 = cost1 / weight1;
        double pricePerGram2 = cost2 / weight2;

        if (pricePerGram1 < pricePerGram2) {
            System.out.println("It is worth more to buy the 1st package."); } 
        else {
            System.out.println("It is worth more to buy the 2nd package."); }

    }
}
