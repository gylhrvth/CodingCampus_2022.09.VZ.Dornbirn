package fatima.week01;

public class PrintCharacters {

    public static void main(String[] args) {
        System.out.println();
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
        printEmptySquare("x", 10);
        System.out.println();
        printEmptySquare1("x", 3);
        System.out.println();
        printSlash("x", 4, false);
        System.out.println();
        printTriangle("x", 3);
        System.out.println();
        printTriangle2("x", 5);
        System.out.println();
        printRhombus("x", 7);

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
        for (int j = 0; j <= size; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }


    public static void printTriangleTopLeft(String text, int size) {
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size - j; i++) {
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
            for (int i = 0; i < size - j - 1; i++) {
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
                    System.out.print(" ");
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
            for (int i = 0; i < size - j - 1; i++) {
                System.out.print(" ");
            }
            System.out.print(text);
            System.out.println();
        }
    }

    public static void printSlashB(String text, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print(text);
            System.out.println();
        }
    }

    public static void printTriangle(String text, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print(text);
            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print(text);
            }
            System.out.println();
        }
        for (int i = 0; i < size * 2 - 1; i++) {
            System.out.print(text);
        }
        System.out.println();
    }

    public static void printTriangle2(String text, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print(text);
            if (i > 0) {
                for (int k = 0; k < 2 * i - 1; k++) {
                    System.out.print(" ");
                }
                System.out.print(text);
            }
            System.out.println();
        }
        for (int l = 0; l < size * 2 - 1; l++) {
            System.out.print(text);
        }
        System.out.println();
    }

    public static void printRhombus(String text, int size) {
        for (int i = 0; i < size / 2 + 1; i++) {
            for (int j = 0; j < size / 2 - i; j++) {
                System.out.print("_");
            }
            System.out.print(text);
            if (i > 0) {
                for (int k = 0; k < 2 * i - 1; k++) {
                    System.out.print("-");
                }
                System.out.print(text);
            }
            System.out.println();
        }
        for (int m = 0; m < size / 2; m++) {
            for (int n = 0; n < m + 1; n++) {
                System.out.print("_");
            }
            System.out.print(text);

            System.out.println();
        }
        System.out.println();
    }
}


