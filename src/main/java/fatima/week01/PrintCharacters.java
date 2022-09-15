package fatima.week01;

import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;
import java.util.zip.ZipFile;

public class PrintCharacters {

    public static void main(String[] args) {

        printChars("x", 10);
        System.out.println();
        printSquare("x ", 5);
        System.out.println();
        printRect("x", 10, 3);
        System.out.println();
        printTriangleBottomLeft("x", 4);
        System.out.println();
        printTriangleTopLeft("x", 5);
        System.out.println();
        printTriangleTopRight("x", 5);
        System.out.println();
        printTriangleBottomRight("x", 5);
        System.out.println();
        printEmptySquare("o", 10);
        System.out.println();
        printEmptySquare1("A", 3);
        System.out.println();
        printSlash("x", 4, true);
        System.out.println();
        printTriangle1("o", 5);
    }


    public static void printChars(String text, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(text);
        }
        System.out.println();
    }

    public static void printSquare(String text, int size) {
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printRect(String text, int columns, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < columns; j++) {
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
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print(" ");
            }
            for (int k = 0; k < size - j; ++k) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomRight(String text, int size) {
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size - j; i++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= j; k++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }


    public static void printEmptySquare(String text, int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size)
                    System.out.print(text);
                else if (j == 1 || j == size)
                    System.out.print(text);
                else
                    System.out.print("_");
            }
            System.out.println();
        }
    }

    public static void printEmptySquare1(String text, int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++)
                if (i == 1 || i == size)
                    System.out.print(text);
                else if (j == 1 || j == size)
                    System.out.print(text);
                else
                    System.out.print(" ");
            System.out.println();
        }
    }

    public static void printSlash(String text, int size, boolean b) {
        if (b) {
            printSlashB(text, size);
        } else {
            printSlashF(text, size);
        }
    }

    public static void printSlashF(String text, int size) {
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size - j; i++) {
                System.out.print(" ");
            }
            System.out.print(text);
            System.out.println();
        }
    }

    public static void printSlashB(String text, int size) {
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print(" ");
            }
            System.out.print(text);
            System.out.println();
        }
    }

    public static void printTriangle1(String text, int size) {
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size - j - 1; i++) {
                System.out.print(" ");
            }
            System.out.print(text);
            if (j > 0) {
                for (int i = 0; i < 2*j-1; i++) {
                    if (j < size - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print(text);
                    }
                }
                    System.out.print(text);
                }
                System.out.println();
            }
        }
    }











