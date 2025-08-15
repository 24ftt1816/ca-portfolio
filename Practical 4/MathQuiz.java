import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);

        System.out.println("What is " + num1 + " + " + num2 + " ?");
        int userSum = input.nextInt();

        int actualSum = num1 + num2;
            if (userSum == actualSum) {
                System.out.println(num1 + " + " + num2 + " = " + userSum + " is true");}
            else {
                System.out.println(num1 + " + " + num2 + " = " + userSum + " is false");}

        System.out.println("What is " + num1 + " % " + num2 + " ?");
        int userMod = input.nextInt();

        int actualMod = num1 % num2;
            if (userMod == actualMod) {
                System.out.println(num1 + " % " + num2 + " = " + userMod + " is true");}
            else {
                System.out.println(num1 + " % " + num2 + " = " + userMod + " is false");}

        input.close();

    }
}
