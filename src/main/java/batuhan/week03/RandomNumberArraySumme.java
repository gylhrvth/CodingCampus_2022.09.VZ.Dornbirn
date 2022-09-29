package batuhan.week03;

import java.util.Arrays;
import java.util.Random;


public class RandomNumberArraySumme {




    public static void main(String[] args) {
        int[] arr = generateRandomValues(10);
        System.out.println(Arrays.toString(arr));
        System.out.println("Die gesammt Summe beträgt: "+sum(arr) );
    }

    public static int sum(int[] arr){
        int sum = 0;
        for (int x : arr) {
            sum = sum + x;

        }
        return sum;
    }

    public static int[] generateRandomValues(int anzahl){
        int[] arr = new int[anzahl];

        // Generate Random Array
        for (int i = 0; i < arr.length; i++) {
            int numberOfComputer = new Random().nextInt(101);
            arr[i] = numberOfComputer;
        }
        return arr;
    }
}
