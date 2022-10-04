package stefan.weeek02;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RateSpiel {
    public static void main(String[] args) {

        readUserInputInteger();

    }

    public static void readUserInputInteger() {
        System.out.println("Wilkommen beim super coolen Zahlen Ratespiel");
        System.out.println();
        System.out.println("Errate Die Zahl zwischen 0 und 100");

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Geben Sie eine Zahl ein:");
        int zufallZahlVonComputer = new Random().nextInt(101);
        //System.out.println(zufallZahlVonComputer);
        int value = Integer.MIN_VALUE;
        do {
            try {
                value = sc.nextInt();

                if (zufallZahlVonComputer > value) {
                    System.out.println("Zu klein " );
                } else if (zufallZahlVonComputer< value) {
                    System.out.println("zu Groß");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Es ist keine Zahl");
            }
            sc.nextLine();
        } while (zufallZahlVonComputer != value);
        System.out.println("Richtig du hast gewonnen!!!");
    }
}