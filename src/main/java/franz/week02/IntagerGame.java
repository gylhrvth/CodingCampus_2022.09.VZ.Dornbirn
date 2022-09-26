package franz.week02;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class IntagerGame {

    public static void main(String[] args) {
        //fungameConsoleInput();
        menue();
    }

    public static String readText() {
        System.out.println("Welches Zeichen soll verwendet werden?");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int readSize(String form) {
        System.out.printf("Wie groß soll der %s sein?\n", form);
        Scanner sc = new Scanner(System.in);

        boolean inputcorrect = true;
        int value = -1;
        do {
            try {
                value = sc.nextInt();
                if (value < 0) {
                    System.out.println("Die Ganzzahl muss größer 0 sein");
                    inputcorrect = false;
                } else {
                    inputcorrect = true;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Gebe eine Zahl ein");
                inputcorrect = false;
            }
            sc.nextLine();
        }
        while (!inputcorrect);
        return value;
    }

    public static void menue() {
        System.out.println("Willkommen bei meinen Aufgaben!");
        System.out.println("Was möchten Sie zeichnen?");
        System.out.println("1 printChars\n2 printEmptySquare\n3 printSlash\n4 printTriangle1\n");



        System.out.println("Wähle ein Print (1-4)");
        Scanner sc = new Scanner(System.in);
        boolean inputcorrect = true;
        int value = -1;
        do {
            try {
                value = sc.nextInt();
                inputcorrect = true;
                if (value < 1 || value > 4) {
                    System.out.println("Die Ganzzahl muss zwische [1,4] sein");
                    inputcorrect = false;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Gebe eine Zahl ein");
                inputcorrect = false;
            }
            sc.nextLine();
        }
        while (!inputcorrect);

        switch (value) {
            case 1:
                MethodenundSchleifenMitUserinput.printChars(readText(), readSize("Chars"));
                break;
            case 2:
                MethodenundSchleifenMitUserinput.printEmptySquare(readText(), readSize("Square"));
                break;
            case 3:
                MethodenundSchleifenMitUserinput.printSlash(readText(), readSize("Slash"));
                break;
            case 4:
            default:
                MethodenundSchleifenMitUserinput.printTriangle1(readText(), readSize("triangel"));
                break;
        }

        System.out.println("Möchten Sie noch etwas Zeichen? (j/n)");
        String s = sc.nextLine();
       // boolean inputcorrect = true
        if (s.equals("j")) {
       //     return true;
            menue();
        } else {
            // return false;
            System.out.println("Tschau");

        }
    }

    public static int readUserInputInteger(int minValue, int maxValue) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie eine Ganzzahl ein");
        int value = Integer.MIN_VALUE;
        do {
            try {
                value = sc.nextInt();
                if (value < minValue) {
                    System.out.println("Die Zahl muss größer sein");
                    value = Integer.MIN_VALUE;
                }
                if (value > maxValue) {
                    System.out.println("Die Zahl muss kleiner sein");
                    value = Integer.MIN_VALUE;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Keine Ganzzahl oder Integer Range überschritten. Neue Zahl eingeben");
            }
            sc.nextLine();
        }
        while (value == Integer.MIN_VALUE);
        return value;
    }

    public static int fungameConsoleInput() {

        Scanner sc = new Scanner(System.in);
        boolean inputcorrect = false;
        int val = 0;
        while (!inputcorrect) {
            try {
                System.out.println("Bitte gebe eine Zahl ein die erraten werden soll");
                val = sc.nextInt();
                inputcorrect = true;
            } catch (InputMismatchException exp) {
                System.out.println("Spast");
            }
            sc.nextLine();
        }
        return fungameLogic(val);
    }

    public static int fungameRandom() {
        return fungameLogic(new Random().nextInt(0, 101));
    }

    public static int fungameLogic(int valuetoGuess) {
        System.out.println("Willkommen beim super coolen Zahlen Ratespiel");
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie eine Ganzzahl ein");
        int value = Integer.MIN_VALUE;
        do {
            try {
                value = sc.nextInt();
                if (value < valuetoGuess) {
                    System.out.println("Die Zahl muss größer sein");
                } else if (value > valuetoGuess) {
                    System.out.println("Die Zahl muss kleiner sein");
                }

            } catch (InputMismatchException ime) {
                System.out.println("Keine Ganzzahl oder Integer Range überschritten. Neue Zahl eingeben");
            }
            sc.nextLine();

        } while (value != valuetoGuess);
        System.out.printf("JUHU Du hast gewonnen die zu erratende Zahl war %d", valuetoGuess);
        return value;
    }

    public static int fungame() {

        System.out.println("Willkommen beim super coolen Zahlen Ratespiel");

        int valuetoGuess = new Random().nextInt(0, 101);

        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie eine Ganzzahl ein");
        int value = Integer.MIN_VALUE;
        do {
            try {
                value = sc.nextInt();
                if (value < valuetoGuess) {
                    System.out.println("Die Zahl muss größer sein");
                } else if (value > valuetoGuess) {
                    System.out.println("Die Zahl muss kleiner sein");
                }

            } catch (InputMismatchException ime) {
                System.out.println("Keine Ganzzahl oder Integer Range überschritten. Neue Zahl eingeben");
            }
            sc.nextLine();

        } while (value != valuetoGuess);
        System.out.printf("JUHU Du hast gewonnen die zu erratende Zahl war %d", valuetoGuess);
        return value;
    }
}