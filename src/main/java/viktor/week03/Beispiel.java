package viktor.week03;


import java.util.Scanner;

public class Beispiel {

    public static int[][] makeACopy(int[][] original) {
        int size = original.length;
        int[][] newArray = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = original[i][j];
            }
        }
        return newArray;
    }


    public static void printTwoDArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }

    }

    public static void makeAStepPlayerOne(int[][] array) {

        Scanner sc = new Scanner(System.in);
        int r = 0;
        int c = 0;


        System.out.println("Spieler 1, gib bitte deinen Schritt an!");
        System.out.println("Gib die Zeile an!");
        r = sc.nextInt();
        System.out.println("Gib die Spalte an!");
        c = sc.nextInt();


        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[r][c] = 1;
            }
        }
    }


    public static void makeAStepPlayerTwo(int[][] array) {

        Scanner sc = new Scanner(System.in);
        int r = 0;
        int c = 0;


        System.out.println("Spieler 2, gib bitte deinen Schritt an!");
        System.out.println("Gib die Zeile an!");
        r = sc.nextInt();
        System.out.println("Gib die Spalte an!");
        c = sc.nextInt();


        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[r][c] = 2;
            }
        }
    }


    public static void checkWin(int[][] array) {
        //für die Zeilen

        for (int r = 0; r < array.length; r++) {

            for (int c = 0; c < array[r].length; c++) {

                if ((array[r][c] == 1 && array[r][c + 1] == 1 && array[r][c + 2] == 1)) {
                    System.out.println("Du hast gewonnen!");

                } else if ((array[r][c] == 1 && array[r][c - 1] == 1 && array[r][c + 1] == 1)) {
                    System.out.println("Du hast gewonnen!");

                } else if (array[r][c] == 1 && array[r][c - 1] == 1 && array[r][c - 2] == 1) {
                    System.out.println("Du hast gewonnen!");
                }

            }

        }
        //für die Spalten

        for (int r2 = 0; r2 < array.length; r2++) {

            for (int c2 = 0; c2 < array[r2].length; c2++) {
                if ((array[r2][c2] == 1 && array[r2 + 1][c2] == 1 && array[r2 + 2][c2] == 1)) {
                    System.out.println("Du hast gewonnen!");

                } else if ((array[r2][c2] == 1 && array[r2 + 1][c2] == 1 && array[r2 - 1][c2] == 1)) {
                    System.out.println("Du hast gewonnen!");

                } else if ((array[r2][c2] == 1 && array[r2 - 1][c2] == 1 && array[r2 - 2][c2] == 1)) {
                    System.out.println("Du hast gewonnen!");
                }
            }
        }

        //Diagonalen
        for (int r3 = 0; r3 < array.length; r3++) {

            for (int c3 = 0; c3 < array[r3].length; c3++) {

                    //von oben links nach unten rechts
                if (array[r3][c3] == 1 && array[r3 + 1][c3 + 1] == 1 && array[r3 + 2][c3 + 2] == 1) {
                    System.out.println("Du hast gewonnen!");

                    //zuerst mitte, dann einmal nach links oben, dann einmal nach rechts unten
                } else if (array[r3][c3] == 1 && array[r3 - 1][c3 - 1] == 1 && array[r3 + 1][c3 + 1] == 1) {
                    System.out.println("Du hast gewonnen!");

                    //von rechts unten nach links oben
                } else if (array[r3][c3] == 1 && array[r3 - 1][c3 - 1] == 1 && array[r3 - 2][c3 - 2] == 1) {

                    System.out.println("Du hast gewonnen!");
                    //von oben rechts nach unten links
                } else if (array[r3][c3] == 1 && array[r3 + 1][c3 - 1] == 1 && array[r3 + 2][c3 - 2] == 1) {
                    System.out.println("Du hast gewonnen!");

                    //zuerst mitte, dann oben rechts, dann links unten
                } else if (array[r3][c3] == 1 && array[r3 - 1][c3 + 1] == 1 && array[r3 + 1][c3 - 1] == 1) {
                    System.out.println("Du hast gewonnen!");

                    //von links unten nach oben rechts
                } else if (array[r3][c3] == 1 && array[r3 - 1][c3 + 1] == 1 && array[r3 + 2][c3 + 2] == 1) {
                    System.out.println("Du hast gewonnen!");

                }

            }
        }

    }


    public static void main(String[] args) {


        int[][] original = new int[3][3];
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                original[i][j] = 0;
            }
        }

        int[][] secArray = makeACopy(original);
        printTwoDArray(secArray);
        System.out.println();

        // hier beginnt das spiel
        //Spieler 1 setzt seinen Schritt
        // Eine Copy wird vom aktuelen Array in ein neues Array erstellt, somit sieht der Spieler 2 den Schritt vom Spieler1
        //Schritt1 - Spieler1
        makeAStepPlayerOne(secArray);
        int[][] thirdArray = makeACopy(secArray);
        printTwoDArray(thirdArray);
        System.out.println();


        //Spieler2 setzt seinen Schritt
        //Copy wird ein ein neues Array erstellt, somit sieht der Spieler1 den Schritt vom Spieler2
        //Schritt1 - Spieler2
        makeAStepPlayerTwo(thirdArray);
        int[][] fourthArray = makeACopy(thirdArray);
        printTwoDArray(fourthArray);
        System.out.println();

        //Schritt2 - Spieler1
        makeAStepPlayerOne(fourthArray);
        int[][] fifthArray = makeACopy(fourthArray);
        printTwoDArray(fifthArray);
        System.out.println();

        //Schritt2 - Spieler2
        makeAStepPlayerTwo(fifthArray);
        int[][] sixthArray = makeACopy(fifthArray);
        printTwoDArray(sixthArray);
        System.out.println();

        //Schritt3 - Spieler1
        makeAStepPlayerOne(sixthArray);
        int[][] seventhArray = makeACopy(sixthArray);
        printTwoDArray(seventhArray);
        System.out.println();

        //Schritt3 - Spieler2
        makeAStepPlayerTwo(seventhArray);
        int[][] eighthArray = makeACopy(seventhArray);
        printTwoDArray(eighthArray);
        System.out.println();

        //Schritt4 - Spieler1
        makeAStepPlayerOne(eighthArray);
        int[][] ninethArray = makeACopy(eighthArray);
        printTwoDArray(ninethArray);
        System.out.println();

        //Schritt4 - Spieler2
        makeAStepPlayerTwo(ninethArray);
        int[][] thenthArray = makeACopy(ninethArray);
        printTwoDArray(thenthArray);
        System.out.println();

        //Schritt5 - Spieler1 (somit ist das Spielfeld komplett besetzt)
        makeAStepPlayerOne(thenthArray);
        int[][] eleventhArray = makeACopy(thenthArray);
        printTwoDArray(eleventhArray);
        System.out.println();
    }
}
