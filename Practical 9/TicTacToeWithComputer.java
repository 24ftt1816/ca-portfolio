import java.util.Scanner;

public class TicTacToeWithComputer {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        boolean gameEnded = false;
        char currentPlayer = 'X';

        while (!gameEnded) {
            for (int i = 0; i < 3; i++) {
                System.out.print("|");
                for (int j = 0; j < 3; j++) {
                    System.out.print(" " + board[i][j] + " |");
                }
                System.out.println();
                System.out.println("-----------");
            }

            if (currentPlayer == 'X') {
                System.out.println("Player's turn");
                System.out.print("Enter a row (0,1,2): ");
                int row = input.nextInt();
                System.out.print("Enter a column (0,1,2): ");
                int col = input.nextInt();

                board[row][col] = 'X';

            } 
            else {
                System.out.println("Computer's turn");
                int row, col;

                do {
                    row = (int)(Math.random() * 3);
                    col = (int)(Math.random() * 3);
                } 
                while (board[row][col] != ' ');

                board[row][col] = 'O';
            }

            boolean win = false;

            for (int i = 0; i < 3; i++) {
                if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer)
                    win = true;
                if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)
                    win = true;
            }
            // Check diagonals
            if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer)
                win = true;
            if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)
                win = true;

            // Check for draw
            boolean full = true;
            for (int i = 0; i < 3; i++) {
                for (int j=0; j<3; j++) {
                    if (board[i][j] == ' ') {
                        full = false;
                        break;
                    }
                }
            }

            if (win) {
                for (int i = 0; i < 3; i++) {
                    System.out.print("|");
                    for (int j = 0; j < 3; j++) {
                        System.out.print(" " + board[i][j] + " |");
                    }
                    System.out.println();
                    System.out.println("-----------");
                }

                if (currentPlayer == 'X') {
                    System.out.println("Game ended, Player Win");
                } 
                else {
                    System.out.println("Game ended, Computer Win");
                }

                gameEnded = true;
            } 
            else if (full) {
                System.out.println("|   |   |   ");
                System.out.println("-----------");
                for (int i = 0; i < 3; i++) {
                    System.out.print("|");
                    for (int j = 0; j < 3; j++) {
                        System.out.print(" " + board[i][j] + " |");
                    }
                    System.out.println();
                    System.out.println("-----------");
                }
                System.out.println("Game ended in a Draw");
                gameEnded = true;
            } 
            else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }
}
