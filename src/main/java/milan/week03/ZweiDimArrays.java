package milan.week03;

import java.util.Random;

public class ZweiDimArrays {

    private static Random rand = new Random();

    public static void main(String[] args) {
        int[][] matrix = createRandomMatrix(4, 10);
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("| %3d ", matrix[i][j]);
            }
            System.out.println("|");
        }
    }

    public static int[][] createRandomMatrix(int rows, int columns) {
        int[][] resultMatrix = new int[rows][columns];
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                resultMatrix[i][j] = rand.nextInt(101);
            }
        }
        return resultMatrix;
    }
}
