package berna.week02;

import berna.week01.CountingWithFunction;
import berna.week02.SimpleUserInput;

import java.util.InputMismatchException;
import java.util.Scanner;


public class UserInputWithMenu {


    public static void main(String[] args) {
        System.out.println("Welcome to my exercises!");
        String answer = "y";
        while (answer.equals("y")) {
            answer = createUserMenue();
        }
        System.out.println("Goodbye!");
    }

    public static String createUserMenue() {

        System.out.println("What do you want to draw?");
        System.out.println("1) christmas tree");
        System.out.println("2) rectangle");
        System.out.println("3) rhombus");

        System.out.println("Choose by entering the number! ");

        Scanner sc = new Scanner(System.in);
        int nr = 0;
        while (nr == 0) {
            try {
                nr = sc.nextInt();
                if ((nr < 1) || (nr > 3)) {
                    System.out.println("there are only task 1, 2, or 3! choose again: ");
                    nr = 0;  // reset the number to zero because you defined while ==0!
                }
            } catch (InputMismatchException ime) {
                System.out.println("This was not a number! Enter an integer number:");
            }
            sc.nextLine();  // reset the user input
        }

        String choice = "";
        if (nr == 1) {
            choice = "christmas tree";
        } else if (nr == 2) {
            choice = "rectangle";
        } else {
            choice = "rhombus";
        }

        System.out.println("How high do you want your " + choice + "?");
        int size = SimpleUserInput.readUserInputNumber();


        String sign = "";
        while (sign.length() < 1) {
            System.out.println("Choose a SINGLE sign or letter! ");
            sign = sc.nextLine();
        }

        if (nr == 1) {
            CountingWithFunction.printChristmasTree(sign, size);
        } else if (nr == 2) {
            CountingWithFunction.printRect(sign, size, size);

        } else {
            CountingWithFunction.printRhombus(sign, size);
        }

        System.out.println("Do you want to continue drawing? (y/n)");
        String answer = sc.next();
        return answer;


    }

}








