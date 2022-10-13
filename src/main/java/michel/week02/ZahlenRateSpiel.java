package michel.week02;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class ZahlenRateSpiel {
    public static void main(String[] args) {
        System.out.println("Aufgabe: Zahlenraten");
        int computerNumber = new Random().nextInt(101);
        guessNumber(computerNumber);
        System.out.println();
    }

    public static int guessNumber(int computerNumber) {
        System.out.println("Willkommen zum Supercoolen Ratespiel");
        System.out.println("Errate die Zahl zwischen 0 und 100");
        System.out.println("Gib nun die Zahl ein");
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int value = 0;
        do {
            try {
                value = sc.nextInt();
                if (value < computerNumber) {
                    System.out.println("Die Zahl ist zu niedrig ");
                } else if (value > computerNumber) {
                    System.out.println("Die Zahl ist zu hoch ");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Es ist keine Zahl ");
            }
            sc.nextLine();
            counter++;
        } while (value != computerNumber);

        System.out.println("Du hast gewonnen!");
        System.out.println("Du hast es nach dem " + counter + ". Versuch geschafft!");

        return value;
    }
}

