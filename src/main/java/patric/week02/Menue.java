package patric.week02;

import patric.week01.PrintCharacter2;
import patric.week01.Triangle;

import javax.swing.*;
import java.util.Scanner;

public class Menue {
    public static void main(String[] args) {
        System.out.println("Willkommen bei meinen Aufgaben!");
        menue();
        int choice = readNumber2("Please chose and enter a number between 1 and 3", 1, 3);

        if (choice == 1) {

            String sign = witchSign("");
            int size = readNumber2("Please choose the size of the rectangle, 1 bis 10", 1, 10);
            PrintCharacter2.printTriangleBottomLeft(sign, size);
            String frage=frageWeiter();

        } else if (choice == 2) {
            String sign = witchSign("");
            int size = readNumber2("Please choose the size of the Quader, 1 bis 20", 1, 20);
            PrintCharacter2.printEmptySquare(sign, size);

        } else if (choice == 3) {
            String sign = witchSign("");
            int width = readNumber2("Please choose the width of the rectangle, 1 bis 20", 1, 20);
            int height = readNumber2("Please choose the height of the rectangle, 1 bis 25", 1, 25);
            PrintCharacter2.printRectangle(sign, width, height);
        }




    }


    public static void menue() {
        System.out.println("1 Christbaum");
        System.out.println("2 Quader");
        System.out.println("3 Rhombus");

    }


    public static int readNumber2(String prompt, int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(prompt);
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                //Frage ob Zahl gut ist?
                if (number >= minValue && number <= maxValue) {
                    return number;
                }
            } else {
                System.err.println("Falsche Zahl!!!111");
                sc.nextLine();
            }
        }
    }

    public static String witchSign(String prompt) {
        System.out.println("Welches Zeichen soll verwendet werden??");
        Scanner sc = new Scanner(System.in);
        String sign = sc.next();
        return sign;
    }

    public static String frageWeiter() {
        Scanner sc=new Scanner(System.in);
        System.out.println("möchtest du weiterzeichnen???   (j/n)");
        String frage = sc.next();
        return frage;
    }


}





