package fatima.week03;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] original = new int[20];
        for (int i = 0; i < original.length; i++) {
            original[i] = i + 1;
        }
        int[] copy = makeCopy(original);
        copy[0] = 30;

        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copy    : " + Arrays.toString(copy));

    }

    public static int[] makeCopy(int[] original) {
        int[] copyOf = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copyOf[i] = original[i];
        }
        return copyOf;
    }
}

