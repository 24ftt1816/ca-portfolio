import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class QueueReceipt {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Practical 5/QReceipt.txt");

        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Receipt generated. Thank you.");

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = ldt.format(formatter);

        int receiptNumber = (int) (Math.random() * 100) ;

        fw.write(formattedDateTime + "\n");
        fw.write("Hi, " + name.toUpperCase() + "\n");
        fw.write("Your receipt number is :" + receiptNumber);

        fw.close();
        
    }
}
