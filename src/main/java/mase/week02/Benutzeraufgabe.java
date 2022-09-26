package mase.week02;

import mase.week01.CountingWithFunction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Benutzeraufgabe {
    public static void main(String[] args) {
//        String text = readUserInput();
        int columns = readUserInput("Geben Sie die Reihen ein");
        int length = readUserInput("Geben Sie die Länge ein");
        mase.week01.CountingWithFunction.printRect("x", columns, length);

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


