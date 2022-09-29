package batuhan.week03;

import java.util.Arrays;
import java.util.Random;


public class RandomNumberArrayMinMaxAvg {


    public static void main(String[] args) {
        int[] arr = RandomNumberArrayZählen.generateRandomValues(10);
        int sum = RandomNumberArraySumme.sum(arr);
        System.out.println("Die gesammt Summe beträgt: " + sum+"!");
        int durchschnitt = durchschnitt(sum, arr);
        System.out.println("Der duchschnitt beträgt: " + durchschnitt+"!");
        int maximum = maximum(arr);
        System.out.println("Die höchste Summe beträgt: " + maximum+ "!");
        int minimum = minimum(arr);
        System.out.println("Die niedrigste Summe beträgt: " + minimum+ "!");


        System.out.println(Arrays.toString(arr));


    }

    public static int durchschnitt(int sum, int[] arr) {
        int durchschnitt = sum / arr.length;
        return durchschnitt;
    }

    public static int maximum(int[] arr) {
        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }

        }
     return maximum;
    }
    public static int minimum(int[] arr){
        int minimum = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < minimum){
                minimum = arr[i];
            }

        }return minimum;
    }
}
