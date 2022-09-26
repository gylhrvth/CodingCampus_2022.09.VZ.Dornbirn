package franz.week02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        System.out.println("Geben Sie eine Ganzzahl ein");
        readNumberone();
        //operator();
        System.out.println("Geben Sie die zweite Ganzzahl ein");
        readNumbertwo();

    }

    public static int readNumberone() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNext())
            {
            return sc.nextInt();
            }
            else{
                sc.next();
            }
        }
    }

    public static int readNumbertwo() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNext()) {
                return sc.nextInt();
            } else {
                sc.next();
            }
        }
    }
//   public static int operator();{
//        System.out.println("Wählen Sie einen Operator anhand der Zahl");
//        System.out.println("1. +");
//        System.out.println("2. -");
//        System.out.println("3. *");
//        System.out.println("4. /");
//
//    }



}