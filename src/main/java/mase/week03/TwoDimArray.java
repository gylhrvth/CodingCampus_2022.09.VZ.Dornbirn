package mase.week03;

import java.util.Random;

public class TwoDimArray {
    private static Random randy = new Random();

    public static void main(String[] args) {
        int[][] matrix = generateMatrix(4, 10);
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d", matrix[i][j]);

            }
            System.out.println();
        }
    }



    public static int[][] generateMatrix(int height, int length) {
        int[][] resultMatrix = new int[height][length];
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
        resultMatrix[i][j] = randy.nextInt(0,101);
            }
        }
        return resultMatrix;
    }
}
