package stefan.Test;

import java.util.Arrays;
import java.util.Random;

public class ArrayExampleMaxMin {
    public static Random randy = new Random();

    public static void main(String[] args) {
        int[] arr = randomArray(10);
        System.out.println(Arrays.toString(arr));

        System.out.println(max(arr));
    }

    public static int[] randomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randy.nextInt(100);
        }
        return arr;
    }

    public static int  max(int[] values) {
        if (values.length == 0) return Integer.MIN_VALUE;
        int max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
    return max;
    }
}

