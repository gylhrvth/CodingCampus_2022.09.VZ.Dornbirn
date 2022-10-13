package stefan.Test;

import java.util.*;

public class TicTacToe {


    public static void main(String[] args) {
        char[][] board = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        prinntboard(board);


        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Gib deine postion an (1-9)");
            int playerpos = scan.nextInt();

            placePiece(board, playerpos, "player");

            Random randy = new Random();
            int cpuPos = randy.nextInt(9) + 1;
            placePiece(board, cpuPos, "cpu");
            prinntboard(board);
        }
    }

    public static void prinntboard(char[][] board) {
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }

    }

    public static void placePiece(char[][] board, int pos, String user) {
        char symbol = ' ';

        if (user.equals("player")) {
            symbol = 'x';

        } else if (user.equals("cpu"))
            symbol = '0';

        switch (pos) {
            case 1:
                board[0][0] = symbol;
                break;
            case 2:
                board[0][2] = symbol;
                break;
            case 3:
                board[0][4] = symbol;
                break;
            case 4:
                board[2][0] = symbol;
                break;
            case 5:
                board[2][2] = symbol;
                break;
            case 6:
                board[2][4] = symbol;
                break;
            case 7:
                board[4][0] = symbol;
                break;
            case 8:
                board[4][2] = symbol;
                break;
            case 9:
                board[4][4] = symbol;
                break;
            default:
                break;
        }
    }


}
