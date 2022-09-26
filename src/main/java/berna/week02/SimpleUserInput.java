package berna.week02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleUserInput {

    public static void main(String[] args) {
        String text = readUserInputString();
        int number = readUserInputNumber();

        System.out.println(" Your text was: " + text);
        System.out.println(" Your number was: " + number);

    }

    public static String readUserInputString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some text:");
        String line = sc.nextLine();
        return line;
    }

    public static Integer readUserInputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter an integer number:");
        //now check if the input was a number; if not,throw an error ( i.e "exception") until the input IS a number
        int value = Integer.MIN_VALUE;   //it is very unrealistic that the user will input this number!
        do {
            try {
                value = sc.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println(" This was not a number! Enter an integer number:");
            }
            sc.nextLine();
        } while (value == Integer.MIN_VALUE);
        return value;

    }


}
