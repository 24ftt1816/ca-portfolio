import java.util.Scanner;

public class RockPaperScissorLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String[] choices = {"rock", "paper", "scissor"} ;

        int rounds = 0;
        int score = 0;
        int compScore = 0;
        String result= "";
        
        boolean continueLoop = true;
        do {
            System.out.print("Enter rock (0), paper (1), scissor (2): ");
            int userChoice = input.nextInt( );
            input.nextLine();

            int computerChoice = (int) ((Math.random() * 100) % 3);

            if (userChoice == computerChoice) {
                result = "It is a draw";
            }
        
            else if ((userChoice == 0 && computerChoice == 2) ||
                    (userChoice == 1 && computerChoice == 0) ||
                    (userChoice == 2 && computerChoice == 1)) {
                result = "You win!";
                score++;
            }
        
            else {
                result = "You lose!";
                compScore++;
            }

            rounds++;

            System.out.println("The computer is " + choices[computerChoice]
            + ". You are " + choices[userChoice] + ". " + result);
            System.out.println();
                
            System.out.print("Enter y to play again: ");
            String answer = input.nextLine();
            if (!answer.equalsIgnoreCase("y")) {
                continueLoop = false;
            }

        }   while (continueLoop);
            System.out.print("In the total of " + rounds + " round(s), You scored " + score
            + ", Computer scored " + compScore);

            System.out.println();
            if (score > compScore) {
                System.out.println("You won the game.");
            }
            else if (score == compScore) {
                System.out.println("It is a draw game.");
            }
            else {
                System.out.println("Computer won the game.");
            }
    }
}
