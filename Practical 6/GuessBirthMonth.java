import java.util.Scanner;

public class GuessBirthMonth {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    int binarybits = 0;

    System.out.println("Is your birth month  in Set 1?");
    System.out.println("1 3 5 7 9 11");
    System.out.print("Enter 0 for No and 1 for Yes: ");
    int response = input.nextInt();

    if (response == 1) {
        binarybits += 1;
    }

    System.out.println("Is your birth month  in Set 2?");
    System.out.println("2 3 6 7 10 11");
    System.out.print("Enter 0 for No and 1 for Yes: ");
    response = input.nextInt();

    if (response == 1) {
        binarybits += 2;
    }

    System.out.println("Is your birth month  in Set 3?");
    System.out.println("4 5 6 7 12");
    System.out.print("Enter 0 for No and 1 for Yes: ");
    response = input.nextInt();

    if (response == 1) {
        binarybits += 4;
    }

    System.out.println("Is your birth month  in Set 4?");
    System.out.println("8 9 10 11 12");
    System.out.print("Enter 0 for No and 1 for Yes: ");
    response = input.nextInt();

    if (response == 1) {
        binarybits += 8;
    }

    String month = "";
    switch (binarybits) {
        
        case 1:
            month = "January";
            break;
        case 2:
            month = "February";
            break;
        case 3:
            month = "March";
            break;
        case 4:
            month = "April";
            break;
        case 5:
            month = "May";
            break;
        case 6:                
            month = "June";
            break;
        case 7:
            month = "July";
            break;
        case 8:
            month = "August";
            break;
        case 9:
            month = "September";
            break;
        case 10:
            month = "October";
            break;
        case 11:
            month = "November";
            break;
        case 12:
            month = "December";
            break;
        default :
            month = "Unknown";
        }

    System.out.println("You are born in " + month);

    input.close();
    }
}


