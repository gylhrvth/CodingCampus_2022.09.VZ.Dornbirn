package viktor.week02;

import viktor.week01.FunctionPrintSquare;
import viktor.week01.FunctionPrintTrinangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuWithFunktionen {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Willkommen bei meinen Aufgaben!");
        System.out.println("Was möchten Sie zeichen, bitte wählen Sie?");
        System.out.println();

        String choice = "p";

        int size = 1;
        String letter = "a";

        while (!choice.equals("n")) { //repeat until choice is not egual to "n"

            System.out.println();
            System.out.println("Menü:");
            System.out.println("1 - Triangle");
            System.out.println("2 - Quadrat");
            System.out.println("3 - Rhombus");
            System.out.println("n - Aussteigen");

            choice = sc.nextLine();

            if (choice.equals("1")) {
                System.out.println("Sie haben das Dreieck gewählt!");
                System.out.println("Wie groß soll das Dreieck sein?");
                size = sc.nextInt();
                sc.nextLine();
                System.out.println("Welches Zeichen soll dabei verwendet werden?");
                letter = sc.nextLine();
                System.out.println();
                System.out.println("Ausgabe");
                FunctionPrintTrinangle.printTriangle(letter, size);
                System.out.println();
                System.out.println("Wählen Sie bitte erneut!");


            } else if (choice.equals("2")) {
                System.out.println("Sie haben Quadrat gewählt!");
                System.out.println("Wie groß soll das Quadrat sein?");
                size = sc.nextInt();
                sc.nextLine();
                System.out.println("Welches Zeichen soll dabei verwendet werden?");
                letter = sc.nextLine();
                System.out.println("Ausgabe:");
                FunctionPrintSquare.printSquare(letter, size);
                System.out.println();
                System.out.println("Wählen Sie bitte erneut!");


            } else if (choice.equals("3")) {
                System.out.println("Sie haben den Rhombus gewählt!");
                System.out.println("Wie groß soll der Rhombus sein? Bitte geben Sie nur ungerade Zahl an! ");
                size = sc.nextInt();
                sc.nextLine();
                System.out.println("Welches Zeichen soll dabei verwendet werden?");
                letter = sc.nextLine();
                System.out.println();
                System.out.println("Ausgabe:");
                FunctionPrintTrinangle.printRhombus(letter, size);
                System.out.println();
                System.out.println("Wählen Sie bitte erneut!");

            } else if (choice.equals("n")) {
                System.out.println("Auf Wiedersehen! ");

            } else {
                System.out.println("Falsche Eingabe!");
                System.out.println("Wählen Sie bitte erneut!");
            }
        }

    }
}
