package mase.week02;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Inputaufgaben {
    public static void main(String[] args) {
//    outputString();
//    outputInt();
        int computerNumber = new Random().nextInt(101);
        guessNumber(computerNumber);

    }

    //    public static String outputString(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Du gibst den String wieder:");
//        String text = sc.nextLine();
//
//        return text;
//    }
//    public static int outputInt(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Gib eine Zahl ein:");
//        int value = Integer.MIN_VALUE;
//        do {
//            try {
//                value = sc.nextInt();
//            }catch (InputMismatchException ime){
//                System.out.println("Es ist keine Zahl");
//            }sc.nextLine();
//        }
//
//        while(value == Integer.MIN_VALUE);
//        return value;
//    }
    public static int guessNumber(int computerNumber) {
        System.out.println("Willkommen zum Supercoolen Ratespiel");
        System.out.println("Errate die Zahl zwischen 0 und 100");
        System.out.println("Gib nun die Zahl ein");
        Scanner sc = new Scanner(System.in);
        int value = 0;
        do {
            try {
                value = sc.nextInt();
                if (value < computerNumber) {
                    System.out.println("Die Zahl ist zu niedrig ");
                } else if (value > computerNumber) {
                    System.out.println("Die Zahl ist zu hoch ");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Es ist keine Zahl ");
            }
            sc.nextLine();
        } while (value != computerNumber);

        System.out.println("Du hast gewonnen!");
        return value;
    }
}
