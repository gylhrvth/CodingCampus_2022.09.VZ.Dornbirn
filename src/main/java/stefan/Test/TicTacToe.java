package stefan.Test;

import java.util.*;

public class TicTacToe {

    public static void main(String[] args) {
        String[] board = new String[10];
        String player1 = "x";
        String player2 = "0";
        for (int i = 0; i < board.length; i++) {
            board[i] = String.valueOf((i + 1));

        }
        printBoard(board);
        int user = userInput();
        switchBoard(user, "x", board, "0");
        printBoard(board);
    }

    public static void switchBoard(int user, String player1, String board[], String player2) {

    }


    public static int userInput() {
        int user = 0;
        System.out.println("Spieler 1 setzen sie ");
        Scanner sc = new Scanner(System.in);
        user = sc.nextInt();
        return user;
    }

    public static void printBoard(String[] board) {
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
    }
}
