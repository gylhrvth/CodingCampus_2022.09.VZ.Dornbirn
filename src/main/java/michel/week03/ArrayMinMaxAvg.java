package michel.week03;

import java.util.Arrays;
import java.util.Random;

public class ArrayMinMaxAvg {
    public static void main(String[] args) {
        int[] randomNumber = generateRandomNumber(5, 101);
        readArray(randomNumber);
        System.out.println();
        readMinValue(randomNumber);
        System.out.println();
        readMaxValue(randomNumber);
        System.out.println();
        readAverange(randomNumber);
        System.out.println();
        readIndexOfMinValue(randomNumber);
        System.out.println();
        readIndexOfMaxValue(randomNumber);


    }

    private static int [] readIndexOfMaxValue(int [] value) {
        int max = Integer.MIN_VALUE;
        int indexMax = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i] > max) {
                max = value[i];
                indexMax = i;
            }
        }
        System.out.println("Der Index der größten Zahl im Array ist: " + indexMax);
        return value;
    }

    private static int[] readIndexOfMinValue(int[] value) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < value.length; i++) {

            if (value[i] < min) {
                index = i;
                min = value[i];
            }
        }
        System.out.println("Der Index der kleinste Zahl im Array ist: " + index);
        return value;
    }

    private static void readArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

        }
        System.out.println("Ausgabe Array:");
        System.out.println(Arrays.toString(arr));
    }

    private static int[] readAverange(int[] value) {
        float summe = 0;
        float avg = 0;
        for (int i = 0; i < value.length; i++) {
            summe = summe + value[i];
            avg = summe / value.length;
        }

        System.out.println("Der Durchschnitt ist : " + avg);

        return value;
    }

    private static int[] readMaxValue(int[] value) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < value.length; i++) {
            if (value[i] > max) {
                max = value[i];
            }
        }
        System.out.println("Die größte Zahl im Array ist: " + max);
        return value;
    }

    private static int[] readMinValue(int[] value) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < value.length; i++) {
            if (value[i] < min) {
                min = value[i];
            }

        }
        System.out.println("Die kleinste Zahl im Array ist: " + min + " ");
        return value;
    }

    private static int[] generateRandomNumber(int length, int maxValue) {
        Random randomNumber = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomNumber.nextInt(maxValue);
        }
        return arr;
    }
}
