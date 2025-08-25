import java.util.Scanner;

public class WordComparison {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    System.out.print("Enter the first word: ");
    String word = input.nextLine();

    System.out.print("Enter the second word: ");
    String word2 = input.nextLine();

    System.out.print("Are both words the same? " + word.equalsIgnoreCase(word2));

}
}
