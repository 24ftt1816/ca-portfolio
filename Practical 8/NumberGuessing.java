import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        Integer [] numbers = {0,1,2,3,4,5,6,7,8,9};
        
        for (int i = numbers.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));
            int temp = numbers[i];
            numbers[i] = numbers[index];
            numbers[index] = temp;
        }

        // for (int n : numbers){
        //     System.out.print(n + " ");
        // }

        int chance = 10;
        while (chance > 0) {
            System.out.println("Guess 4 numbers (no duplicates):");
            int[] guesses = new int[4];

            for (int i = 0; i < 4; i++) {
                guesses[i] = input.nextInt();
            }

            int score = 0;
            for (int i = 0; i < 4; i++) {
                if (guesses[i] == numbers[i]) {
                    score++;
                }
            }

            chance--;
            System.out.println("You have score " + score + " out of the 4 numbers. You have " + chance + " chances left.");
            
            if (score == 4) {
                System.out.println("You Won! You got the actual number!");
            }
        }

        if (chance == 0) {
            System.out.print("The actual number is ");
            for (int i = 0; i < 4; i++) {
                System.out.print(numbers[i] + " ");
            }
        System.out.println(". You Lose.");
        }
    }
}
