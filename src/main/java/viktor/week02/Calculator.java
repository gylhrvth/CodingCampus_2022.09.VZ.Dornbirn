package viktor.week02;

import viktor.week05.Logging;

import java.util.Scanner;

public class Calculator {

    public static float readNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie mir bitte eine Kommazahl an!");
        float number = 1;

        while (true) {
            if (sc.hasNextFloat()) {
                number = sc.nextFloat();
                Logging.log(3, "Eingabe wurde durchgeführt!");
                return number;
            } else {
                System.out.println("Falsche Eingabe! Geben Sie mir bitte eine Kommazahl an!");
                Logging.log(1, "Die Eingabe war falsch!");
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


                //Logging.log(3,"Operator wurde angegeben!");

                //Logging.log(2, "Falsche Eingabe");


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
        Logging.log(2,"Frage zum Aussteigen! ");
        return sc.nextLine();
    }

    public static float doCalculation(String op, float num1, float num2 ){

        float result=0;

        if (op.equals("+")) {
            result = num1 + num2;

        } else if (op.equals("-")) {
            result = num1 - num2;

        } else if (op.equals("*")) {
            result = num1 * num2;

        } else if (op.equals("/")) {
            result = num1 / num2;

        } else if (op.equals("^")) {
            result = powerToNumber(num1, num2);
        }
        return result;
    }


    public static void main(String[] args) {

        Logging.log(3,"Software wurde gestartet!");
        System.out.println("Willkommen beim Taschenrechner!");


        float num1 = 0;
        float num2 = 0;
        String op = "p";
        while (true) {
            num1 = readNumber();
            op = readOperator();
            num2 = readNumber();
            float result = doCalculation(op,num1,num2);
            System.out.printf("Ergebnis %f %s %f = %f%n", num1,op,num2,result);

            String question = question();
            if (!question.equals("ja")) {
                System.out.println("Auf Wiedersehen!");
                break;
            }
        }
    }
}
