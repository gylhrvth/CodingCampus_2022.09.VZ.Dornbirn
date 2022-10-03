package patric.week02;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Ratespiel {
    public static void main(String[] args) {
        rateZahl(100);
    }

    static void rateZahl(int wertebereich) {
        int zufallsZahl = new Random().nextInt(wertebereich + 1);
        //System.out.println(zufallsZahl);//Zur Überprüfung der Zufallszahl
        Scanner sc = new Scanner(System.in);
        int eingabe = 0;//Eingabe startet jetzt bei Null
        int zaehler = 0;// Startet bei Null
        do {
            try {
                System.out.println("Gib eine Zahl zwischen 0 und " + wertebereich + " ein!");

                zaehler++;
                eingabe = sc.nextInt();
                if (zufallsZahl <= eingabe) {
                    System.out.println("Du liegst falsch! Die zu erratende Zahl ist kleiner!");
                }
                if (zufallsZahl >= eingabe) {
                    System.out.println("Du liegst falsch! Die zu erratende Zahl ist GRÖSSER!");
                }
                //sc.nextLine();
            } catch (InputMismatchException ime) {
                System.out.println("Es ist keine Zahl");

            }
            sc.nextLine();//um nicht
        }
        while (zufallsZahl != eingabe);//Schleifenbedingung im Fuß
        System.out.println("Super! Du hast " + zaehler + " Durchgänge benötigt.");

    }


}