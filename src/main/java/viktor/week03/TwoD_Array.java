package viktor.week03;

import javax.security.auth.login.AccountExpiredException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TwoD_Array {


    public static void sumForRows(int[][] array) {
        int[] sum = new int[array.length];

        for (int k = 0; k < array.length; k++) {

            for (int l = 0; l < array[k].length; l++) {
                sum[k] += array[k][l];

            }

        }
        System.out.println("Sum of the rows: " + Arrays.toString(sum));
    }

    public static void sumForColumns(int[][] array) {
        int[] sum = new int[array.length];

        for (int m = 0; m < array.length; m++) {
            for (int n = 0; n < array[m].length; n++) {
                sum[n] += array[m][n];

            }
        }
        System.out.println("Sum of the columns: " + Arrays.toString(sum));
    }

    public static void main(String[] args) {

        int size = ArrayExample1.readSize();
        int[][] myArray = new int[size][size];

        Random random = new Random();
        int randomNum = 0;


        for (int i = 0; i < myArray.length; i++) {

            for (int j = 0; j < myArray.length; j++) {
                randomNum = random.nextInt(101);
                myArray[i][j] = randomNum;
                System.out.printf("%3d ", myArray[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n");
        sumForRows(myArray);
        System.out.println();
        sumForColumns(myArray);


    }
}
