package milan.week02;

import java.util.Scanner;

public class Taschenrechner {

    public static void main(String[] args) {

        readFloatInput("Bitte gebe eine Kommazahl ein:");
        //readOperatorInput();
    }

    public static float readFloatInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        while (true) {
            if (sc.hasNextFloat()){
                return sc.nextFloat();
            } else {
                System.out.println(prompt);
                sc.nextLine();
            }

        }
    }
}
