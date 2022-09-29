package mase.week03;

import java.util.Arrays;
import java.util.Random;

public class ArrayCounting {
    public static Random randy = new Random();

    public static void main(String[] args) {
        int[] array = generateRandomArray(3, 100);
        countingNumbers(array);
    }

    public static void countingNumbers(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 30) {
                count += 1;
            }
        }
        System.out.println(Arrays.toString(arr)); //sout auserhalb der schleife sonst array mehrer Reihen
        System.out.println("The Count with Numbers over 30 is " + count);

    }

    public static int[] generateRandomArray(int len, int maxValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randy.nextInt(maxValue);
        }
        return arr;
    }

}