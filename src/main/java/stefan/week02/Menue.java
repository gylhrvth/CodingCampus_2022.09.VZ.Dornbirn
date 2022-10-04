package stefan.week02;

import stefan.week01.CountingWithFunktionen;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Menue {

    public static void main(String[] args) {
        do {
            printMenu();
            int objectChoice = readUserInputInteger1(1, 4);
            if (objectChoice == 1) {
                // printChars
              int anzahl =  readUserIntegerSize();
              String zeichen = reaUserInteger();
                    CountingWithFunktionen.printChars(zeichen,anzahl);
                System.out.println();
            } else if (objectChoice == 2) {
                //printTriangleBottomRight
                int anzahl =  readUserIntegerSize();
                String zeichen = reaUserInteger();
                CountingWithFunktionen.printTriangleBottomRight(zeichen,anzahl);
            } else if (objectChoice == 3) {
                // printRect
                int anzahl =  readUserIntegerSize();
                int to =  readUserIntegerSize();
                String zeichen = reaUserInteger();
                CountingWithFunktionen.printRect(zeichen, anzahl,to);
            } else {
                // printTriangleBottomLeft
                int anzahl =  readUserIntegerSize();
                String zeichen = reaUserInteger();
                CountingWithFunktionen.printTriangleBottomLeft(zeichen, anzahl);
            }
        } while(readUserInputIntegerJN());

    }

    public static void printMenu() {
        System.out.println("Willkommen bei meiner Aufgabe");
        System.out.println();
        System.out.println();
        System.out.println("1" + " PrintChars");
        System.out.println("2" + " TriangleRight");
        System.out.println("3" + " PrintRect");
        System.out.println("4" + " TriangleLeft");
        System.out.println();


    }

    public static int readUserInputInteger1(int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte wählen sie:");
        int value = Integer.MIN_VALUE;
        do {
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
                System.err.println("Es ist keine Zahl");
            }
            sc.nextLine();
        } while (value == Integer.MIN_VALUE);
        return value;


    }

    public static String reaUserInteger() {
        System.out.println("Welche Zeichen sollen verwendet werden");
        Scanner scanner = new Scanner(System.in);
        String zeichen = scanner.nextLine();
        return zeichen;
    }
    public static int readUserIntegerSize() {
        System.out.println("Wie groß soll der Objekt sein");
        Scanner size = new Scanner(System.in);
       int anzahl =  size.nextInt();
        return anzahl;
    }

    public static boolean readUserInputIntegerJN() {
        System.out.println("Wollen sie Zeichnen [j/n]:");
        Scanner jn = new Scanner(System.in);
        String input = jn.next();
        //Ist der input gleich j
        if (input.equals("j")) {
            return true;
        } else {
            System.err.println(" Goodbye!!!! ");
            return false;

        }
    }

}





