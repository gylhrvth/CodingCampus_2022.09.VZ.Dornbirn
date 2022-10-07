package viktor.week03;

import viktor.week02.ReadUserInputIntV4;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    public static void gameFieldStart(int[][] array) {

        for (int r = 0; r < array.length; r++) {

            for (int c = 0; c < array[r].length; c++) {
                array[r][c] = 0;
                System.out.print(" " + array[r][c]);
            }
            System.out.println();
        }
    }

    public static void gameFieldAfterStep(int[][] array, int r, int c) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (i == r && j == c) {
                    System.out.print(" " + 1);
                } else {
                    array[i][j] = 0;
                    System.out.print(" " + 0);
                }
            }
            System.out.println();
        }
    }


    public static void copyFromField(int[][] currentArray) {

        int[][] newArray = new int[currentArray.length][currentArray.length];

        for (int i = 0; i < currentArray.length; i++) {

            for (int j = 0; j < currentArray[i].length; j++) {
                newArray[i][j] = currentArray[i][j];
            }
            System.out.println();
        }
    }

    public static boolean isPlaceBusy(int[][] array, int r, int c) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (i == r && j == c) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int[][] myArray = new int[3][3];


        gameFieldStart(myArray);

        System.out.println();




        while (true) {

            System.out.println("Setze bitte deinen Schritt!");
            int row = ReadUserInputIntV4.readUserInputIntegerV4(0, 2);
            int column = ReadUserInputIntV4.readUserInputIntegerV4(0, 2);

            if (isPlaceBusy(myArray, row, column)) {

                myArray[row][column] = 1;

            } else {
                System.out.println("Die Position ist schon besetzt!");
            }

            gameFieldAfterStep(myArray, row, column);
            copyFromField(myArray);
            System.out.println();
        }

        //System.out.println("Ist die Position (Ziele-Spalte) " + row + "-" +column + " besetzt ? " +isPlaceBusy(myArray, row, column));

    }
}

