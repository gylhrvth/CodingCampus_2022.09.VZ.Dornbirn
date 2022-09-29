package berna.week03;

import java.util.Arrays;
import static berna.week03.ArraysBasics.createRandomArray;


public class ArraysCaluclations {
    public static void main(String[] args) {
        int[] arr = createRandomArray(1, 100);
        System.out.println("Array created : " + Arrays.toString(arr));
        System.out.println("\n");
        randomNumberArrayCount(arr, 30);

        randomNumberArraySum(arr);

        randomNumberArrayMin(arr);

        randomNumberArrayMax(arr);

        randomNumberArrayAverage(arr);

    }

    public static void randomNumberArrayCount(int[] arr, int largerthan) {
        //System.out.println("count the values larger than " + largerthan);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largerthan) {
                ++count;
            }
        }
        int[] results = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largerthan) {
                results[j] = arr[i];
                ++j;
            }
        }
        System.out.println("Number of values larger than " + largerthan + ":      " + count);
        System.out.println("Values larger than " + largerthan + ": " + Arrays.toString(results));

    }

    public static int randomNumberArraySum(int[] arr) {
        //System.out.println("you want to calculate the sum of all values in an array? ");

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("the sum of all values in the array is:  " + sum);
        return sum;


    }

    public static int randomNumberArrayMin(int[] arr) {

        int minvalue = 100;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] < minvalue) {
                minvalue = arr[i];
            }
        }
        System.out.println("Minvalue =  " + minvalue);
        return minvalue;
    }

    public static int randomNumberArrayMax(int[] arr) {

        int maxvalue = 1;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > maxvalue) {
                maxvalue = arr[i];
            }
        }
        System.out.println("Maxvalue =  " + maxvalue);
        return maxvalue;
    }

    public static int randomNumberArrayAverage(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum = sum + arr[i];
        }
        int numbervalues = arr.length;
        int avg = sum / numbervalues;

        System.out.println("average is: " + avg);
        return avg;


    }


}
