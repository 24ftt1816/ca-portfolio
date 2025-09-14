import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Random random = new Random();

        long bigNumber = random.nextLong(); // generate a large random number
        int computerChoice = (int) (Math.abs(bigNumber) % 3); // get a number between 0 and 3

        System.out.println("Enter rock (0), paper (1), scissor (2)");
        int userInput = input.nextInt();

        String[] choices = {"rock", "paper", "scissor"};
        String result= "";

        if (userInput == computerChoice) {
            result = "It is a draw";
        }
        
        if ((userInput == 0 && computerChoice == 1) ||
            (userInput == 0 && computerChoice == 2) ||
            (userInput == 2 && computerChoice == 1)) {
            result = "You win!";
        }
        
        if ((computerChoice == 0 && userInput == 1) ||
            (computerChoice == 0 && userInput == 2) ||
            (computerChoice == 2 && userInput == 1)) {
            result = "You lose!";
        }

        System.out.println("The computer is " + choices[computerChoice] + ". You are " + choices[userInput] + ". " + result);
        input.close();
    }
}