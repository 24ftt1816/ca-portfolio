import java.io.FileWriter;
import java.io.IOException;

public class ModulusQuestion {
    public static void main(String[] args) throws IOException {

       String filename = "C:/Practical 5/ModulusQuestions.txt" ;
       FileWriter fw = new FileWriter(filename, true);

       System.out.print("A new question added");
       
       int num1 = (int)(Math.random() * 100);
       int num2 = (int)(Math.random() * 100);

       fw.write(num1 + " % " + num2 + " = ?" + "\n");
       
       fw.close(); 
    }
}
