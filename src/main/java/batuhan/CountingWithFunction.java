package batuhan;

import patric.week01.Zaehlen;

public class CountingWithFunction {

    public static void main(String[] args) {
        printChars("x ", 10);
        printSquare("a ", 10);
        printRect("b ", 10, 3);
        printTriangleBottomLeft("x ", 4);
        printTriangleTopLeft("k ", 5);
        printTriangleTopRight("w ", 5);
        printTriangleBottomRight("l ", 5);
        printEmptySquare("p ", 10);


    }

    public static void printChars(String text, int anzahl) {
        for (int i = 1; i <= anzahl; i++) {
            System.out.print(text);
        }
        System.out.println();
    }

    public static void printSquare(String text, int zahl) {
        for (int i = 1; i <= zahl; i++) { // Zeile
            for (int j = 1; j <= zahl; j++) { // Spalten
                System.out.print(text);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void printRect(String text, int spalten, int zeilen) {
        for (int a = 1; a <= zeilen; a++) {//zeilen
            for (int i = 1; i <= spalten; i++) {//spalten
                System.out.print(text);
            }
            System.out.println();

        }
        System.out.println();
        System.out.println();

    }

    public static void printTriangleBottomLeft(String text, int Zeile) {
        for (int g = 0; g <= Zeile; g++) {
            for (int i = 0; i <= g; i++) {
                System.out.print(text);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

    }

    public static void printTriangleTopLeft(String text, int Zeile) {
        for (int g = Zeile; g >= 1; g--) {
            for (int i = 1; i <= g; i++) {
                System.out.print(text);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

    }

    public static void printTriangleTopRight(String text, int zeile) {
        for (int g = 0; g < zeile; g++) {
            for (int i = 0; i < zeile; i++) {
                if (i < g) {
                    System.out.print("  ");
                } else {
                    System.out.print(text);
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void printTriangleBottomRight(String text, int zeile) {
        for (int g = 0; g < zeile; g++) {
            for (int i = 0; i < zeile; i++) {
                if (i < zeile - g - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print(text);
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void printEmptySquare(String text, int zeile) {


    }
}









