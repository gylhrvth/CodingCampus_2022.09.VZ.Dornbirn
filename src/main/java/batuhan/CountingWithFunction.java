package batuhan;

import patric.week01.Zaehlen;

import java.util.Spliterator;

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
        System.out.println();
        printEmptySquare("o ", 3);
        //printSlash("u", 3, true);
        printSlash2("u", 3, true);
        printSlash2("y", 4, false);
        printTriangle("r ", 3);
        System.out.println();
        printTriangle("w ", 8);
        System.out.println();
        printTriangle("n ", 1);

        printRhombus("x ", 7);



    }

    public static void printChars(String text, int anzahl) {
        for (int i = 1; i <= anzahl; i++) {
            System.out.print(text);
        }
        System.out.println();
    }

    public static void printSquare(String text, int zahl) {
        for (int i = 1; i <= zahl; i++) { // Zeile
            for (int j = 1; j <= zahl; j++) {
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
        for (int i = 1; i <= zeile ; i++) {
            System.out.print(text);
            for (int f = 1; f <= zeile ; f++)
                System.out.print("  ");
            System.out.print(text);
            System.out.println();
        }
        printChars(text, zeile);

        System.out.println();
        System.out.println();
    }

    public static void printSlash(String text, int zeile, boolean b) {
        if (b) {
            for (int a = 0; a < zeile; a++) {
                for (int i = 0; i < a; i++) {
                    System.out.print(" ");
                }
                System.out.println(text);
            }
            System.out.println();
            System.out.println();

        }

    }

    public static void printSlash2(String text, int zeile, boolean a) {
        if (a) {
            for (int d = 0; d < zeile; d++) {
                for (int i = 0; i != d; i++) {
                    System.out.print(".");
                }
                System.out.println(text);
            }
            System.out.println();
            System.out.println();
        } else {
            for (int d = 0; d < zeile; d++) {
                for (int i = 0; i < zeile - d - 1; i++) {
                    System.out.print(".");
                }
                System.out.println(text);
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void printTriangle(String text, int zeile) {
        for (int i = 0; i < zeile; i++) { // Zeilen
            for (int j = 0; j < 2 * zeile - 1; j++) { // Positionen innerhalb der Zeile
                if (i + j == zeile - 1) { // Ist es linke Kante?
                    System.out.print(text);
                } else if (i == j - zeile + 1) { // Ist es rechte Kante?
                    System.out.print(text);
                } else if (i == zeile - 1) { // Ist es der Fussboden?
                    System.out.print(text);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
        System.out.println();
        System.out.println();

    }

    public static void printRhombus(String text, int zeile) {
        for (int i = 1; i< zeile ; i++) { // Zeile
            for (int j = 1; j < 2 * zeile - 1; j++) {
                if (j == i ) {
                    System.out.println(text);
                }

                System.out.print(".");

            }
            System.out.println(text);


        }


    }
}




















