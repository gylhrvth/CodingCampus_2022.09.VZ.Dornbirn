package viktor.week03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberArrayMinMaxAvg {

    public static int min(int[] array) {
        if (array.length == 0) return 0;

        int minIndex = 0;
        int minValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[minIndex] > array[i]) {
                minIndex = i;
            }
        }
        minValue = array[minIndex];

        return minValue;
    }

    public static int max(int[] array) {

        if (array.length == 0) return 0;

        int maxIndex = 0;
        int maxValue = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }
        maxValue = array[maxIndex];
        return maxValue;

    }

    public static int avg(int[] array) {

        if (array.length == 0) return 0;

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }


    public static int indexOfMin(int[] array){

        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[minIndex] > array[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int indexOfMax(int[] array){

        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;

    }



    public static void main(String[] args) {



        int[] emptyArray = {};                                     //Beispiel für ein leeres Array
        System.out.println("Min value: " + min(emptyArray));
        System.out.println("\n");
        System.out.println("Max value: " + max(emptyArray));
        System.out.println("\n");
        System.out.println("Durchschnitt: " + avg(emptyArray));
        System.out.println("\n");


        int size = ArrayExample1.readSize();
        int[] myArray = new int[size];

        System.out.println();
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(101);
            myArray[i] = randomNumber;
        }
        System.out.println("Elemente: ");
        for (int j : myArray) {
            System.out.print(j + " ");
        }

        System.out.println("\n");
        System.out.println("Min value: " + min(myArray));
        System.out.println("\n");
        System.out.println("Max value: " + max(myArray));
        System.out.println("\n");
        System.out.println("Durchschnitt: " + avg(myArray));
        System.out.println("\n");
        System.out.println("Index of min: " + indexOfMin(myArray));
        System.out.println("\n");
        System.out.println("Index of max: " + indexOfMax(myArray));

    }
}
