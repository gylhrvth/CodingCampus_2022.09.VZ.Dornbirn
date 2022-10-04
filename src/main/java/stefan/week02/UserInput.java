package stefan.week02;

import stefan.week01.CountingWithFunktionen;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        String text = readUserString();
        int size = readUserInputInteger();
        CountingWithFunktionen.printTriangleBottomLeft(text, size);
    }


    public static String readUserString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie ein Text ein");
        String line = sc.nextLine();

        return line;

    }

    public static int readUserInputInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie eine Zahl en");
        int value = sc.nextInt();
        return value;
    }

    public static int redUserInputInteger2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie eine Ganze Zahl ein ");
        int value = 1;
        try {
            value = sc.nextInt();
        } catch (InputMismatchException ime) {
                System.out.println("Es ist keine Zahl");
            }
       return value;


    }
}
