package milan.week02;

import milan.week01.PrintX;

import java.util.InputMismatchException;
import java.util.Scanner;


public class UserInput {
    public static void main(String[] args) {
        String text = readUserInputString();
        //int size = readUserInputIntegerV1();
        //int size = readUserInputIntegerV2();
        //int size = readUserInputIntegerV3();
        int size = readUserInputIntegerV4(1, 10);
        PrintX.printX(text, size);

        //double d = readUserInputDoubleV4(-2.0, 2.0);
        //System.out.println("Das Ergebnis: " + d); //für double Methode
        System.out.println("Das Ergebnis: " + size);
    }

    public static String readUserInputString() {
        Scanner sc = new Scanner(System.in);  // erstellt ein Scanner Objekt //statt sc kann auch was anderes verwendet werden
        System.out.println("Bitte geben Sie einen Text ein:");
        String line = sc.nextLine(); //hier wird der Input gelesen

        return line; // gibt zurück was eingegeben wurde (ans Main)

    }

    public static int readUserInputIntegerV1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein:");
        int value = sc.nextInt();

        return value;

    }

    public static int readUserInputIntegerV2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein:");
        int value = 1;
        try {
            value = sc.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Es ist keine Zahl");
        }
        return value;
    }

    public static int readUserInputIntegerV3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein:");
        int value = Integer.MIN_VALUE;
        do {
            try {
                value = sc.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Leider keine Zahl!");
            }
            sc.nextLine();
        } while (value == Integer.MIN_VALUE);
        return value;

    }

    public static int readUserInputIntegerV4(int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein:");
        int value = Integer.MIN_VALUE;
        do {
            try {
                value = sc.nextInt();
                if (value < minValue) {
                    System.out.println("Die Zahl muss größer als " + minValue + " sein.");
                    value = Integer.MIN_VALUE;
                }
                if (value > maxValue) {
                    System.out.println("Die Zahl muss kleiner als " + maxValue + " sein.");
                    value = Integer.MIN_VALUE;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Leider keine Zahl!");
            }
            sc.nextLine();
        } while (value == Integer.MIN_VALUE);
        return value;

    }
    public static double readUserInputDoubleV4(double minValue, double maxValue){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein:");
        double value = Double.MIN_VALUE;
        do {
            try {
                value = sc.nextDouble();
                if (value < minValue) {
                    System.out.println("Die Zahl muss größer als " + minValue + " sein.");
                    value = Double.MIN_VALUE;
                }
                if (value > maxValue) {
                    System.out.println("Die Zahl muss kleiner als " + maxValue + " sein.");
                    value = Double.MIN_VALUE;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Leider keine Zahl!");
            }
            sc.nextLine();
        } while (value == Double.MIN_VALUE);
        return value;
    }
}

