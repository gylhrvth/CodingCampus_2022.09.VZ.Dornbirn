package milan.week03;

import milan.week02.UserInput;

import java.util.Arrays;
import java.util.Random;

public class ZweiDArray {


    private static Random ran = new Random();

    public static void main(String[] args) {

        //UserInput.readUserInputIntegerV4();
        int[][] matrix = createTwoDimArraysWithRandomNum(3, 5);
        printMatrix(matrix);
        int[] arrsum = sumRows(matrix);
        System.out.println("ergebnis");
        System.out.println(Arrays.toString(arrsum));
    }

    public static int[] sumRows(int[][] matrix) {

        int result = 0;
        int[] arrsum = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            //int result = 0;
            for (int j = 0; j < matrix[i].length - 1; j++) {
                result = result + matrix[i][j];
            }
            arrsum[i] = result;
        }
        return arrsum;
    }

    public static int[][] createTwoDimArraysWithRandomNum(int zeile, int spalte) {
        int[][] resultMatrix = new int[zeile][spalte];
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                resultMatrix[i][j] = ran.nextInt(101);
            }
        }
        return resultMatrix;

    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf(" %3d ", matrix[i][j]);
            }
            System.out.println();
        }
    }


}
