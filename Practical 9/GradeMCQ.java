import java.util.Scanner;

public class GradeMCQ {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        char [][] studentAns = {
            {'A', 'B', 'C', 'D', 'A', 'B'},
            {'C', 'D', 'D', 'A', 'B', 'D'},
            {'D', 'D', 'A', 'B', 'B', 'A'},
            {'C', 'A', 'D', 'A', 'B', 'C'}
        } ;

        System.out.println("Enter the key to the MCQ: ");
        String userInput = input.nextLine().toUpperCase().replace(" ", "");
        
        char[] answerKey = new char[6];

        for (int i = 0; i < 6; i++) {
            answerKey[i] = userInput.charAt(i);
        }

        System.out.println();

        for (int studentIndex = 0; studentIndex < studentAns.length; studentIndex++) {
            int correctCount = 0;

            for (int j = 0; j < answerKey.length; j++) {
                if (Character.toUpperCase(studentAns[studentIndex][j]) == answerKey[j]) {
                    correctCount++;
                }
            }

            String result = (correctCount >= 3) ? "passed" : "failed";
            System.out.println("Student " + studentIndex + " 's correct count is " + correctCount + ". Therefore, he/she " + result + " the test.");
        }

    }
}
