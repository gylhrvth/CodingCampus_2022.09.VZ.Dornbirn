package batuhan.week02;


import java.util.InputMismatchException;
import java.util.Scanner;

import batuhan.week01.CountingWithFunction;
import batuhan.week06.Logger;


public class ZeichnenAufgabe {


    public static void main(String[] args) {
        printMenu();


        int choice = readUserInputNumber(1, 3);
        while (true) {
            if (choice == 1) {
                System.out.println("Wie groß soll das Dreieck werden? ");
                int size = readUserInputNumber(1, 15);
                System.out.println("Welchen Zeichen willst du verwenden? ");
                String text = readUserInputString();
                CountingWithFunction.printTriangle(text, size);
            } else if (choice == 2) {
                System.out.println("Wie breit soll das Rechteck werden? ");
                int size = readUserInputNumber(1, 15);
                System.out.println("Wie hoch soll das Rechteck werden? ");
                int height = readUserInputNumber(1, 15);
                System.out.println("Welches Zeichen soll das Rechteck haben? ");
                String text = readUserInputString();
                CountingWithFunction.printRect(text, size, height);
            } else if (choice == 3) {
                System.out.println("Wie hoch soll der Slash werden? ");
                int size = readUserInputNumber(1, 15);
                System.out.println("Welches Zeichen willst du verwenden?");
                String text = readUserInputString();
                CountingWithFunction.printSlash(text, size, true);
            }

            System.out.println("Wollen Sie nocheinmal?");
            System.out.println("ja? ");
            System.out.println("nein? ");

            String text2 = readUserInputString();
            if (text2.equals("ja")) {

            } else if (text2.equals("nein")) {
                System.out.println("Vielen dank, aufwiedersehen");
                break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Willkommen bei meinen Aufgaben!");
        System.out.println("Was möchtest du Zeichnen");
        System.out.println("1.Dreieck? ");
        System.out.println("2.Rechteck? ");
        System.out.println("3.Slash? ");

    }


    public static int readUserInputNumber(int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        int value = Integer.MIN_VALUE;
        while (value == Integer.MIN_VALUE) {
            try {
                value = sc.nextInt();
                if (value < minValue) {
                    System.out.println("Die Zahl muss größer als " + minValue + " sein.");
                    value = Integer.MIN_VALUE;
                    Logger.log(2,"Zu kleine Zahl");
                } else if (value > maxValue) {
                    System.out.println("Die Zahl muss kleiner als " + maxValue + " sein.");
                    value = Integer.MIN_VALUE;
                    Logger.log(2,"Zu große  Zahl");
                } else {
                    break;
                }
            } catch (InputMismatchException ime) {
                System.err.println("Es ist keine Zahl.");
                Logger.log(1,"Falsche eingabe" );
            }
            sc.nextLine();
        }
        return value;
    }

    public static String readUserInputString() {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Logger.log(3,line);
        return line;

    }
}

