package fatima.week03;

import java.util.Arrays;
import java.util.Random;

public class twoDimArray {
    private static Random rand = new Random();

    public static void main(String[] args) {
        int[][] value = createRandomArray(5, 10);
        printArray(value);
        System.out.println();
        int[] sum = sumOfRow(value);
        System.out.println("Sum: " + Arrays.toString(sum));
    }

    public static int[] sumOfRow(int[][] value) {
        int[] sumRow = new int[value.length];
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[i].length; j++) {
                sumRow[i] += value[i][j];
            }
        }
        return sumRow;
    }

    public static void printArray(int[][] value) {
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[i].length; j++) {
                System.out.printf("%3d ", value[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] createRandomArray(int rows, int columns) {
        int[][] result = new int[rows][columns];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = rand.nextInt(101);
            }
        }
        return result;
    }
}

