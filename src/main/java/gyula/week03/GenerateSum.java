package gyula.week03;

import java.util.Arrays;
import java.util.Random;

public class GenerateSum {
    private static Random randomGenerator = new Random();

    public static void main(String[] args) {
        int[] testValues = generateRandomArray(20);
        System.out.println(Arrays.toString(testValues));

        System.out.println("Sum: " + sumArrayValues(testValues));
        System.out.println("Max: " + maxValue(testValues));
    }


    public static int sumArrayValues(int[] values){
        int result = 0;
        for (int i = 0; i < values.length; i++) {
            result = result + values[i];
        }

        return result;
    }

    public static int maxValue(int[] values){
        if (values.length == 0) return Integer.MIN_VALUE;

        int max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max){
                max = values[i];
            }
        }
        return max;
    }

    public static int[] generateRandomArray(int size){
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomGenerator.nextInt(101);
        }
        return arr;
    }
}
