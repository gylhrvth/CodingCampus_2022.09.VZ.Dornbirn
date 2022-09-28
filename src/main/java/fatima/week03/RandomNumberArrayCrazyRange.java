package fatima.week03;

import java.util.Random;

public class RandomNumberArrayCrazyRange {

    private static Random rand = new Random();

    public static void main(String[] args) {
        int[] values = generateRandomValues(10);
        RandomNumberArray.printWithForEach(values);
    }

    public static int[] generateRandomValues(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(101) - 50;
        }
        return arr;
    }
}
