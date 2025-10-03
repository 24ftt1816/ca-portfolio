public class LoopsLoopsLoops {
    public static void main(String[] args) {

        int i=0;
        System.out.print("Below is generated using while loop: ");
        System.out.println();
        while (i < 20) {
            System.out.print((i+1) + " ");
            i++;
        }
        System.out.println("\n"); //print space and new line

        int count = 51;
        System.out.print("Below is generated using dowhile loop: ");
        System.out.println();
        do {
            System.out.print((count - 1) + " ");
            count--;
        } while (count !=35);

        System.out.println("\n");

        System.out.print("Below is generated using for loop: ");
        System.out.println();
        char character = 'a';
        for (int j = 'a'; j < 'z'; j++) {
            System.out.print(character + " ");
            character++;
        }
    }
}
