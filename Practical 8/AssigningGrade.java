import java.util.Scanner;

public class AssigningGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the number of students: ");
        int numStudent = input.nextInt();

        int[] scores = new int[numStudent];
        String[] grades = new String[numStudent];

        System.out.println("Enter the " + numStudent + " scores");
        for (int i = 0; i < numStudent; i++) {
            scores[i] = input.nextInt();
        }
        int bestScore = Integer.MIN_VALUE;
        for (int i = 0; i < numStudent; i++) {
            if (scores[i] > bestScore) {
                bestScore = scores[i];
            }
        }

        for (int i = 0; i < numStudent; i++) {
            int score = scores[i];

            if (score >= bestScore - 10) {
                grades[i] = "A";
            } 
            else if (score >= bestScore - 20) {
                grades[i] = "B";
            } 
            else if (score >= bestScore - 30) {
                grades[i] = "C";
            } 
            else if (score >= bestScore - 40) {
                grades[i] = "D";
            } 
            else {
                grades[i] = "F";
            }
        }

        for (int i = 0; i < numStudent; i++) {
            System.out.println("Student " + (i + 1) + " score is " + scores[i] + " and grade is " + grades[i]);
        }
        
    }
}
