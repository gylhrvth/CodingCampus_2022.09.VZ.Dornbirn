package michel.week02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleConsoleImput {
    public static void main(String[] args) {
        String text = readUserInputString();
        int number = readUserInputInteger();
        System.out.println("Ihre Eingabe lautet: " + text + " - " + number);
    }
    public static String readUserInputString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Text ein:");
        String line = sc.nextLine();

        return line;
    }

    public static Integer readUserInputInteger(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein:");
        int value = Integer.MIN_VALUE;
        do {
            try {
                value = sc.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Es war keine Zahl");
            }
            sc.nextLine();
        } while(value == Integer.MIN_VALUE);


        return value;
    }
}
