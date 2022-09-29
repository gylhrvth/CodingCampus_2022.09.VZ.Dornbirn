package fatima.week03;

import java.util.Random;

public class ArraySum {
    public static Random rand = new Random();

    public static void main(String[] args) {
        int[] values = RandomNumberArray.generateRandomValues(2);
        RandomNumberArray.printWithForEach(values);

        printSum(values);
    }

    public static void printSum(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        System.out.println("Sum of the values: " + sum);
    }
}
