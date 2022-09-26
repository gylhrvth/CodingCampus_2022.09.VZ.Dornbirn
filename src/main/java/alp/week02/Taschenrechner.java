package alp.week02;

import java.util.Scanner;

public class Taschenrechner {



    public static float readNumber() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Bitte geben Sie eine Kommazahl an!");
            if (sc.hasNextFloat()) {
                float number = sc.nextFloat();
                return number;
            } else {
                System.out.println("Falsche eingabe.");
                System.out.println("Bitte Wählen Sie erneut.");
            }
            sc.nextLine();
        }
    }



    public static String operator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Rechenvorgang ein!" + " (+ , - , * , / , ^) ");
        return sc.nextLine();

    }



    public static float hochgestellt(float number1, float number2) {  // Hochgestelltfunktion
        float ergebnis = 1f;
        float zwischenergebnis = 1f;
        int i = 1;
        while (i <= number2) {
            ergebnis *= zwischenergebnis * number1;    // ergebnis *= (bedeutet -> ergebnis = ergebnis * (zwischenergebnis * number1)
            i++;
        }
        return ergebnis;
    }



    public static String readJaNein() {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        return line;
    }




    public static void main(String[] args) {
        while (true) {

            float number1 = readNumber();
            String op = operator();
            float number2 = readNumber();
            float ergebnis;
            if (op.equals("+")) {
                ergebnis = number1 + number2;
                System.out.println("Ergebnis  " + ergebnis);
            } else if (op.equals("-")) {
                ergebnis = number1 - number2;
                System.out.println("Ergebnis  " + ergebnis);
            } else if (op.equals("*")) {
                ergebnis = number1 * number2;
                System.out.println("Ergebnis  " + ergebnis);
            } else if (op.equals("/")) {
                ergebnis = number1 / number2;
                System.out.println("Ergebnis  " + ergebnis);
            } else if (op.equals("^")) {
                ergebnis = hochgestellt(number1, number2);
                System.out.println("Ergebnis  " + ergebnis);
            }
            System.out.println("Möchten Sie erneut Rechnen?");
            String frage = readJaNein();
            if (!frage.equals("ja")) {
                System.out.println("Auf Wiedersehen!");
                break;
            }
        }

    }
}

