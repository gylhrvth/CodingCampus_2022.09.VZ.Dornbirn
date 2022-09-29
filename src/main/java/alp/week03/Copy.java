package alp.week03;

import java.util.Arrays;

public class Copy {
    public static int[] main(int[] original) {
    int[]copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
           copy[i] = original[i];
        }
        return copy;
    }
}