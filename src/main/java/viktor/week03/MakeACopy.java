package viktor.week03;

import java.util.Arrays;

public class MakeACopy {

    public static int[] makeACopy(int[] original) {
        int size = original.length;
        int[] newArray = new int[size];

        for (int i = 0; i < size; i++) {
            newArray[i] = original[i];
        }
        return newArray;
    }

    public static void main(String[] args) {

        int[] original = {1, 0, 2, 1};
        int[] secArray= makeACopy(original);
        secArray[0] = original[0];

        System.out.println("Original:" + Arrays.toString(original));
        System.out.println();
        System.out.println("Copy: " + Arrays.toString(secArray));

    }
}
