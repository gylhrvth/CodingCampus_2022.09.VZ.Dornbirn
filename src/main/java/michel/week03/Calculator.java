package michel.week03;

import michel.week05.Logger;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        do {
            float input1 = userInputNumber("Bitte gib eine Zahl ein:");
            int operator = userInputOperator("Bitte gib einen Operator an: \n 1 = + \n 2 = - \n 3 = * \n 4 = /", 1, 4);
            float input2 = userInputNumber("Bitte gib eine Zahl ein:");

            switch (operator) {
                case 1 -> System.out.println("Ergebnis: " + (input1 + input2));
                case 2 -> System.out.println("Ergebnis: " + (input1 - input2));
                case 3 -> System.out.println("Ergebnis: " + (input1 * input2));
                default -> System.out.println("Ergebnis: " + (input1 / input2));
            }
        }
        while (repeadInput());
        Logger.log(Logger.INFO, "Berechnung wurde beendet");
        System.out.println("Eawas");
    }


    private static boolean repeadInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Möchten Sie noch etwas berechnen? (j/n)");
        String line = sc.nextLine();

        if (line.equals("j")) {
        }
        return line.equals("j");
    }

    private static int userInputOperator(String input, int minValue, int maxValue) {
        Scanner opsc = new Scanner(System.in);
        System.out.println(input);

        while (true) {
            if (opsc.hasNextInt()) {
                int operator = opsc.nextInt();
                if (operator < minValue || operator > maxValue) {
                    System.out.println("Bitte eine Zahl zwischen: " + minValue + " und " + maxValue + " angeben!");
                    Logger.log(Logger.WARNING, "Ungültiger Operator");
                } else {
                    return operator;
                }
            } else {
                System.out.println("Bitte eine Zahl zwischen: " + minValue + " und " + maxValue + " angeben!");
                Logger.log(Logger.WARNING, "Ungültiger Operator");
                opsc.nextLine();
            }
        }
    }

    public static float userInputNumber(String input) {
        Scanner sc = new Scanner(System.in);
        System.out.println(input);
        while (true) {
            if (sc.hasNextFloat()) {
                return sc.nextFloat();
            } else {
                Logger.log(Logger.ERROR, "Ungültige Benutzer Angabe");
                System.out.println(input);
                sc.nextLine();
            }
        }
    }
}
