package patric.week03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bubblesort {
    public static Random rand = new Random();


    public static void main(String[] args) {
        System.out.println();
        System.out.println("                                   Random Number Generator 1-100");
        System.out.println("Wie viele Zufallszahlen willst du?");
        Scanner console = new Scanner(System.in);
        int num1 = console.nextInt();
        int[] values = RandomNumberArray.generateRandomValues(num1);
        RandomNumberArray.printWithForEach(values);

        System.out.println();
        System.out.println("Zahlen sotiert: Klein nach Gross ");
        System.out.println();
        sort(values);
        System.out.println("Result: " + Arrays.toString(values));
        System.out.println();
        System.out.println("Zahlen sotiert: Klein nach Gross ");
        sortBigToLittle(values);
        System.out.println("Result: " + Arrays.toString(values));
        System.out.println();
        System.out.println("*****TschauTschau*****");


    }


    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    public static void sortBigToLittle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


}



