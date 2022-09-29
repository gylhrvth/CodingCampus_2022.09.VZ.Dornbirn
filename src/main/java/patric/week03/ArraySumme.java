package patric.week03;

import java.util.Random;

public class ArraySumme {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(101);
        }

        System.out.print("[");
        for (int crazy : array) {
            System.out.print(crazy);
            System.out.print(" ,");
        }
        System.out.print("]");

    }
}