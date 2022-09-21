package viktor.week02;

import java.util.Scanner;

public class UserInput {

    public static String readUserInput() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Gib mir bitte einen Text an:");
        String line = sc.nextLine();
        System.out.println();
        return line;
    }

    public static int readUserInputInteger() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Gib mir bitte eine Ganzzahl an: ");
        int number = sc.nextInt();
        System.out.println();
        return number;
    }

    public static double readUserInputDouble() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Gib mir bitte eine Kommazahl an:");
        double num = sc.nextDouble();
        System.out.println();
        return num;
    }


    public static void main(String[] args) {

        String text = readUserInput();
        int num = readUserInputInteger();
        double d = readUserInputDouble();

        System.out.printf("Deine Texteingabe: %5s%n",text);
        System.out.printf("Deine Zahleingabe: %5d%n",num);
        System.out.printf("Deine Kommazahl: %10.2f",d);


    }


}
