package viktor.week02;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class QuizGame {

    public static int readNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte eine Zahl angeben!");
        return sc.nextInt();
    }
    public static void begin(){
        System.out.println("Willkommen bei dem super coolen Ratespiel!");
        System.out.println("Errate die Zahl zwischen 0 und 100!");
    }

    public static void main(String[] args) {

        begin();
        Random randomNumber = new Random();
        int random = randomNumber.nextInt(101);
        System.out.println("Random:" + random);
        int myNumber = 1;

        while(myNumber != random) {

            try{
                myNumber = readNumber();
                if (myNumber > random) {
                    System.out.println("Die Zahl ist zu hoch!");

                } else if (myNumber == random) {
                    System.out.println("Getroffen, du hast gewonnen!");
                } else {
                    System.out.println("Die Zahl ist zu niedrig");
                }
            }catch(InputMismatchException ime){
                System.out.println("Hier wurde keine Zahl angegeben! Bitte eine Zahl angeben!");
            }
        }
    }
}
