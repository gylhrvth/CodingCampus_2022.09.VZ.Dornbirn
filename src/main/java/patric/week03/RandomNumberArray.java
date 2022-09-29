package patric.week03;

import java.util.Random;
import java.util.Arrays;

public class RandomNumberArray {
    private static Random rand = new Random();

    public static void main(String[] args) {
        int[] values = generateRandomValues(10);

        System.out.println(Arrays.toString(values));

        printWithForEach(values);
        printWithForI(values);


        System.out.println(); //  printSecondFifthTenth
        printSpecificNumber(values, 1);
        printSpecificNumber(values, 4);
        printSpecificNumber(values, 9);

        // printEverySecondValue
        System.out.println();
        printSecondNumber(values);
        System.out.println();
    }

    public static void printWithForEach(int[] values) {
        System.out.print("[");
        boolean printComma = false;
        for (int value : values) {
            if (printComma) {
                System.out.print(", ");
            }
            System.out.print(value);
            printComma = true;
        }
        System.out.println("]");
    }

    public static void printWithForI(int[] values) {
        System.out.print("[");
        boolean firstLine = true;
        for (int i = 0; i < values.length; i++) {
            if (firstLine) {
                firstLine = false;
            } else {
                System.out.print(" ,");
            }
            {
                System.out.print(values[i]);
            }
        }
        System.out.print("]");

    }

    public static int[] generateRandomValues(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(101);
        }
        return array;
    }


    public static void printSpecificNumber(int[] values, int index) {
        if (index < values.length) {
            System.out.println((index + 1) + ". value of array is " + values[index]);
        } else {
            System.out.println((index + 1) + ". value of array is NOT available.");
        }
    }

    public static void printSecondNumber(int[] values) {
        System.out.println("Print every second number");
        System.out.print("[");
        for (int i = 0; i < values.length; i++) {
            if (i % 2 == 1) {
                System.out.print(values[i]);
                if (i < values.length - 2)
                    System.out.print(", ");
            }
        }
        System.out.println("]");
    }


}
