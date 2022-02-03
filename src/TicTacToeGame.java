import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {

        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'_', '+', '_', '+', '_'},
                {' ', '|', ' ', '|', ' '},
                {'_', '+', '_', '+', '_'},
                {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your placement (1-9):");
        int pos = scan.nextInt();
        
        System.out.println(pos);
    }
        public static void printGameBoard(char[][] gameBoard) {
            for (char[] row : gameBoard) {
                for (char c : row) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }
    }

