package michel.week02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputs {
    public static Scanner sc = new Scanner(System.in);          // Erstellen eines neuen Scanners für die User-Eingabe

    public static void main(String[] args) {
        userInputIntegerAllNumbers();
        userInputIntegerRange(-10, 100);
        userInputDoubleRange(-10.6, 100.99);
        userInputString();
    }

    public static int userInputIntegerAllNumbers() {
        System.out.println("Bitte geben Sie eine Zahl ein:");            // Aufforderung
        System.out.print(">>>");
        int value = Integer.MIN_VALUE;      // value: -2147483648 (oder -1)
        do {        // do-while Schleife: "Mach solange wie ----
            try {           // try-catch Abfrage
                value = sc.nextInt();        // value: Benutzereingabe über den Scanner
            } catch (
                    InputMismatchException ime) {           // Prüft ob die Eingabe dem angegebenen Typ "int" entspricht "true"
                System.out.println("Es sind nur Zahlen erlaubt!");          //Fehlermeldung bei falschem Typ
            }
            sc.nextLine();            // Geht wieder zurück zur Benutzereigabe InputMissmatch.. "true"
        } while (value == Integer.MIN_VALUE);  // ---- wie die value gleich groß ist wie Integer.MIN_VALUE
        return value;       // value wird zurückgegeben wenn Missmatch "false"
    }

    public static int userInputIntegerRange(int minValue, int maxValue) {
//        System.out.println("Bitte geben Sie eine Zahl zwischen " + minValue + " und " + maxValue + " ein:");
        System.out.print(">>> ");
        int value = Integer.MIN_VALUE;
        do {
            try {
                value = sc.nextInt();
                if (value < minValue) {         //Prüfe ob der Eingabewert kleiner als die Angegebene minValue ist
//                    System.out.printf("Die Zahl darf nicht kleiner als " + minValue + " sein! %n Bitte versuchen Sie es nocheinmal: %n >>> "); // Wenn ja Ausgabe dass Sie nicht kleiner sein darf
                    value = Integer.MIN_VALUE;       // Den value Aert wieder auf den Double.MIN Wert setzten damit die while Schleife Aktiv bleibt
                }
                if (value > maxValue) {         // Selbes Spiel wie oben nur mit der MAX value
//                    System.out.printf("Die Zahl darf nicht größer als " + maxValue + " sein! %n Bitte versuchen Sie es nocheinmal: %n >>> ");
                    value = Integer.MIN_VALUE;
                }
            } catch (InputMismatchException ime) {
//                System.out.printf("Es sind nur Zahlen erlaubt, keine Buchstaben oder Sonderzeichen! %n Bitte versuchen Sie es nocheinmal: %n >>> ");
            }
            sc.nextLine();
        } while (value == Integer.MIN_VALUE);
        return value;
    }

    public static double userInputDoubleRange(double minValue, double maxValue) {
        System.out.println("Bitte geben Sie eine Zahl zwischen " + minValue + " und " + maxValue + " ein:");
        System.out.print(">>> ");
        double value = Double.MIN_VALUE;
        do {
            try {
                value = sc.nextDouble();
                if (value < minValue) {         //Prüfe ob der Eingabewert kleiner als die Angegebene minValue ist
                    System.out.printf("Die Zahl darf nicht kleiner als " + minValue + " sein! %n Bitte versuchen Sie es nocheinmal: %n >>> "); // Wenn ja Ausgabe dass Sie nicht kleiner sein darf
                    value = Double.MIN_VALUE;       // Den value Aert wieder auf den Double.MIN Wert setzten damit die while Schleife Aktiv bleibt
                }
                if (value > maxValue) {         // Selbes Spiel wie oben nur mit der MAX value
                    System.out.printf("Die Zahl darf nicht größer als " + maxValue + " sein! %n Bitte versuchen Sie es nocheinmal: %n >>> ");
                    value = Double.MIN_VALUE;
                }
            } catch (InputMismatchException ime) {
                System.out.printf("Es sind nur Zahlen erlaubt, keine Buchstaben oder Sonderzeichen! %n Bitte versuchen Sie es nocheinmal: %n >>> ");
            }
            sc.nextLine();
        } while (value == Double.MIN_VALUE);
        return value;
    }

    public static String userInputString() {
//        System.out.println("Geben Sie einen Text ein:");
        System.out.print(">>>");
        String Value = sc.nextLine();
        return Value;
    }


//    public static void main(String[] args) {
//        String text = readUserInputString();
//        int size = readUserInputIntegerV4(1, 10);
//        PrintCharacter2.printTriangleBottomLeft(text, size);
//
//
//        double d = readUserInputDoubleV4(-2.0, 2.0);
//        System.out.println("Das Ergebnis: " + d);
//    }
//
//    public static String readUserInputString() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Geben Sie ein Text ein:");
//        String line = sc.nextLine();
//
//        return line;
//    }
//
//    public static int readUserInputInteger() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Geben Sie eine Ganzzahl ein:");
//        int value = sc.nextInt();
//
//        return value;
//    }
//
//    public static int readUserInputIntegerV2() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Geben Sie eine Ganzzahl ein:");
//        int value = 1;
//        try {
//            value = sc.nextInt();
//        } catch (InputMismatchException ime) {
//            System.out.println("Es ist keine Zahl");
//        }
//
//        return value;
//    }
//
//    public static int readUserInputIntegerV3() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Geben Sie eine Ganzzahl ein:");
//        int value = Integer.MIN_VALUE;
//        do {
//            try {
//                value = sc.nextInt();
//            } catch (InputMismatchException ime) {
//                System.out.println("Es ist keine Zahl");
//            }
//            sc.nextLine();
//        } while (value == Integer.MIN_VALUE);
//        return value;
//    }
//
//
//    public static int readUserInputIntegerV4(int minValue, int maxValue) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Geben Sie eine Ganzzahl ein:");
//        int value = Integer.MIN_VALUE;
//        do {
//            try {
//                value = sc.nextInt();
//                if (value < minValue) {
//                    System.out.println("Die Zahl muss größer gleich " + minValue + " sein.");
//                    value = Integer.MIN_VALUE;
//                }
//                if (value > maxValue) {
//                    System.out.println("Die Zahl muss kleiner gleich " + maxValue + " sein.");
//                    value = Integer.MIN_VALUE;
//                }
//            } catch (InputMismatchException ime) {
//                System.out.println("Es ist keine Zahl");
//            }
//            sc.nextLine();
//        } while (value == Integer.MIN_VALUE);
//        return value;
//    }
//
//
//    public static double readUserInputDoubleV4(double minValue, double maxValue) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Geben Sie eine Zahl ein:");
//        double value = Double.MIN_VALUE;
//        do {
//            try {
//                value = sc.nextDouble();
//                if (value < minValue) {
//                    System.out.println("Die Zahl muss größer gleich " + minValue + " sein.");
//                    value = Double.MIN_VALUE;
//                }
//                if (value > maxValue) {
//                    System.out.println("Die Zahl muss kleiner gleich " + maxValue + " sein.");
//                    value = Double.MIN_VALUE;
//                }
//            } catch (InputMismatchException ime) {
//                System.out.println("Es ist keine Zahl");
//            }
//            sc.nextLine();
//        } while (value == Double.MIN_VALUE);
//        return value;
//    }
//
}
