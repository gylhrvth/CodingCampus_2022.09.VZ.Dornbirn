package mase.week03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        input();
    }

    public static float input() {
        float number1;
        float number2;
        float result = 0;
        String operator;
        boolean repeat = true;

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Wähle einen Operator +-*/");
//        operator = scanner.nextLine();
//
//        System.out.println("Wähle eine Nummer");
//        number1 = scanner.nextFloat();
//
//        System.out.println("Wähle eine weitere Nummer");
//        number2 = scanner.nextFloat();


                Scanner scanner = new Scanner(System.in);
                System.out.println("Wähle einen Operator +-*/");
                operator = scanner.nextLine();

                System.out.println("Wähle eine Nummer");
                number1 = scanner.nextFloat();

                System.out.println("Wähle eine weitere Nummer");
                number2 = scanner.nextFloat();


                switch (operator) {

                    case "+":
                        result = number1 + number2;
                        System.out.println("Das Ergebnis ist :" + result);
                        break;

                    default:
                        System.out.println("Geben Sie nur einer  dieser Operatoren (+,*,-,/ ein");
                        break;


                }return result;
    }

}

