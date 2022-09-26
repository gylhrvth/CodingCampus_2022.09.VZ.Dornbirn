package gyula.week02;

import patric.week01.PrintCharacter2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        String text = readUserInputString();
        int size = readUserInputIntegerV5(1, 10);
        PrintCharacter2.printTriangleBottomLeft(text, size);


        double d = readUserInputDoubleV4(-2.0, 2.0);
        System.out.println("Das Ergebnis: " + d);
    }

    public static String readUserInputString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie ein Text ein:");
        String line = sc.nextLine();

        return line;
    }

    public static int readUserInputInteger(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine Ganzzahl ein:");
        int value = sc.nextInt();

        return value;
    }

    public static int readUserInputIntegerV2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine Ganzzahl ein:");
        int value = 1;
        try {
            value = sc.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Es ist keine Zahl");
        }

        return value;
    }

    public static int readUserInputIntegerV3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine Ganzzahl ein:");
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



    public static int readUserInputIntegerV4(int minValue, int maxValue){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine Ganzzahl ein:");
        int value = Integer.MIN_VALUE;
        while (value == Integer.MIN_VALUE) {
            try {
                value = sc.nextInt();
                if (value < minValue) {
                    System.out.println("Die Zahl muss größer gleich " + minValue + " sein.");
                    value = Integer.MIN_VALUE;
                }
                if (value > maxValue) {
                    System.out.println("Die Zahl muss kleiner gleich " + maxValue + " sein.");
                    value = Integer.MIN_VALUE;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Es ist keine Zahl");
            }
            sc.nextLine();
        }
        return value;
    }

    public static int readUserInputIntegerV5(int minValue, int maxValue){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine Ganzzahl ein:");
        int value = Integer.MIN_VALUE;
        while (value == Integer.MIN_VALUE) {
            try {
                String valueText = sc.nextLine();
                value = Integer.parseInt(valueText);
                if (value < minValue) {
                    System.out.println("Die Zahl muss größer gleich " + minValue + " sein.");
                    value = Integer.MIN_VALUE;
                }
                if (value > maxValue) {
                    System.out.println("Die Zahl muss kleiner gleich " + maxValue + " sein.");
                    value = Integer.MIN_VALUE;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Es ist keine Zahl");
            }
        }
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
                    System.out.println("Die Zahl muss größer gleich " + minValue + " sein.");
                    value = Double.MIN_VALUE;
                }
                if (value > maxValue) {
                    System.out.println("Die Zahl muss kleiner gleich " + maxValue + " sein.");
                    value = Double.MIN_VALUE;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Es ist keine Zahl");
            }
            sc.nextLine();
        } while (value == Double.MIN_VALUE);
        return value;
    }


}
