package michel.week03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array2DPascalTriangle {

    public static void main(String[] args) {
        int size = readUserImput(1, 10);
        int[][] pascal = createPascalTriangle(size);
        printMatrix(pascal);
    }

    private static int readUserImput(int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben sie eine Zahl zwischen " + minValue + " und " + maxValue + " ein!");
        int size = Integer.MIN_VALUE;
        do {
            try {
                size = sc.nextInt();
                if (size < minValue || size > maxValue) {
                    System.out.println("Bitte geben sie eine Zahl zwischen " + minValue + " und " + maxValue + " ein!");
                    size = Integer.MIN_VALUE;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Nur Zahlen erlaubt!");
            }
            sc.nextLine();
        } while (size == Integer.MIN_VALUE);
        return size;
    }

    private static int[][] createPascalTriangle(int size) {
        int[][] pascal = new int[size][size];
        for (int i = 0; i < pascal.length; i++) {
            for (int j = 0; j < pascal[i].length; j++) {
                if (i == 0 || j == 0) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j] + pascal[i][j - 1];
                }

            }
        }
        return pascal;
    }

    private static void printMatrix(int[][] matrix) {


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%8d", matrix[i][j]);
            }
            System.out.println();
        }


    }
}
