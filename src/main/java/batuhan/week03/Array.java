package batuhan.week03;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;


public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);// Initialisierung vom Scanner mit dem System.in

        /* Schritt 1 - Size von Benutzer einlesen */
        int size = Integer.MIN_VALUE;
        while (size == Integer.MIN_VALUE) {
            System.out.println("Geben Sie bitte die gewünschte Größe ein:");
            try {
                size = sc.nextInt();
                if ((size < 0) || (size > 2000)) {// Prüft ob die Zahlen stimmen
                    System.out.println("Die Größe muss zwischen 0 und 2000 bleiben");
                    size = Integer.MIN_VALUE;
                }
            } catch (
                    InputMismatchException ime) {// wenn der Scanner es nicht zuortnen kann (InputMismatchException ime)
                System.out.println("Nur nummerische Angaben sind gültig.");
            }
            sc.nextLine();//zeilenbruch einlessen und damit puffer leeren
        }

        /* Schritt 2 - Array erstellen, füllen, ausdrucken*/
        {
            int[] newarray = new int[size];//erstellen vom Array
            for (int i = 0; i < newarray.length; i++) {//füllen
                newarray[i] = i + 1;//einzlnewerte(rechung)
            }

            System.out.println("Array: " + Arrays.toString(newarray));//ausdruck
            System.out.println();
            System.out.println("Geben Sie bitte die gewünschte Größe ein: ");
            sc.nextLine();
        }
        System.out.println();


        int[] newarray2 = new int[size];
        for (int j = 0; j < newarray2.length; j++) {
            newarray2[j] = size - j;

        }
        System.out.println("Array: " + Arrays.toString(newarray2));
    }


}

