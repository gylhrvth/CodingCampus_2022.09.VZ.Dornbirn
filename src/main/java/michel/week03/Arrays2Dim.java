package michel.week03;


import java.util.Arrays;
import java.util.Random;

public class Arrays2Dim {
    public static Random randy = new Random();

    public static void main(String[] args) {
        int[][] matrix = createRandomArray(10, 10);
        print2DArray(matrix);

        int[] sumRows = sumByRow(matrix);
        System.out.println("Summe by row:    " + Arrays.toString(sumRows));
        int[] sumColums = sumByColums(matrix);
        System.out.println("Summe by Colums: " + Arrays.toString(sumColums));
     }




    private static void print2DArray(int[][] matrix) {

       int summeColums= 0;
        for (int i = 0; i < matrix.length; i++) {
            int summeSize = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf(" %3d",matrix[i][j]);

            }
            System.out.println();
        }System.out.println();

    }

    public static int[] sumByRow(int[][] matrix){
        int[] result = new int[matrix.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = 0;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i] += matrix[i][j];
            }
        }
        return result;
    }

    private static int[] sumByColums(int[][] matrix) {
        if (matrix.length == 0){
            return new int[0];
        }
        int[] result = new int[matrix[0].length];
        for (int i = 0; i < result.length; i++) {
            result[i] = 0;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j] += matrix[i][j];
            }
        }
        return result;

    }

    public static int[][] createRandomArray(int line, int colums) {
        int[][] resultMatrix = new int[line][colums];
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                resultMatrix[i][j] = randy.nextInt(11);
            }
        }
        return resultMatrix;
    }
}
