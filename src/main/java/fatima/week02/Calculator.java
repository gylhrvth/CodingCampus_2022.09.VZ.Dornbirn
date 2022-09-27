package fatima.week02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        while (true) {
            float num1 = readUserInputNumber("Please enter the first number");
            float num2 = readUserInputNumber("Please enter the second number");
            String op = readUserInputOperator();

            doCalculation(op, num1, num2);

            System.out.println("Would you like to calculate something else? (yes/no)");
            String question = readYesNo();
            System.out.println(" ");
            if (!question.equals("yes")) {
                break;
            }
        }
    }

    public static float readUserInputNumber(String message) {
        float num1 = Float.MIN_VALUE;
        Scanner input = new Scanner(System.in);
        System.out.println(message);

        while (num1 == Float.MIN_VALUE) {
            try {
                num1 = input.nextFloat();
            } catch (InputMismatchException ime) {
                System.out.println("Try again. Please enter a number");
            }
            input.nextLine();
        }
        return num1;
    }


    public static String readUserInputOperator() {
        boolean operatorValid = false;

        String operation = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter operation (+, -, *, ^, /)");
        while (!operatorValid) {
            operation = input.nextLine();
            if (!(operation.equals("+") ||
                    operation.equals("-") ||
                    operation.equals("*") ||
                    operation.equals("^") ||
                    operation.equals("/"))) {
                System.out.println("Try again. Please enter operation (+, -, *, ^, /)");
            } else {
                operatorValid = true;
            }
        }
        return operation;
    }


    public static void doCalculation(String operation, float num1, float num2) {
        if (operation.equals("+")) {
            System.out.println("your answer is " + (num1 + num2));
        } else if (operation.equals("-")) {
            System.out.println("your answer is " + (num1 - num2));
        } else if (operation.equals("*")) {
            System.out.println("your answer is " + (num1 * num2));
        } else if (operation.equals("^")) {
            System.out.println("your answer is " + (Math.pow(num1, num2)));
        } else if (operation.equals("/")) {
            System.out.println("your answer is " + (num1 / num2));
        }
    }

    public static String readYesNo() {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        return line;
    }
}

