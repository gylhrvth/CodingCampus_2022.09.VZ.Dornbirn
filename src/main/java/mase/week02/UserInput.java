package mase.week02;

import mase.week01.CountingWithFunction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        String text = readUserInputString();
        int rows = readUserInputInteger2();


        CountingWithFunction.printTriangleBottomLeft(text, rows);
    }

    public static String readUserInputString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie einen Text ein");
        String line = sc.nextLine();

        return line;
    }

//    public static int readUserInputInteger() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Geben Sie eine Zahl ein");
//        int value = sc.nextInt();
//
//        return value;

    //}
    public static int readUserInputInteger2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine ganze Zahl");
        int value = 0;
        try {
            value = sc.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Es ist keine ganze Zahl");
        }

        return value;
    }
}
