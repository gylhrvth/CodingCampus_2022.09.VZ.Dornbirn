package milan.week02;

import milan.week01.PrintX;
import milan.week01.PrintRhombus;
import milan.week01.PrintTriangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menue {
    public static void main(String[] args) {

        System.out.println("Willkommen bei meinen Aufgaben!");
        do {
            int menu = chooseMenu(1, 3);
            if (menu == 1) {
                System.out.println("Wie groß soll das X sein?");
                int size = readUserInputInteger();
                String letter = readUserInputString();
                PrintX.printX(letter, size);
            } else if (menu == 2) {
                System.out.println("Wie groß soll der Rhombus sein?");
                int size = readUserInputInteger();
                String letter = readUserInputString();
                PrintRhombus.printRhombus(letter, size);
            } else {
                System.out.println("Wie groß soll das Dreieck sein?");
                int size = readUserInputInteger();
                String letter = readUserInputString();
                PrintTriangle.printTriangle1(letter, size);
            }
        } while (continueInputString());
        System.out.println("Auf Wiedersehen!");
    }


    public static int chooseMenu(int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Was möchten Sie zeichnen?\n1) X\n2) Rhombus\n3) Dreieck\n Bitte wählen Sie nun!");
        int value = Integer.MIN_VALUE;
        do {
            try {
                value = sc.nextInt();
                if (value < minValue) {
                    System.out.println("Bitte eine Zahl von 1 bis 3 angeben!");
                    value = Integer.MIN_VALUE;
                }
                if (value > maxValue) {
                    System.out.println("Bitte eine Zahl von 1 bis 3 angeben!");
                    value = Integer.MIN_VALUE;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Eingabe ist leider keine Zahl!");
            }
            sc.nextLine();
        } while (value == Integer.MIN_VALUE);

        return value;
    }

    public static int readUserInputInteger() {
        Scanner sc = new Scanner(System.in);
        int value = Integer.MIN_VALUE;
        do {
            try {
                value = sc.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Eingabe ist keine Zahl!");
            }
            sc.nextLine();
        } while (value == Integer.MIN_VALUE);
        return value;
    }

    public static String readUserInputString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welches Zeichen soll verwendet werden?");
        String line = sc.nextLine();

        return line;
    }

    public static boolean continueInputString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Möchten Sie noch etwas zeichnen? (j/n)");
        String line = sc.nextLine();

        if (line.equals("j")) { //Zeile 88 - 92 ist gleich wie "return line.equals("j")"
//            return true;
//        } else {
//            return false;
        }
        return line.equals("j"); // line.equals("") bedeutet line ist gleich dem Inhalt in der Klammer
    }


}
