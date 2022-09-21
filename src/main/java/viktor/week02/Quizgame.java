package viktor.week02;

import java.util.Random;
import java.util.Scanner;

public class Quizgame {

    public static int readUserInput() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Gib mir bitte eine Ganzzahl an:");
        int number = sc.nextInt();
        System.out.println();

        return number;
    }


    public static void main(String[] args) {
        Random rd = new Random();
        int random_number = rd.nextInt(101);
        System.out.println("Random number: " + random_number);

        Scanner sc = new Scanner(System.in);


        System.out.println("Willkommen beim super coolen Zahlen Ratespiel!");
        System.out.println("Errate die Zahl zwischen 0 und 100!");
        int myRate = 1;

        do {
            myRate = sc.nextInt();

            if (myRate < random_number) {
                System.out.println("Leider nicht getroffen, gib mir bitte eine grö0ere Ganzzahl ein!");
            } else if (myRate > random_number) {
                System.out.println("Leider nicht getroffen, gib mir bitte eine kleinere Ganzzahl ein!");
            } else {
                System.out.println("Super gemacht, getroffen!");
            }
        } while (myRate != random_number);


    }
}
