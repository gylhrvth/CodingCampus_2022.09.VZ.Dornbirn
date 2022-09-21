package batuhan.week02;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Ratespiel {

    public static void main(String[] args) {

        int numberOfComputer = new Random().nextInt(100);
        // TODO: 21.09.2022 Lesen User Number
        Scanner sc = new Scanner(System.in);//Hier wird ein Scanner Objekt erstellt
        // TODO: 21.09.2022 Prüfen ob Number zu klein oder zu groß ist
        int meineNummer = -1;
        System.out.println("Willkommen beim super coolen Zahlen Ratespiel ");
        System.out.println("Errate die Zahl Zwischen 0-100! ");
        System.out.println("Gib die Zahl nun ein: ");

        while (meineNummer != numberOfComputer) {// != bedeutet nicht gleich
            try {
                meineNummer = sc.nextInt();//mit der Methode nextInt wird der Input vom User eingelesen
                if (meineNummer > numberOfComputer) {//wenn die Zahl zugroß ist
                    System.out.println("Diese Nummer ist zugroß");
                } else if (meineNummer < numberOfComputer) {//wenn die Zahl zuklein ist
                    System.out.println("Diese Nummer ist zuklein");
                } else {//sollte if oder else if stimmten wird else ausgeführt
                    System.out.println("Glückwunsch du hast Gewonnen!!! ");
                }

            } catch (InputMismatchException ime) {//catch brauch immer eine Excption
                System.out.println("Es ist keine Zahl!! ");
            }sc.nextLine();//zeilenbruch


        }


        // TODO: 21.09.2022 Wiederholen so lange, bis der User nicht getroffen hat


    }
}