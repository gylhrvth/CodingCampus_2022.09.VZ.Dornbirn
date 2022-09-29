package fatima.week03;

import java.util.Random;

public class ArrayMinMaxAvg {

    public static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Random Number Generator 1-100:");
        int[] values = RandomNumberArray.generateRandomValues(10);
        RandomNumberArray.printWithForEach(values);
        System.out.println();
        System.out.print("Minimum: ");
        System.out.printf("%2d %n", findMin(values));
        System.out.print("Maximum: ");
        System.out.printf("%2d %n", findMax(values));
        System.out.print("Average: ");
        System.out.printf("%2d %n", findAvg(values));
        System.out.println("Index of Minimum (" +findMin(values) + ") is " + indexOfMin(values));
        System.out.println("Index of Maximum (" +findMax(values) + ") is " + indexOfMax(values));
    }

    public static int findMin(int[] values) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    public static int findMax(int[] values) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    public static int findAvg(int[] values) {
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

    public static int indexOfMin(int[] values) {
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

    public static int indexOfMax (int[] values) {
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



