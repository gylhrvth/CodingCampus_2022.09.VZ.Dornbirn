package franz.week02;


import java.util.Scanner;
import java.util.InputMismatchException;

public class UserInput {
    public static void main(String[] args) {
        String text = readUserInputString();
        int size = readUserInputInteger(0, 100);
    }


    public static String readUserInputString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie einen Text ein");
        String line = sc.nextLine();

        return line;
    }

    public static int readUserInputInteger(int minValue, int maxValue) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine Ganzzahl ein");
        int value = Integer.MIN_VALUE;
        do {
            try {
                value = sc.nextInt();
                if (value < minValue) {
                    System.out.println("Die Zahl muss größer gleich " + minValue + " sein");
                    value = Integer.MIN_VALUE;
                }
                if (value > maxValue) {
                    System.out.println("Die Zahl muss kleiner gleich " + maxValue + " sein");
                    value = Integer.MIN_VALUE;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Keine Zahl. Neue Zahl eingeben");
            }
            sc.nextLine();
        }
        while (value == Integer.MIN_VALUE);
        return value;
    }

}