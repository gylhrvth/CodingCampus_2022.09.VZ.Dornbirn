package mase.week02;

import mase.week01.CountingWithFunction;
import mase.week05.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menue {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean reapeat = true;

        while (reapeat) {

            System.out.println("Was möchten Sie zeichnen");
            System.out.println("1 für Quader");
            System.out.println("2 für Leeren Quader");
            System.out.println("3 für Backslash");
            Scanner sc = new Scanner(System.in);
            boolean correctInput = true;
            int selection = 0;
            do {
                try {
                    selection = sc.nextInt();
                    correctInput = true;
                    if (selection < 1 || selection > 3) {

                        System.out.println("Bitte geben Sie eine Zahl ein von 1-3");
                    }
                } catch (InputMismatchException ime) {
                    System.out.println("Es ist keine Zahl");
                    correctInput = false;
                }
                sc.nextLine();
            } while (!correctInput);


            switch (selection) {
                case 1:
                    CountingWithFunction.printSquare(userInputString(), userInputInt());
                    break;
                case 2:
                    CountingWithFunction.printEmptySquare(userInputString(), userInputInt());
                    break;
                default:
                case 3:
                    CountingWithFunction.printBackSlash(userInputString(), userInputInt());
                    break;

            }
            System.out.println("Möchten Sie etwas Zeichnen? (j/n)");

            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            while (!s.equals("j") && !s.equals("n")) {
                System.out.println("(j/n)");
                s = scanner.nextLine();
            }
            if (s.equals("j")) {
                //menu();
                System.out.println("neu beginn");
            } else {
                System.out.println("eawas");
                reapeat = false;
            }

        }
    }

    public static String userInputString() {
        System.out.println("Welches Zeichen soll verwendet werden");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int userInputInt() {

        System.out.println("Wie groß soll Ihr Zeichen werden");
        Scanner linus = new Scanner(System.in);
        return linus.nextInt();
    }

}


