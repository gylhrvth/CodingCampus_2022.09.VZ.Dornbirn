package viktor.week02;

import java.util.Scanner;

public class Calculator {

    public static float readNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie mir bitte eine Kommazahl an!");
        float number = 1;

        while (true) {
            if (sc.hasNextFloat()) {
                number = sc.nextFloat();
                return number;
            } else {
                System.out.println("Falsche Eingabe! Geben Sie mir bitte eine Kommazahl an!");
                sc.nextLine();
            }
        }
    }

    public static String readOperator(){
        Scanner sc = new Scanner(System.in);

        String operator = " ";
        while (!(operator.equals("+") ||
                operator.equals("-") ||
                operator.equals("*") ||
                operator.equals("/") ||
                operator.equals("^"))) {

            System.out.println("Geben Sie mir bitte einen Operator an: (+, - , * , / , ^ )");
             operator = sc.nextLine();
            }
        return operator;
        }

    public static float powerToNumber(float a, float b) {

        int result1 = 1;
        int result2 = 1;
        int i = 1;

        while (i <= b) {
            result2 *= result1 * a;
            i++;
        }
        return result2;
    }

    public static String question() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Möchten Sie noch weiterrechnen?");
        return sc.nextLine();
    }


    public static void main(String[] args) {


        System.out.println("Willkommen beim Taschenrechner!");

        float num1 = 0f;
        float num2 = 0f;
        String op = "p";
        float result = 0;

        while (true) {

            num1 = readNumber();
            op = readOperator();
            num2 = readNumber();

            if (op.equals("+")) {
                result = num1 + num2;
                System.out.println("Ergebnis:" + result);


            } else if (op.equals("-")) {
                result = num1 - num2;
                System.out.println("Ergebnis:" + result);


            } else if (op.equals("*")) {
                result = num1 * num2;
                System.out.println("Ergebnis:" + result);


            } else if (op.equals("/")) {
                result = num1 / num2;
                System.out.println("Ergebnis:" + result);


            } else if (op.equals("^")) {
                result = powerToNumber(num1, num2);
                System.out.println("Ergebnis:" + result);
            }


            String question = question();

            if (!question.equals("ja")) {
                System.out.println("Auf Wiedersehen!");
                break;
            }
        }
    }
}
