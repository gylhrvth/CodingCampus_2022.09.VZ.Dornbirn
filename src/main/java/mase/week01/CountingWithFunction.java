package mase.week01;

public class CountingWithFunction {
    public static void main(String[] args) {
        printChars("x", 10);
        System.out.println("========");
        printSquare("x", 10);
        System.out.println("========");
        printRect("x", 10, 3);
        System.out.println("========");
        printTriangleBottomLeft("x", 4);
        System.out.println("========");
        printTriangleTopLeft("x", 5);
        System.out.println("========");
        printTriangleTopRight("x", 5);

    }


    public static void printChars(String x, int size) {
        for (int i = 0; i < size; ++i) {
            System.out.print(x);
        }
        System.out.println();
    }

    public static void printSquare(String x, int size) {
        for (int rows = 0; rows < size; rows++) {
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

    public static void printTriangleTopLeft(String x, int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(x);
            }
            System.out.println();

        }
    }

    public static void printTriangleTopRight(String x, int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=  i; ++j) {

                    System.out.print(x);
                }
                System.out.println();
            }

        }
    }







