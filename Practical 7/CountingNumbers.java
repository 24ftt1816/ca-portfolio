import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int totalNum = 0;
        int num = 0;
        int positiveNum = 0;
        int negativeNum = 0;
        int numberCount = 0;
        double average = 0;

        System.out.println("Enter an integer, the input ends if it is 0: ");
        while (true) {
            num = input.nextInt();
            //input.nextLine(); //no need, unless mau read entire line including spaces

            if (num==0) {
                if (numberCount == 0) {
                    System.out.print("No number is entered except for 0 to end the program");
                }
                break;
            }

            if (num >= 1) { 
                positiveNum++;
            }
            else if (num < 0) { 
                negativeNum++;
            }
            
            totalNum += num;
            numberCount++;
        }
        
        if (numberCount >  0) {
            System.out.println("The number of positive is " + positiveNum);
            System.out.println("The number of negative is " + negativeNum);
            System.out.println("The total is " + totalNum);
            average = (double) totalNum/numberCount;
            System.out.printf("The average is %.2f\n", average);
            // System.out.println("The average is " + (totalNum/numberCount));
        }
    }
}
