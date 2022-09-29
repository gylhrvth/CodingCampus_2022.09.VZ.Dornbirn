package michel.week03;

import java.util.Arrays;
import java.util.Random;

public class ArrayCounting {

    public static void main(String[] args) {
        countingArray();
    }

    private static void countingArray() {
        Random random = new Random();
        int[] arr = new int[10];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int randomNumber = random.nextInt(101);
            arr[i] = randomNumber;
            if (arr[i] > 30) {
                count += 1;
            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Es sind: " + count + " Zahlen über 30");
    }

}
