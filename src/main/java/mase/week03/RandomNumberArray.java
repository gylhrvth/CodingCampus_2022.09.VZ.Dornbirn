package mase.week03;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberArray {
    private static final Random rand = new Random();

    public static void main(String[] args) {
        int[] testValues = generateRandomArray(20);
        System.out.println(Arrays.toString(testValues));
        randomNumberArray(testValues);

    }

    public static void randomNumberArray(int[] arr) {
        System.out.print("[");
        boolean firstLine = true;
        for (int i : arr) {
            if (firstLine) {
                firstLine = false;
            } else {
                System.out.print(", ");
            }
            System.out.print(i);
        }
        System.out.println("]");



        System.out.print("[");
        if(1 < arr.length){                     //Array 2 prüfung ob  index 1 möglich sit
            System.out.print(arr[1]);

        } if (4 < arr.length) {
            System.out.print(", ");
            System.out.print(arr[4]);

        } if (9 < arr.length) {
            System.out.print(", ");
            System.out.print(arr[9]);
        }
        System.out.println("]");

//
//        System.out.println("[" +
//                ((1 < arr.length)?Integer.toString(arr[1]):"") +
//                ((4 < arr.length)?", " + Integer.toString(arr[4]):"") +
//                ((9 < arr.length)?", " + Integer.toString(arr[9]):"") +
//                "]");


        for (int i = 1; i < arr.length;i = i+2) {
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }


    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            int rand1 = rand.nextInt(100);
            arr[i] = rand1;
        }
        return arr;
    }


}

