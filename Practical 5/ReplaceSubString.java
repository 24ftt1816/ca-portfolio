import java.util.Scanner;

public class ReplaceSubString {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter your message: ");
        String message = input.nextLine();

// replaceFirst(oldString: String, newString: String) : String
//  Returns a new string that replaces the first matching substring in this string with the new substring
        System.out.print("Enter the substring to replace: ");
        String substring = input.nextLine();

        System.out.print("Enter the replacement word: ");
        String replaceString = input.nextLine();

        String updateMessage = message.replaceFirst(substring, replaceString);

        System.out.println("The updated message is: ");
        System.out.print(updateMessage);
        
    }
}
