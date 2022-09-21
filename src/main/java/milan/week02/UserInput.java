package milan.week02;

import milan.week01.PrintX;

import java.util.InputMismatchException;
import java.util.Scanner;


public class UserInput {
    public static void main(String[] args) {
        String text = readUserInputString();
        //int size = readUserInputIntegerV1();
        int size = readUserInputIntegerV2();
        PrintX.printX(text, size);
    }
    public static String readUserInputString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Text ein:");
        String line = sc.nextLine();

        return line;

    }
    public static int readUserInputIntegerV1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein:");
        int value = sc.nextInt();

        return value;

    }
    public static int readUserInputIntegerV2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein:");
        int value = 1;
        try {
            value = sc.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Es ist keine Zahl");
        }
        return value;
    }
}
