import java.util.Scanner;

public class ShiftingElementByInput {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("How many numbers are there?");
        int userNum = input.nextInt();
        
        int [] numbers = new int[userNum];

        System.out.println("Enter the " + userNum + " numbers:");
        for (int i  = 0; i < userNum; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Enter number of left shift:");
        int shift = input.nextInt();
        
        shift = shift % userNum;
        
        for (int s = 0; s < shift; s++) {
            int firstElement = numbers[0];
            for (int i = 0; i < userNum - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[userNum - 1] = firstElement;
        }

        System.out.println();
        System.out.println("The shifted arrangement is: ");
        for (int i = 0; i < userNum; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
