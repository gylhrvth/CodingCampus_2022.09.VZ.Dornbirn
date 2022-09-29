package mase.week03;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] original = new int[10];
        for (int i = 0; i < original.length; i++) {
            original[i] = 10 * (i + 1);

        }
        int[] copy = makeACopy(original);

        copy[0] = -100;
        System.out.println("Original:" + Arrays.toString(original));
        System.out.println("Kopie:" + Arrays.toString(copy));
    }

    public static int[] makeACopy(int[] original) {
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }
}
