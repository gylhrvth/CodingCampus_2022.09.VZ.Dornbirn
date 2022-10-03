package michel.week03;

import java.util.Arrays;
import java.util.Random;

public class ArraySumme {
    public static void main(String[] args) {
        int[] randomNumber = generateRandomNumber(5, 100);
        readArray(randomNumber);
    }

    private static void readArray(int[] arr) {
        int summe = 0;
        for (int i = 0; i < arr.length; i++) {
            summe = summe + arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Die Summe ist: "+ summe);

    }

    private static int[] generateRandomNumber(int length, int maxValue) {
        Random randomNumber = new Random();
        int[] random = new int[length];
        for (int i = 0; i < random.length; i++) {
            random[i] = randomNumber.nextInt(maxValue);
        }
        return random;
    }
}
