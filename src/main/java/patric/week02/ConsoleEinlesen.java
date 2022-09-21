package patric.week02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleEinlesen {


    public static void main(String[] args) {
//       String text = readUserInputString();
//      int size = readUserInputInteger();

        int width = readUserInput("Geben Sie die Breite ein:");
        int height = readUserInput("Gebe Sie die Höhe ein:");

        patric.week01.PrintCharacter2.printRectangle("X ", width, height);
    }

    public static String readUserInputString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie ein Text ein:");
        String line = sc.nextLine();

        return line;
    }

    public static int readUserInputInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine Ganzzahl ein:");
        int value = 1;
        try {
            value = sc.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Dies ist keine Zahl");
        }

        return value;
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


