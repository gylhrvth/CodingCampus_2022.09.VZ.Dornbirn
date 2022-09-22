package franz.week02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodenundSchleifenMitUserinput {

    public static void main(String[] args) {

        printChars("x", 5);
        System.out.println("\n");
        printTriangle1("c", 10);
        System.out.println("\n");
        printEmptySquare("x", 15);
        System.out.println("\n");
        printSlash("x", 10);
        System.out.println("\n");
    }

        public static void printSlash (String text, int size) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == j) {
                        System.out.print(text);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }



    public static void printChars(String text, int size) {
        for (int i = 1; i <= size; ++i) {
            System.out.print(text);
        }
        System.out.print("\n");
    }



        public static void printTriangle1(String text, int size) {
        for (int i = 0; i < size; ++i) {
            printChars(text, i + 1);
        }
    }

    public static void printSpace(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(" ");
        }
        // Alternative
        //        System.out.print(" ".repeat(size));
    }

        public static void printEmptySquare(String text, int size) {
        printChars(text, size);
        for (int i = 0; i < size - 2; i++) {
            System.out.print(text);

            printSpace(size - 2);
            System.out.print(text);
            System.out.println();
        }
        printChars(text, size);
    }
}
