package patric.week03;

import mase.week01.Counting;

import java.util.Random;


public class ArrayZählen {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(101);
        }

        int abc = zaehler(array, 30, 100);
        System.out.println(abc);


        System.out.print("[");
        for (int crazy : array) {
            System.out.print(crazy);
            System.out.print(" ,");
        }
        System.out.print("]");
    }


    public static int zaehler(int[] arr, int min, int max) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min && arr[i] < max) {
                count++;
            }

        }
        return count;

    }

}



