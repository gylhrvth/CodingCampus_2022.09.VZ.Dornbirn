package michel.week02;

import michel.week01.CountingWithFunction;

import java.util.InputMismatchException;
import java.util.Scanner;


public class CountingWithFunctionUserInput {
        public static void main(String[] args) {

        int length = readUserInput("Geben Sie die Länge ein:");
        int broad = readUserInput("Gebem Sie die Breite ein:");
            System.out.println();
        CountingWithFunction.printRectangle("X ", length, broad);
    }

    public static int readUserInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        int value = Integer.MIN_VALUE;
        do {
            try {
                value = sc.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Es ist keine Zahl");
            }
            sc.nextLine();
        } while (value == Integer.MIN_VALUE);
        return value;
    }
}

