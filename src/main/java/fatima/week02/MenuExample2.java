package fatima.week02;

import fatima.week01.PrintCharacters;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuExample2 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to my tasks!");
            System.out.println("What would you like to draw?");
            System.out.println("1) Triangle top left");
            System.out.println("2) Triangle bottom left");
            System.out.println("3) Square");
            int task = readUserInputInteger1(1, 3);
            if (task == 1) {
                PrintCharacters.printTriangleTopLeft(readUserInputString(), readUserInputInteger(3, 20));
            } else if (task == 2) {
                PrintCharacters.printTriangleBottomLeft(readUserInputString(), readUserInputInteger(3, 20));
            } else if (task == 3) {
                PrintCharacters.printSquare(readUserInputString(), readUserInputInteger(3, 20));
            } else {
                System.out.println();
            }
            System.out.println("Would you like to draw something else? (yes/no)");
            String question = readYesNo();
            System.out.println(" ");
            if (!question.equals("yes")) {
                System.out.println("Goodbye!");
                break;
            }
        }
    }

    public static int readUserInputInteger1(int minValue, int maxValue) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please choose");
            if (input.hasNextInt()) {
                int number = input.nextInt();
                if (number >= minValue && number <= maxValue) {
                    return number;
                }
            } else {
                System.err.println("Enter a number between 0 and 3!");
                input.nextLine();
            }
        }
    }


    public static String readUserInputString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character or the text that should be used");
        String text = input.next();
        return text;
    }

    public static int readUserInputInteger(int minValue, int maxValue) {
        Scanner input = new Scanner(System.in);
        System.out.println("How big should it be?");
        int value = Integer.MIN_VALUE;
        do {
            try {
                value = input.nextInt();
                if (value < minValue) {
                    System.out.println("The number must be greater than or equal to " + minValue);
                    value = Integer.MIN_VALUE;
                }
                if (value > maxValue) {
                    System.out.println("The number must be less than or equal to " + maxValue);
                    value = Integer.MIN_VALUE;
                }
            } catch (InputMismatchException ime) {
                System.out.println("This is not an integer, please enter an integer");
            }
            input.nextLine();
        } while (value == Integer.MIN_VALUE);
        return value;
    }

    public static String readYesNo() {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        return line;
    }
}


