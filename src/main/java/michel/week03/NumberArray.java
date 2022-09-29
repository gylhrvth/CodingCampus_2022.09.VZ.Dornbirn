package michel.week03;

import java.util.Arrays;
import java.util.Random;

public class NumberArray {
    public static Random random = new Random();

    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int randomNumber = random.nextInt(101);
            arr[i] = randomNumber;
        }
        System.out.printf("Ausgabe for i - Schleife: %n" + Arrays.toString(arr) + "%n");

        System.out.println("--------------------------------");
        System.out.println("Aufgabe for each - Schleife: ");
        boolean firstLine = true;
        System.out.print("[");
        for (int i : arr) {
            if (firstLine) {
                firstLine = false;
            } else {
                System.out.print(", ");
            }
            System.out.print(i);
        }
        System.out.printf("]%n");


        System.out.println("--------------------------------");
        System.out.println("Aufgabe arr Wert 2 + 5 + 10 ausgeben: ");
        if (arr.length > 1) {
            System.out.print("[");
            System.out.print(arr[1]);
        }
        if (arr.length > 4) {
            System.out.print(", ");
            System.out.print(arr[4]);
        }
        if (arr.length > 9) {
            System.out.print(", ");
            System.out.print(arr[9]);
        }
        System.out.println("]");

//        System.out.println("Fehler wenn Array.length > arr[1]");
//        System.out.printf("[" + arr[1] + ", " + arr[4] + ", " + arr[9] + "]%n");

        System.out.println("--------------------------------");
        System.out.println("Aufgabe jede 2. Wert ausgeben: ");
        boolean firstLineSecond = true;
        System.out.print("[");
        for (int i = 1; i < arr.length; i = i + 2) {
            if (firstLineSecond) {
                firstLineSecond = false;
            } else {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");


    }
}
