package alp.week02;

import alp.week01.PrintCharacters;

import java.util.Scanner;

public class AufgabeMenu {

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choosenNumber = readNumber("Bitte wählen Sie nun?", 1, 3);
            System.out.println("Geben Sie das Zeichen ein.");
            String zeichen = readZeichen();
            System.out.println("Geben Sie eine Zahl von 1 bis 30");
            if (choosenNumber == 1) {
                PrintCharacters.printSlashA(zeichen, readNumber("Wie groß", 1, 30));
            } else if (choosenNumber == 2) {
                PrintCharacters.printEmptySquare(zeichen, readNumber("Wie groß", 1, 30));
                //zeichne was anderes
            } else if (choosenNumber == 3) {
                PrintCharacters.PrintRhombus(zeichen, readNumber("Wie groß", 1, 30));
                //zeichne was anderes
            }
            System.out.println("Möchten Sie noch etwas zeichnen?");
            String frage = readJaNein();

          //  System.out.println("");

            if (!frage.equals("ja")) {
                System.out.println("Auf Wiedersehen!");
                break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Was möchten Sie zeichnen ?");
        System.out.println("1) Christbaum");
        System.out.println("2) Quader");
        System.out.println("3) Rhombus");


    }

    public static int readNumber(String prompt, int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(prompt);
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                //Frage ob Zahl gut ist?
                if (number >= minValue && number <= maxValue) {
                    return number;
                }
            }
        }
    }

    public static String readZeichen() {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        return line;

    }

    public static String readJaNein() {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        return line;


    }
}