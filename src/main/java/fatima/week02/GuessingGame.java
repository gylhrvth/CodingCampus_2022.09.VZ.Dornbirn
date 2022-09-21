package fatima.week02;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        System.out.println("Welcome to the super cool number guessing game!");
        System.out.println("Guess the number between 0 and 100!");
        System.out.println("Enter your guess");
        int randomNumber = new Random().nextInt(101);
        int guessNumber = 0;
        int countGuess = 0;
        do {
            ++countGuess;
            guessNumber = readUserInputNumber(null, 0, 100);
            if (guessNumber < randomNumber) {
                System.out.println("The number ist too low!");
            } else if (guessNumber > randomNumber) {
                System.out.println("The number is too high!");
            }
        } while (guessNumber != randomNumber);
        System.out.println("Congratulations, you won in " + countGuess + " steps!!!");

    }


    public static int readUserInputNumber(String message, int minValue, int maxValue) {
        Scanner input = new Scanner(System.in);
        if (message != null) {
            System.out.println(message);
        }
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
                    value = Integer.MAX_VALUE;
                }
            } catch (InputMismatchException ime) {
                System.out.println("This is not a number, please enter a number");
            }
            input.nextLine();
        } while (value == Integer.MIN_VALUE);
        return value;
    }
}
