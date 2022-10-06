package viktor.week03;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class GenerateFormulars {

    public static void loadToPascalTriangle(int[][] array) {

        for (int k = 0; k < array.length; k++) {

            for (int l = 0; l < array[k].length; l++) {

                if ((k == 0) || (l == 0)) {
                    array[k][l] = 1;
                } else {
                    array[k][l] = array[k][l - 1] + array[k - 1][l];
                }
            }
        }
    }

    public static void printArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%5d ", array[i][j]);

            }
            System.out.println();
        }
    }

    public static int wichFormular() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welches Formular soll angezeigt werden? Gib mir bitte den Exponent an: ");
        return sc.nextInt();
    }

    public static void printFormular(int n) {



    }


    public static void main(String[] args) {

        int size = ArrayExample1.readSize();
        int[][] myArray = new int[size][size];

        loadToPascalTriangle(myArray);
        printArray(myArray);

        System.out.println();
        int exp = wichFormular();


    }
}
