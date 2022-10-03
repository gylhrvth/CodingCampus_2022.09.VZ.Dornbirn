package franz.week03;

import java.util.Arrays;
import java.util.Random;

public class ArraysExample3 {
    private static Random randomGenerator = new Random();

    public static void main(String[] args) {
        System.out.println("Print -50 - +50:");
        crazyCandy1();
        System.out.println("Print alle ueber 30:");

        int[] random = generateRandomArray(50, -20, 100);
        System.out.println(Arrays.toString(random));


    }

    public static void crazyCandy1() {
        int[] arr1 = new int[101];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i - 50;
        }
        System.out.println(Arrays.toString(arr1));
    }

//    length: 100, minValue: -50; maxValue: 30
    public static int[] generateRandomArray(int length, int minValue, int maxValue) {
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = randomGenerator.nextInt(maxValue - minValue + 1) + minValue;
        }
        return arr;
    }
}




