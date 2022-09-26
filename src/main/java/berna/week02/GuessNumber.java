package berna.week02;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        guessNumber();
    }

    public static void guessNumber() {

        System.out.println(" Welcome to the super cool game 'guess a number' !");
        System.out.println("Guess a number between 0 and 100!");
        System.out.println("Enter your number now:");

        Scanner sc = new Scanner(System.in);    //get input from the user
        int value = 0;
        int randomNumber = new Random().nextInt(101);   //create a random number which the user should guess

        do {
            try {
                value = sc.nextInt();
                if (value > randomNumber) {
                    System.out.println("Number is too high! Make a new guess:");
                } else if (value < randomNumber) {
                    System.out.println("Number is too low! Make a new guess:");
                }

            } catch (InputMismatchException ime) {
                System.out.println("This was not a number! Enter an integer number:");
            }

            sc.nextLine();
        } while (value != randomNumber);

        System.out.println(" You won!");
    }


}


