package mase.week03;

import java.util.Arrays;
import java.util.Random;

public class CountingArraySum {
    public  static Random randy = new Random();
    public static void main(String[] args) {
        int[] array = generateRandomArray(4,100);
        countigArray(array);
    }

    public static void countigArray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
    }

    public static int[] generateRandomArray(int len, int maxValue){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randy.nextInt(maxValue);
        }
        return arr;
    }
}
