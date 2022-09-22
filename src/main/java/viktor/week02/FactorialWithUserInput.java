package viktor.week02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialWithUserInput {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int p=1;


        while(p != 0){  //0 breaks the loop
            try {
                System.out.println("Wie lange soll faktoriert werden?");
                System.out.println("Zum Aussteigen drücken Sie 0 ! ");
                p = sc.nextInt();
                long result = 1;
                for (long i = 1; i <= p; i++) {
                    result *= i;
                    System.out.printf("%2d! = %20d%n", i, result);
                }
            } catch (InputMismatchException ime) {
                System.out.println("Falsche Eingabe, die Eingabe muss eine Ganzzahl sein!");
            }
            sc.nextLine();
        }
    }
}
