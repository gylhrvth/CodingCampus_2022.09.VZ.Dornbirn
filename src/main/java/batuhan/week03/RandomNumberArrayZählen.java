package batuhan.week03;

import java.util.Random;
import java.util.Arrays;

public class RandomNumberArrayZählen {

    public static void main(String[] args) {
        int[] arr = generateRandomValues(8);
        System.out.println(Arrays.toString(arr));
        System.out.println(zaehlenGroesser30(arr) + " Werte sind größer als 30.");
    }

    public static int zaehlenGroesser30(int[] arr){
        int zaeler = 0;
        for (int x : arr) {
            if (30 < x) {
                ++zaeler;
            }
        }
        return zaeler;
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

