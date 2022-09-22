package milan.week02;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ZahlEinlesen {
    public static void main(String[] args) {

        int size = readUserInputInteger();
        System.out.println("Ihre Eingabe: " + size);
    }

    public static int readUserInputInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein:");
        int value = Integer.MIN_VALUE;
        do {
            try {
                value = sc.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Eingabe ist leider keine Zahl!");
            }
            sc.nextLine();
        } while (value == Integer.MIN_VALUE);
        return value;
    }
}

