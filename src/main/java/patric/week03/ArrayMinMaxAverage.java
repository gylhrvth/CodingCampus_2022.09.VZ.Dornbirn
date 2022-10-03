package patric.week03;

import java.util.Scanner;
import java.util.Random;


public class ArrayMinMaxAverage {

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
        System.out.println("MINIMUM: ");
        System.out.printf("%2d %n", findMinimum(values));
        System.out.println("index of MINIMUM( " + findMinimum(values) + ") is " + indexOfMinimum(values));
        System.out.println();
        System.out.println("MAXIMUM: ");
        System.out.printf("%2d %n", findMaximum(values));
        System.out.println("index of MINIMUM( " + findMaximum(values) + ") is " + indexOfMaximum(values));
        System.out.println();
        System.out.println("AVERAGE: ");
        System.out.printf("%2d %n", findAverage(values));
        System.out.println();
        System.out.println("****TschauTschau****");

    }

    public static int findMinimum(int[] values) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    public static int findMaximum(int[] values) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    public static int findAverage(int[] values) {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        for (int i = 0; i < values.length; i++) {
            avg = sum / values.length;

        }
        return avg;
    }


    public static int indexOfMinimum(int[] values) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
                index = i;
            }
        }
        return index;
    }


    public static int indexOfMaximum(int[] values) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
                index = i;
            }
        }
        return index;
    }
}

