import java.util.Scanner;

public class OccurenceOfMaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int largest = 0;
        int count = 0;
        int num;

        System.out.println("Enter numbers, the input ends with 0 entered:");
        while (true) {
            num = input.nextInt();

            if (num==0) {
                break;
            }

            if (num > largest) {
                largest = num;
                count = 1;
            }    
            else if (num==largest) {
                count++;
            }
        }
        System.out.println("The largest number is " + largest);
        System.out.println("The occurence count of the largest number is " + count);
    }
}
