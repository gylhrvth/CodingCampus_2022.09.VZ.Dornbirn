package mase.week01;

import lukas.week01.day4.SquareRoot;

public class CountingWithFunction {
    public static void main(String[] args) {
        printChars("x", 10);
        System.out.println("========");
        printSquare("x", 10);
        System.out.println("========");
        printRect("x", 10, 3);
        System.out.println("========");
        printTriangleBottomLeft("x", 4);
        System.out.println("======== TRIANGLE TOP LEFT");
        printTriangleTopLeft("x", 5);
        System.out.println("========");
//        printTriangleTopRight("x", 5);
        System.out.println("========");
        printTriangleBottomRight("x", 5);
        System.out.println("========");
        printEmptySquare("x", 10);
        System.out.println("========");
        printEmptySquare2("a", 3);
        System.out.println("========");
        printSlash("x", 4, true);
        System.out.println("========");
        printForwardSlash("x", 4);
        System.out.println("========");
        printBackSlash("x", 3);
        System.out.println("========");
        printTriangle("x", 3);
        System.out.println();

//        printTriangle2("x", 5);
//

    }


    public static void printChars(String x, int size) {
        for (int i = 0; i < size; ++i) {
            System.out.print(x);
        }
        System.out.println();
    }

    public static void printSquare(String x, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; ++j) {
                System.out.print(x);
            }
            System.out.println();
        }
    }

    public static void printRect(String x, int columns, int length) {
        for (int rows = 0; rows < length; rows++) {
            for (int i = 0; i < columns; i++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomLeft(String x, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; ++j) {
                System.out.print(x);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopLeft(String x, int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(x);
            }
            System.out.println();

        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }

//    public static void printTriangleTopRight(String x, int rows) {
//        for (int i = rows; i >= 1; i--) {
//            for (int j = 0; j < rows - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; ++j) {
//
//                System.out.print(x);
//            }
//            System.out.println();
//        }
//
//    }


//    public static void printTriangleTopRight(String x, int size){
//        for (int i = 0; i < ; i++) {

//        }
//    }


    public static void printTriangleBottomRight(String x, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }

    public static void printEmptySquare(String x, int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || j == rows || i == rows || j == 1)
                    System.out.print(x);
                else
                    System.out.print(" ");
            }

            System.out.println();

        }
    }

    public static void printEmptySquare2(String a, int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || j == rows || i == rows || j == 1)
                    System.out.print(a);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void printSlash(String x, int size, boolean isBackslash) {
        if (isBackslash) {
            printBackSlash(x, size);
        } else {
            printForwardSlash(x, size);
        }
    }

    public static void printBackSlash(String x, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i + j == rows - 1) {
                    System.out.print(x);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printForwardSlash(String x, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i == j) {
                    System.out.print(x);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    private static void printTriangle(String text, int height) {
        for (int i = 0; i < height - 1; i++) {

            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print(text);
            if (i >= 1) {

                for (int j = 0; j < i * 2 - 1; j++) {
                    System.out.print(" ");
                }

                System.out.print(text);
            }
        }
        System.out.println();
        for (int i = 0; i < height * 2 - 1; i++) {
            System.out.print(text);
        }
    }
}
































