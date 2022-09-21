package fatima.week02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        String name = readUserInputString();
        int age = readUserInputInteger(7, 110);

        System.out.println(name + " is " + age + " years old and learn programming.");
    }

    public static String readUserInputString() {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = input.nextLine();

        return name;
    }

    public static int readUserInputInteger(int min, int max) {
        Scanner input = new Scanner(System.in);
        System.out.println("Whats your age?");
        int age = Integer.MIN_VALUE;
        do {
            try {
                age = input.nextInt();
                if (age < min) {
                    System.out.println("Your are too young");
                    age = Integer.MIN_VALUE;
                }
                if (age > max) {
                    System.out.println("You are too old");
                    age = Integer.MIN_VALUE;
                }
            } catch (InputMismatchException ime) {
                System.out.println("It's not a number");
            }
            input.nextLine();
        } while (age == Integer.MIN_VALUE);
        return age;
    }
}


