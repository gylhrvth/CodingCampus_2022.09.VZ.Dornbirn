package stefan.week04.week03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberArray {
    public static void main(String[] args) {

        Random zahl = new Random();
        int[] array = new int[15];
        int min = array[0];
        int max = array[14];
        for (int i = 0; i < array.length; i++) {
            array[i] = zahl.nextInt(101);



            }
            System.out.println("For-each-Schleife");
            for (int size : array) {
                System.out.print(size + " ");

            }

            System.out.println("");
            System.out.println("Jede zweite Wert");
            for (int i = 0; i < array.length; i += 2) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            System.out.println("Ungerade");
            for (int i = 1; i < array.length; i += 2) {
                System.out.print(array[i] + " ");

            }

            System.out.println();
            System.out.println("max min Array");
            System.out.println("min Array " + array[min] + " " + array[max]);

            System.out.println();
            System.out.println("Array Zuffalszahl");
            System.out.println(Arrays.toString(array));
            System.out.println("Zweite Element in array[]: " + array[1]);
            System.out.println("Fünfte Element in array[]: " + array[4]);
            System.out.println("Zehnte Element in array[]: " + array[9]);


        }

    }

   // public static int minMax(int min int max) {




