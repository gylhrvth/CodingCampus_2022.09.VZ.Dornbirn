package milan.week02;

import java.util.Scanner;

public class TaschenrechnerV2 {

    public static void main(String[] args) {

        // Liest 1. Float
        float num1 = readFloat("Bitte gebe die erste Zahl an!");
        // Liest Operator
        String op = readOperator();
        // Liest 2. Float
        float num2 = readFloat("Bitte gebe die zweite Zahl an!");
        // mache Berechnung
        float result = doCalculation(op, num1, num2);

        System.out.printf("%f %s %f = %f\n", num1, op, num2, result);

        String line = askContinue("Wollen Sie mit dem Ergebnis weiterrechnen? (j/n)");
        while (line.equals("j")) {
            String op2 = readOperator();
            float num3 = readFloat("Bitte gebe die nächste Zahl an!");
            float result2 = doCalculation2(op, result, num3);

            System.out.printf("%f %s %f = %f\n", result, op2, num3, result2);
            //askContinue("Wollen Sie mit dem Ergebnis weiterrechnen? (j/n)");
        }
        //askContinue("Wollen Sie mit dem Ergebnis weiterrechnen? (j/n)");
        System.out.println("Auf Wiedersehen!");
    }


    public static String askContinue(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        String line = sc.nextLine();

        if (line.equals("j")) {

        }
        return line;
    }

    public static float doCalculation(String op, float num1, float num2) {
        float result = 0;
        if (op.equals("+")) {
            result = num1 + num2;
        } else if (op.equals("-")) {
            result = num1 - num2;
        } else if (op.equals("*")) {
            result = num1 * num2;
        } else if (op.equals("/")) {
            result = num1 / num2;
        }
        return result;
    }

    public static float doCalculation2(String op2, float result, float num3) {
        float result2 = 0;
        if (op2.equals("+")) {
            result2 = result + num3;
        } else if (op2.equals("-")) {
            result2 = result - num3;
        } else if (op2.equals("*")) {
            result2 = result * num3;
        } else if (op2.equals("/")) {
            result2 = result / num3;
        }
        return result2;
    }

    public static float readFloat(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        while (true) {
            if (sc.hasNextFloat()) {
                return sc.nextFloat();
            } else {
                System.out.println(message);
                sc.nextLine();
            }
        }
    }

    public static String readOperator() {
        Scanner sc = new Scanner(System.in);
        String inputValue = "";
        while (!inputValue.equals("+") &&
                !inputValue.equals("-") &&
                !inputValue.equals("*") &&
                !inputValue.equals("/")) {
            System.out.println("Bitte einen gültigen Operator angeben! (+ , - , * , /)");
            inputValue = sc.nextLine();
        }
        return inputValue;
    }


}