package batuhan.week02;

import batuhan.week01.CoutingWithFunction;

import java.util.InputMismatchException;
import java.util.Scanner;


public class UserInput {
    public static void main(String[] args) {


        String text = readUserInputString();
        int size = readUserInputIntegerV2();
        CoutingWithFunction.printTriangleBottomLeft(text, size);
    }

    public static String readUserInputString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie bitte einen Namen ein:");
        String line = sc.nextLine();

        return line;
    }

    public static int readUserInputInterger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie eine Zahl ein: ");
        int value = sc.nextInt();


        return value;
    }

    public static int readUserInputIntegerV2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie bitte eine Zahl ein: ");
        int value = 0;
        try {
            value = sc.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Es ist keine Zahl ");
        }

        return value;


    }

}
