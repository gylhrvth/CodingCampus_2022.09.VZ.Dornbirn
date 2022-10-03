package franz.week03;

import java.util.Arrays;
import java.util.Random;

import static franz.week03.ArraysExample3.generateRandomArray;

public class CrazyRange {
    public static void main(String[] args) {
        System.out.println("Print -50 - +50:");
   //     crazyCandy1();
        System.out.println("\n");
        System.out.println("Print alle ueber 30:");

        int[] values = generateRandomArray(10, 10, 100);
        System.out.println(Arrays.toString(values));

        System.out.println("Die Anzahl Werte über 30 ist: " + countValuesOver30(values));
        System.out.println("Summe aller Zahlen: " + sumarr(values));
        System.out.println("Kleiste aller Zahlen: " + minarr(values));
        System.out.println("Größte aller Zahlen: " + maxarr(values));
        System.out.println("Durchschnitt aller Zahlen: " + avgarr(values));
    }

    public static int countValuesOver30(int[] arr1) {
        int counter = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 30) {
                ++counter;
            }
        }
        return counter;
    }


    public static int sumarr(int[] arr1) {
        int summe = 0;
        for (int j : arr1) {
            summe += j;
        }
        return summe;
    }
    public static int minarr(int[] arr1) {
        int counter = 0;
        for (int j : arr1) {
            counter +=j;
        }
        return counter;
    }
    public static int maxarr(int[] arr1) {
        int counter = 0;
        for (int j : arr1) {
            counter += j;
        }
        return counter;
    }
    public static double avgarr(int[] arr1) {
        int summe = 0;
        for (int j : arr1) {
            summe += j;
        }
        return summe / (double)arr1.length;
    }

    public static void crazyCandy1() {

        Random candy = new Random();
        int[] arr1 = new int[101];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i - 50;
        }
        System.out.println(Arrays.toString(arr1));
    }

}



