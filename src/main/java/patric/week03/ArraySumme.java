package patric.week03;

import java.util.Random;

public class ArraySumme {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random rand = new Random();
        int summe = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(101);
        }

        System.out.print("[");
        for (int zufallsZahl : array) {
            System.out.print(zufallsZahl);
            System.out.print(" ,");
        }
        System.out.print("]");


        System.out.println();
        System.out.print("[");
        for (int value : array) {


            System.out.print(",");
            summe += value;

            System.out.print(summe);
        }
    }
}