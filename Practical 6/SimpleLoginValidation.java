import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleLoginValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String correctUsername = "Ahmad Ali";
        String correctPassword = "12345";

        System.out.println("Please enter your username:");
        String username = input.nextLine();

        System.out.println("Please enter the password: ");
        String password = input.nextLine();

        if (!username.equalsIgnoreCase(correctUsername)) {
            System.out.println("Error. Invalid Username.");
        }
        else if (!password.equals(correctPassword)) {
            System.out.println("Error: Password does not match.");
        } 
        else {
            Date now = new Date();
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            String currentTime = timeFormat.format(now);
            System.out.println("Welcome Ahmad Ali. The time now is " + currentTime);
        }
        
    input.close();
    }
}
