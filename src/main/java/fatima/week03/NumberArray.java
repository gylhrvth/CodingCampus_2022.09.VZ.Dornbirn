package fatima.week03;

import java.util.Arrays;
import java.util.Scanner;

public class NumberArray {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Array length?");
        n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("arr: " + Arrays.toString(arr));
    }
}
