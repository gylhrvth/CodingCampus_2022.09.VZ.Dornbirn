package berna.week03;


//import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TwodimensionalArray {
    public static void main(String[] args) {

        System.out.println("So you want to create a 2D array?");
        System.out.println("How many rows do you want? (i.e. i = ? ) Enter a number please!");
        int row = ArraysBasics.askArrayLength();
        System.out.println("How many columns do you want? (i.e. j = ? ) Enter a number please!");
        int col = ArraysBasics.askArrayLength();

        int[][] newMatrix = new int[row][col];
        createTwoDimArray(row, col, newMatrix);
        //System.out.println(Arrays.deepToString(newMatrix));
        System.out.println("That's your 2D array! ");
        System.out.println();
        printTwoDimArray(row, col, newMatrix);
        System.out.println();
        calculateTwoDimArraySum(row, col, newMatrix);

    }

    public static void printTwoDimArray(int rows, int column, int[][] arr_a) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("%3d | ", arr_a[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] createTwoDimArray(int rows, int column, int[][] arr_a) {

        // Create a 2d-array and fill it with random numbers

        Random randy = new Random();                            //initialize random numbers

        for (int i = 0; i < rows; i++) {      // in each col of the main array...
            int[] arr_b = new int[column];                             // ...create a new array b...
            for (int j = 0; j < column; j++) {     //... and fill its columns
                arr_b[j] = randy.nextInt(100);
            }
            arr_a[i] = arr_b;             // write the array arr_b into one column of the (main) array

        }
        //System.out.print(Arrays.deepToString(arr_a));
        return arr_a;

    }

    public static void calculateTwoDimArraySum(int rows, int column, int[][] arr_a) {
        System.out.println("So you want to calculate sums of your 2D-Array? ");
        System.out.println("Do you need the sum of the rows (type: 1) or the sum of the columns (type: 2)? ");
        Scanner sc = new Scanner(System.in);

        int wish = 0;
        while (wish == 0) {
            try {
                wish = sc.nextInt();
                if ((wish < 1) || (wish > 2)) {
                    System.out.println("there are only task 1 or 2! choose again: ");
                    wish = 0;  // reset the number to zero because you defined while ==0!
                }
            } catch (InputMismatchException ime) {
                System.out.println("This was not a number! Enter an integer number:");
            }
            sc.nextLine();  // reset the user input
        }

        if (wish == 1) {
            //sum of the rows

            for (int i = 0; i < rows; i++) {

                int sumRow = 0;

                for (int j = 0; j < column; j++) {

                    sumRow = sumRow + arr_a[i][j];
                }

                System.out.printf("sumRow(%3d) = %3d \n", i , sumRow);
            }
        } else {
            //sum of the columns

            for (int i = 0; i < column; i++) {

                int sumCol = 0;

                for (int j = 0; j < rows; j++) {

                    sumCol = sumCol + arr_a[j][i];
                }
                System.out.printf("sumCol(%3d) = %3d \n", i , sumCol);
            }
        }
    }
}
