package alp.week03.gyula;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorvonGyula {
    public static void main(String[] args) {
        System.out.println("Welcome in the modern calculator");
        // Read 1. number
        float num1 = readFloat("Please enter the first parameter!");
        // Read 2. number
        float num2 = readFloat("Please enter the second parameter!");
        // Read operator
        String op = readOperator();
        // Do calculation
        float result = doCalculation(op, num1, num2);

        System.out.printf("%f %s %f = %f\n", num1, op, num2, result);
    }

    public static float doCalculation(String op, float num1, float num2){
        float result = 0;

        if (op.equals("+")){
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

    public static String readOperator(){
        Scanner sc = new Scanner(System.in);
        String inputValue = "";
        while (!inputValue.equals("+") &&
                !inputValue.equals("-") &&
                !inputValue.equals("*") &&
                !inputValue.equals("/")
        ) {
            System.out.println("Please enter a valid operator! (+, -, *, /)");
            inputValue = sc.nextLine();
        }
        return inputValue;
    }

    public static float readFloat(String message){
        Scanner sc = new Scanner(System.in);
        float inputValue = Float.MIN_VALUE;
        while (inputValue == Float.MIN_VALUE) {
            System.out.println(message);
            try {
                inputValue = sc.nextFloat();
            } catch (InputMismatchException ime) {
                System.out.println("Please enter a valid float number.");
            }
            sc.nextLine();
        }
        return inputValue;
    }

}
