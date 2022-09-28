package michel.week03;

import java.util.Arrays;
import java.util.Scanner;


public class ArraysExample {
    public static void main(String[] args) {
        userInputArraysForward();
        userInputArraysBackward();


    }


    public static void userInputArraysBackward() {
        int userInput = userInputNumber("Bitte gib eine Zahl ein:");
        int[] arr = new int[userInput];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }

        System.out.println("arr: " + Arrays.toString(arr));
    }

    public static void userInputArraysForward() {
        int userInput = userInputNumber("Bitte gib eine Zahl ein:");
        int[] arr = new int[userInput];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("arr: " + Arrays.toString(arr));
    }


    public static int userInputNumber(String input) {
        Scanner sc = new Scanner(System.in);
        System.out.println(input);

        int value = -1;
        while (value < 0) {
            if (sc.hasNextInt()) {
                value = sc.nextInt();
            } else {
                System.out.println(input);
            }

            sc.nextLine();
        }
        return value;
    }
}
