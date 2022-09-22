package batuhan.week02;

import batuhan.week01.CountingWithFunction;

import java.util.Scanner;
import java.util.InputMismatchException;


public class RateSpielnewlvl {
    public static void main(String[] args) {
//        String text = readUserInputString();
        int size = readUserInputInteger();
        CountingWithFunction.printTriangle("x", size);


    }

    public static String readUserInputString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie groß soll das Dreieck werden?");
        String line = sc.nextLine();
        return line;
    }

    public static int readUserInputInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie groß soll das Dreieck werden?");
        int value = Integer.MIN_VALUE;


        while (value == Integer.MIN_VALUE) {
            try {
                value = sc.nextInt();
                if (value < 1) {
                    System.out.println("Die Größe muss größer gleich 1 sein.");
                    value = Integer.MIN_VALUE;
                } else if (value > 15) {
                    System.out.println("Die Größe muss kleiner gleich 15 sein.");
                    value = Integer.MIN_VALUE;
                }

            } catch (InputMismatchException ime) {
                System.out.println("Es ist keine Zahl.");
            }
            sc.nextLine();
        }
        return value;


    }

}
