package mase.week03;

import java.util.Random;

public class CrazyRange {
    public static Random random = new Random();

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int randomNumber = random.nextInt(101) - 50;
            arr[i] = randomNumber;
        }
        System.out.print("[");
        boolean firstLine = true;
        for (int value : arr) {
            if (firstLine) {
                firstLine = false;
            } else {
                System.out.print(value + ", ");
            }
            System.out.print(value);
        }
        System.out.print("]");
    }
}