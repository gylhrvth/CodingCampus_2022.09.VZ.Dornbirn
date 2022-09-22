package alp.week02;

import fatima.week01.PrintCharacters;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args) {
        String text = readUserInputString();
        int size = readUserInputInteger(1, 10);
        PrintCharacters.printTriangleTopLeft(text, size);
    }

    public static String readUserInputString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Print your own triangle top left!");
        System.out.println("Enter the character or the text that should be used");
        String line = input.nextLine();
        return line;
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
                System.out.println("This is not a number, please enter a number");
            }
            input.nextLine();
        } while (value == Integer.MIN_VALUE);
        return value;
    }



    }


