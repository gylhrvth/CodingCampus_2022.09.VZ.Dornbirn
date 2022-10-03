package stefan.weeek02;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TaschenRechner1 {

    public static void main(String[] args) {
        do {
            System.out.println("Tachenrechner");

            float zahl1 = readUserInputFloat("Geben sie eine Zahl ein");
            float zahl2 = readUserInputFloat("Geben sie eine Zahl ein");
            String operator = readUserInput();


            if (operator.equals("+")) {
                System.out.println("Egebnis:" + (zahl1 + zahl2));
            } else if (operator.equals("-")) {
                System.out.println("Egebnis:" + (zahl1 - zahl2));
            } else if (operator.equals("*")) {
                System.out.println("Ergebnis;" + (zahl1 * zahl2));
            } else if (operator.equals("/")) {
                System.out.println("Egebnis:" + (zahl1 / zahl2));
            } else {
                System.out.println("Unbekannte Operator \"" + operator + "\". Die folgenden Operatoren sind unterstützt: + - *  /");
            }


        } while (benutzereingabe());
        System.out.println("Auf wiedersehen");

    }


    public static String readUserInput() {

        Scanner benutzereingabe = new Scanner(System.in);
        System.out.println("Geben sie ein operator ein [+|-|/|*]");

        while (true) {
            //if (benutzereingabe.hasNextLine()) {
            String operator = benutzereingabe.next();

          if (operator.equals("+")) {
                return operator;
            } else if (operator.equals("-")) {
                return operator;
            } else if (operator.equals("*")) {
                return operator;
            } else if (operator.equals("/")) {
                return operator;
            } else {
                System.out.println("Geben sie ein operator ein [+|-|/|*]");
                benutzereingabe.nextLine();
            }
        }
    }


    public static float readUserInputFloat(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        while (true) {
            if (scanner.hasNextFloat()) {
                return scanner.nextFloat();

            } else {
                System.out.println(message);
                scanner.nextLine();
            }
        }


    }

    public static boolean benutzereingabe() {
        Scanner benutzereingabe = new Scanner(System.in);
        System.out.println("Noch einmal? (J/N)");
        String line = benutzereingabe.nextLine();
        if (line.equals("J")) {
        }
        return line.equals("J");
    }


}






