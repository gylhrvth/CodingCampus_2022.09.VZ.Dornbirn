package stefan.weeek02;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Glueckspiel {

    public static void main(String[] args) {

        benuzerEingabe();


    }


    public static void benuzerEingabe() {
        int randy = new Random(100).nextInt(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Spieler 1 geben sie ein Zahl ein");
        int zahl1 = scanner.nextInt()%100;
        System.out.println("Spieler 2 geben sie eine Zahl ein");
        int zahl2 = scanner.nextInt();


        do {


            try {

                if (zahl1 > randy) {
                    System.out.println("Spieler 2 zu hoch ");
                    System.out.println("Spieler1 zwei hatt gewonnen" );
                    System.out.println("ERGEBNIS:" +randy);
                }


                else if (zahl2 > randy) {
                    System.out.println("Spieler1 zu hoch ");
                    System.out.println("Spieler2 zwei hatt gewonnen " );
                    System.out.println("ERGEBNIS:" +randy);
                }

                else if (zahl1 < randy) {
                    System.out.println("Spieler 1 zu niedrig ");
                    System.out.println("Spieler2  hatt gewonnen" );
                    System.out.println("ERGEBNIS:" +randy);
                }
                else if (zahl2 < randy) {
                    System.out.println("Spieler 2 zu niedrig ");
                    System.out.println("Spieler1 zwei hatt gewonnen" );
                    System.out.println("ERGEBNIS:" +randy);
                }else {
                    System.out.println("Es is keine Zahl");

                }


            } catch (InputMismatchException ime) {
                    System.out.println("Es ist keine Zahl");



            }
            scanner.nextInt();
        } while (zahl1 ==zahl2 );


        System.out.println("sdkn");


        System.out.println(randy);
    }
}

