package stefan.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameOfLiefe {
static String[] board;
static Scanner sc =new Scanner(System.in);

    public static void main(String[] args) {

        board = new String[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = String.valueOf((i + 1));


        }
        playboard();
    }


    public static void playboard() {
        System.out.println(board[0]+"|"+board[1]+"|"+board[2]);
        System.out.println(board[3]+"|"+board[4]+"|"+board[5]);
        System.out.println(board[6]+"|"+board[7]+"|"+board[8]);
    }
}
