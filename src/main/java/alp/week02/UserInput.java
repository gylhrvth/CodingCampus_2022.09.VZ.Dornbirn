package alp.week02;

import fatima.week01.PrintCharacters;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {  public static void main(String[] args) {
    String text = readUserInputString();
    int size = readUserInputIntegerV4(1, 10);
    PrintCharacters.printTriangleTopLeft(text, size);

    double d = readUserInputDoubleV4(-2.0, 2.0);
    System.out.println("Das Ergebnis: " + d);
}

    public static String readUserInputString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie ein Text ein:");
        String line = input.nextLine();

        return line;
    }

    public static int readUserInputInteger() {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie eine Ganzzahl ein:");
        int value = input.nextInt();

        return value;
    }

    public static int readUserInputIntegerV2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie eine Ganzahl ein:");
        int value = 1;
        try {
            value = input.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Es ist keine Zahl");
        }
        return value;
    }

    public static int readUserInputIntegerV3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie eine Ganzzahl ein:");
        int value = Integer.MIN_VALUE;
        do {
            try {
                value = input.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Es ist keine Zahl");
            }
            input.nextLine();
        } while (value == Integer.MIN_VALUE);
        return value;
    }

    public static int readUserInputIntegerV4(int minValue, int maxValue) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie eine Ganzzahl ein:");
        int value = Integer.MIN_VALUE;
        do {
            try {
                value = input.nextInt();
                if (value < minValue) {
                    System.out.println("Die Zahl muss größer gleich " + minValue + " sein.");
                    value = Integer.MIN_VALUE;
                }
                if (value > maxValue) {
                    System.out.println("Die Zahl muss kleiner gleich " + maxValue + " sein.");
                    value = Integer.MAX_VALUE;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Es ist keine Zahl");
            }
            input.nextLine();
        } while (value == Integer.MIN_VALUE);
        return value;
    }

    public static double readUserInputDoubleV4(double minValue, double maxValue) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein:");
        double value = Double.MIN_VALUE;
        do {
            try {
                value = input.nextDouble();
                if (value < minValue) {
                    System.out.println("Die Zahl muss größer gleich " + minValue + " sein.");
                    value = Double.MIN_VALUE;
                }
                if (value > maxValue) {
                    System.out.println("Die Zahl muss kleiner gleich " + maxValue + " sein.");
                    value = Double.MAX_VALUE;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Es ist keine Zahl");
            }
            input.nextLine();
        } while (value == Double.MIN_VALUE);
        return value;
    }
}


