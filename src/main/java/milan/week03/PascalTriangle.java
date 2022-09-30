package milan.week03;


import milan.week02.UserInput;

public class PascalTriangle {
    public static void main(String[] args) {

        int size = UserInput.readUserInputIntegerV4(1, 30);
        int[][] pascal = generatePascalTriangle(size);
        printMatrix(pascal);
    }

    public static int[][] generatePascalTriangle(int size){
        int[][] pascal = new int[size][size];
        for (int i = 0; i < pascal.length; i++) {
            for (int j = 0; j < pascal[i].length; j++) {
                if ((i == 0) || (j == 0)) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j] + pascal[i][j - 1];
                }
            }
        }
        return pascal;
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf(" %5d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

}
