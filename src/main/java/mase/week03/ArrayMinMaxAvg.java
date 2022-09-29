package mase.week03;

import java.util.Arrays;
import java.util.Random;

public class ArrayMinMaxAvg {
    public static Random randy = new Random();

    public static void main(String[] args) {
        int[] value = generateRandomArray(5, 100);
        countingArray(value);
        minArraycount(value);
        maxArrayCount(value);
        avgArrayCount(value);
        minValueArrayIndex(value);
        maxValueArrayIndex(value);

    }

    public static void countingArray(int[] value) {
        for (int i = 0; i < value.length; i++) {

        }
        System.out.print("Das vollständige Array");
        System.out.println(Arrays.toString(value));
    }

    public static int[] minArraycount(int[] value) {
        int min = value[0];
        for (int i = 0; i < value.length; i++) {
            if (value[i] < min)
                min = value[i];
        }
        System.out.print("Das ist der minimal Wert: ");
        System.out.println(min);
        return value;
    }

    public static int[] maxArrayCount(int[] value) {
        int max = value[0];
        for (int i = 0; i < value.length; i++) {
            if (value[i] > max)
                max = value[i];
        }
        System.out.print("Das ist der maximal Wert: ");
        System.out.println(max);
        return value;
    }

    public static int[] avgArrayCount(int[] value) {
        float sum = 0;
        float avg = value[0];
        for (int i = 0; i < value.length; i++) {
            sum = sum + value[i];
            avg = sum / value.length;
        }
        System.out.print("Das ist der Durchschnitt: ");
        System.out.println(avg);

        return value;
    }

    public static int[] generateRandomArray(int len, int maxValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randy.nextInt(maxValue);
        }
        return arr;
    }

    public static int minValueArrayIndex(int[] value) {
        int min = value[0];
        int minIndex = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i] < min) {
                min = value[i];
                minIndex = i;
            }

        }
        System.out.println("Der Index von min: " + minIndex);
        return minIndex;
    }

    public static int maxValueArrayIndex(int[] value) {
        int max = value[0];
        int maxIndex = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i] > max) {
                max = value[i];
                maxIndex = i;
            }

        }    System.out.println("Der Index von max: " + maxIndex);
        return maxIndex;
    }
}
