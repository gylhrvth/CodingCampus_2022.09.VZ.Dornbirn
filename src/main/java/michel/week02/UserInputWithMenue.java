package michel.week02;

import michel.week01.CountingWithFunction;

import java.util.InputMismatchException;
import java.util.Scanner;


public class UserInputWithMenue {
    public static void main(String[] args) {
        menue();
    }

    public static void menue() {
        System.out.println("Was möchten sie Zeichnen?");
        System.out.println("1 - Christbaum");
        System.out.println("2 - Quader");
        System.out.println("3 - Rhombus");
        System.out.println("Bitte wählen Sie nun:");
        Scanner sc = new Scanner(System.in);
        boolean inputCorrect;
        int selection = 0;
        do {
            try {
                selection = sc.nextInt();
                inputCorrect = true;
                if (selection < 1 || selection > 3) {
                    System.out.println("Die Ganzzahl muss zwische [1,3] sein");
                    inputCorrect = false;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Gebe eine Zahl ein");
                inputCorrect = false;
            }
            sc.nextLine();

        } while (!inputCorrect);


        switch (selection) {
            case 1 ->
                    CountingWithFunction.printChristmasTree(userInputLetter(), "0", "+", readUserInputSize("Wie groß soll der Christbaum sein?"));
            case 2 ->
                    CountingWithFunction.printEmtySquare(userInputLetter(), readUserInputSize("Wie groß soll das Quadrat sein?"));

            case 3 ->
                    CountingWithFunction.printRombus1(userInputLetter(), readUserInputSize("Wie groß soll der Rhombus sein?"));
        }

        System.out.println("Möchten Sie noch etwas Zeichen? (j/n)");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
       while (!s.equals("j") && !s.equals("n")) {
           System.out.println("Ungültige Eingabe (j/n) ist gewünscht");
           s = scanner.nextLine();
       }
                if (s.equals("j")) {

                    menue();
                } else{
                    System.out.println("Eawas!");
                }
    }

    private static int readUserInputSize(String form) {
        System.out.println(form);
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Das ist keine Zahl");
                sc.nextLine();
            }
        }
    }


    public static String userInputLetter() {
        System.out.println("Welches Zeichen soll verwendet werden?");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}
//        int selection = readUserInputSelection();

//        int size = readUserInputSize();
//
//        String letter = UserInputLetter();

//        switch (selection) {
//            case 1 -> CountingWithFunction.printChristmasTree(letter, "0", "+", size);
//            case 2 -> CountingWithFunction.printEmtySquare(letter, size);
//            case 3 -> CountingWithFunction.printRombus1(letter, size);
//        }


//    if (selection == 1) {
//        CountingWithFunction.printChristmasTree(letter, "0", "+", size);
//    } else if (selection == 2) {
//        CountingWithFunction.printEmtySquare(letter, size);
//    } else if (selection == 3) {
//        CountingWithFunction.printRombus1(letter, size);
//    }
//    }

//    public static String UserInputLetter() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welches Zeichen soll verwendet werden?");
//        String line = sc.nextLine();
//        return line;
//    }

//    private static int readUserInputSelection() {
//
//
//        Scanner sc = new Scanner(System.in);    // Neuer Scanner für Eingabe - Benennung: sc
//        int selection = sc.nextInt();           // Scannt letzte Eingabe - Benennung: selection
//        if (selection < 1) {
//            System.out.println("Die Zahl ist zu niedrig!");
//        } else if (selection > 3) {
//            System.out.println("Die Zahl ist zu hoch!");
//        } else {
//            if (selection == 1) {
//                System.out.println("Wie groß soll der Christbaum sein?");
//            } else if (selection == 2) {
//                System.out.println("Wie groß soll das Quader sein?");
//            } else {
//                System.out.println("Wie groß soll der Rhombus sein?");
//            }
//        }
//        return selection;
//    }