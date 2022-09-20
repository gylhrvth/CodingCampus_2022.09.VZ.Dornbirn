package alp.week01;

import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class PrintCharacters {

    public static void main(String[] args) {
        printchars("x", 5);
        System.out.println();
        printsquare("a", 10);
        System.out.println();
        printRect("o ", 10, 3);
        System.out.println();
        printTriangleBottomLeft("x", 4);
        System.out.println();
        printTriangleTopLeft("d", 5);
        System.out.println();
        printTriangleTopRight("d", 5);
        System.out.println();
        printTriangleBottomRight("x", 5);
        System.out.println();
        printEmptySquare("x", 10);
        System.out.println();
        printEmptySquare2("A", 3);
        System.out.println();
        printSlash("x", 3, true);
        System.out.println();
        printSlash("x", 4, false);
        System.out.println();
        printTriangle("x", 7);
        System.out.println();
        PrintRhombus("x", 7);
        System.out.println();
        printX("q",5);
        System.out.println();

    }

    public static void printchars(String text, int size) {
        for (int i = 0; i < size; ++i) {
            System.out.print(text);
        }
        System.out.println();
    }

    public static void printsquare(String text, int size) {
        for (int rows = 0; rows < size; rows++) {
            for (int i = 0; i < size; i++) {
                System.out.print(text);
            }
            System.out.println();
        }

    }

    public static void printRect(String text, int width, int height) {
        for (int rows = 0; rows < height; rows++) {
            for (int i = 0; i < width; i++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomLeft(String text, int size) {
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print(text);
            }
            System.out.println();
        }
    }


    public static void printTriangleTopLeft(String text, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i <= j)

                    System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopRight(String text, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < size - i; j++) {
                System.out.print(text);
            }
            System.out.println();
        }

    }

    public static void printTriangleBottomRight(String text, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(text);
            }
            System.out.println();
        }

    }

    public static void printEmptySquare(String text, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(text);
        }
        System.out.println();

        for (int j = 0; j < size - 2; j++) {
            System.out.print(text);
            for (int i = 0; i < size - 2; i++) {
                System.out.print(" ");
            }
            System.out.println(text);
        }
        for (int j = 0; j < size; j++) {
            System.out.print(text);
        }
        System.out.println();
    }

    public static void printEmptySquare2(String text, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(text);
        }
        System.out.println();

        for (int i = 0; i < size - 2; i++) {
            System.out.print(text);
            for (int j = 0; j < size - 2; j++) {
                System.out.print(" ");
            }
            System.out.print(text);
            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(text);
        }
        System.out.println();
    }

    public static void printSlash(String text, int size, boolean a) {
        if (a) {
            printSlashA(text, size);
        } else {
            printSlashB(text, size);
        }
    }

    public static void printSlashA(String text, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(text);
        }
    }

    public static void printSlashB(String text, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(text);
        }
    }

    public static void printTriangle(String text, int size) {
        for (int i = 0; i < size; i++) {  //länge nach unten
            for (int j = 0; j < 2 * size - 1; j++) { //breite
                if (i == size - 1) { // Letzte Zeile
                    System.out.print(text);
                } else if (i + j == size - 1) { // Linke Seite
                    System.out.print(text);
                } else if (i == j - size + 1) { // Rechte Seite
                    System.out.print(text);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void PrintRhombus(String text, int size) {
        for (int i = 0; i < 2 * size -1; i++) {  //länge nach unten. (länge und breite ist dasselbe bei rhombus, deshalb (2*size-1 gleich)).
            for (int j = 0; j < 2 * size - 1; j++) { //breite nach rechts. (breite und länge ist dasselbe bei rhombus, deshalb (2*size-1 gleich)).
                if (i + j == size - 1) { // Linke Seite - schräge von unten links zur mitte hin nach oben.
                    System.out.print(text);
                } else if (i == j - size + 1) { // Rechte Seite - schräge von der mitte oben nach unten rechts.
                    System.out.print("a");
                } else if (i + j == 3*(size - 1)) { // Rechte Seite negativ - von unten rechts nach unten zur mitte.
                        System.out.print("q");
                } else if (i - j == size -1 ) { // Linke Seite negativ - von der mitte nach oben links.
                    System.out.print("@");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();


        }
    }

    public static void printX(String text, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2+1; j++) {
                System.out.println(text);

            }

        }

    }
}






















