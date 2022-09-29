package michel.week03;

import java.util.Arrays;
import java.util.Random;

public class ArrayCounting {

    public static void main(String[] args) {

        int[] randomNumber = createRandomArray(10, 100);
        countingArray(randomNumber);
    }

    private static void countingArray(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 30) {
                count += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Es sind: " + count + " Zahlen über 30");
    }

    public static int[] createRandomArray(int length, int maxValue) {
        Random random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxValue);
        }
        return arr;
    }
}
