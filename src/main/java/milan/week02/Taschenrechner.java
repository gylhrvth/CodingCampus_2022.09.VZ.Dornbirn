package milan.week02;

import java.util.Scanner;

public class Taschenrechner {

    public static void main(String[] args) {

        do {
            float eingabe = readFloatInput("Bitte gebe eine Kommazahl ein:");
            int auswahl = readOperatorInput("Bitte Operator angeben:\n1: +\n2: -\n3: *\n4: /", 1, 4);
            float eingabe2 = readFloatInput("Bitte gebe eine zweite Kommazahl ein:");

            if (auswahl == 1) {
                System.out.println("Ergebnis: " + (eingabe + eingabe2));
            } else if (auswahl == 2) {
                System.out.println("Ergebnis: " + (eingabe - eingabe2));
            } else if (auswahl == 3) {
                System.out.println("Ergenis: " + (eingabe * eingabe2));
            } else {
                System.out.println("Ergebnis: " + (eingabe / eingabe2));
            }
        } while (wiederholungInput());
        System.out.println("Auf Wiedersehen!");
    }

    public static float readFloatInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        while (true) {
            if (sc.hasNextFloat()) {
                return sc.nextFloat();
            } else {
                System.out.println(prompt);
                sc.nextLine();
            }
        }
    }


    public static int readOperatorInput(String prompt, int minValue, int maxValue) {
        Scanner opsc = new Scanner(System.in);
        System.out.println(prompt);

        while (true) {
            if (opsc.hasNextInt()) {
                int operator = opsc.nextInt();
                if (operator < minValue || operator > maxValue) {
                    System.out.println("Bitte eine Zahl zwischen: " + minValue + " und " + maxValue + " angeben!");
                } else {
                    return operator;
                }
            } else {
                System.out.println("Bitte eine Zahl zwischen: " + minValue + " und " + maxValue + " angeben!");
                opsc.nextLine();
            }
        }
    }

    public static boolean wiederholungInput() {
        Scanner wh = new Scanner(System.in);
        System.out.println("Möchten Sie noch etwas berechnen? (J/N)");
        String line = wh.nextLine();

        if (line.equals("J")) {
        }
        return line.equals("J");

    }
}