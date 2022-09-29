package fatima.week03;

import java.util.Random;

public class RandomNumberArray {
    private static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println();
        int[] values = generateRandomValues(9);

        /*
        System.out.println(values[1]);
        System.out.println(values[4]);
        System.out.println(values[9]);
         */
        System.out.println("Random generator (foreach-loop):");
        printWithForEach(values);
        System.out.println();
        printWithIndex(values);
        System.out.println();
        System.out.println("Print second, fifth and tenth value:");
        printSpecificNumber(values, 1);
        printSpecificNumber(values, 4);
        printSpecificNumber(values, 9);
        System.out.println();
        printSecondNumber(values);
        System.out.println();
//        printSecondNumberGyula(values);
    }

    public static int[] generateRandomValues(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }

    public static void printWithForEach(int[] values) {
        System.out.print("[");
        boolean firstValue = true;
        for (int currentValue : values) {
            if (!firstValue) {
                System.out.print(", ");
            } else {
                firstValue = false;
            }
            System.out.print(currentValue);
        }
        System.out.println("]");
    }

    public static void printWithIndex(int[] values) {
        System.out.println("Random generator (fori-loop):");
        System.out.print("[");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]);
            if (i < values.length - 1)
                System.out.print(", ");
        }
        System.out.print("]");
        System.out.println();
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

//    public static void printSecondNumberGyula(int[] values) {
//        System.out.println("Print every second number");
//        System.out.print("[");
//        for (int i = 1; i < values.length; i += 2) {
//            if (i > 1) {
//                System.out.print(", ");
//            }
//            System.out.print(values[i]);
//        }
//        System.out.println("]");
//    }

}


