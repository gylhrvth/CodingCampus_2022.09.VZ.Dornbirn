package viktor.week02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class printTriangleWithUserInput {

    public static void printTriangle(String text, int zeile) {

        for (int i = 0; i < zeile; i++) {   // Zeilen
            for (int j = 0; j < 2 * zeile - 1; j++) {   // Positionen innerhalb der Zeile
                if (i + j == zeile - 1) {   // Ist es linke Kante?
                    System.out.print(text);
                } else if (i == j - zeile + 1) {    // Ist es rechte Kante?
                    System.out.print(text);

                } else if (i == zeile - 1) {         // Ist es das Fussboden?
                    System.out.print(text);

                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = 1;
        String letter = "a";

        while (rows != 0) {
            try {
                System.out.println("Gib mir bitte an, wie hoch (Anzahl der Zeilen) das Dreieck sein soll !");
                rows = sc.nextInt();
                sc.nextLine();

                System.out.println("Welches Zeichen soll dabei verwendet werden!");
                letter = sc.nextLine();

                printTriangle(letter,rows);

                System.out.println();
            } catch (InputMismatchException ime) {
                System.out.println("Falsche Eingabe, gib bitte eine Ganzzahl an!");
            }
            sc.nextLine();
        }
    }
}
