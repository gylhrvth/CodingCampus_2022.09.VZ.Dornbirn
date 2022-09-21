package milan.week02;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ratespiel {
    private static Random ran = new Random(); // erstellt Random Objekt; die Random Funktion wurde auf Klasse Ebene versetzt damit der Seed nur einmal von der Uhrzeit definiert ist.

    public static void main(String[] args) {
        int size = errateDieZahl();

    }

    public static int errateDieZahl() {

        int zfg = ran.nextInt(101); // definiert den Datentyp, ran.nextInt(bound: 101) erstellt die Range, die Range ist immer von 0 aus, will man zbs. eine Range von 10 bis 100, dann muss man vor ran.nextInt einfach "10 +" einfügen!
        Scanner sc = new Scanner(System.in);
        System.out.println("Willkommen beim super coolen Zahlen Ratespiel!\nErrate die Zahl zwischen 0 und 100!\nGib die Zahl nun ein:");
        int value = Integer.MIN_VALUE;
        do {
            try {
                value = sc.nextInt();
                if (value < zfg) {
                    System.out.println("Die Zahl ist zu niedrig!");
                } else if (value > zfg) {
                    System.out.println("Die Zahl ist zu hoch!");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Leider keine Zahl!");
            }
            sc.nextLine();
        } while (value != zfg);
        System.out.println("Du hast gewonnen! ! !");
        return value;
    }
}
