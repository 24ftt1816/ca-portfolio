import java.util.Scanner;

public class NumberOfDurians {
    public static void main(String[] args) {
        System.out.println("Each durian cost $15.75");

        Scanner input = new Scanner(System.in);

        System.out.print("How much money do you have?: ");
        double money = input.nextDouble();
        double durianPrice = 15.75;

        int durians = (int)(money / durianPrice);

        System.out.println("The number of durian(s) you can buy is " + durians);

    }
}
