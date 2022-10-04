package stefan.week01;


public class CountingWithFunktionen {
    public static void main(String[] args) {

        printChars("x", 4);
        System.out.println();
        printSquare("a ", 10);
        System.out.println();
        printRect("c", 10, 3);
        System.out.println();
        printTriangleBottomLeft("b", 5);
        System.out.println();
        printTriangleTopRight("d", 5);
        System.out.println();
        printTriangleTpoRight("e", 5);
        System.out.println();
        printTriangleBottomRight("f", 5);
        System.out.println();
        printEmptySqaure("g", 10);
        System.out.println();
        printSlash("h ", 7, true);
        System.out.println();
        printSlash("x", 5, false);
        printSlash1("y", 4);
        System.out.println();
        printTriangle("s", 14);
        System.out.println();
        printRhombus1("x", 8);
        printRhombus2("x", 7);
    }


    public static void printChars(String text, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(text);
        }


    }


    public static void printSquare(String text, int size) {

        for (int i = 0; i < size; i++) {
            for (int y = 0; y < size; y++) {
                System.out.print(text);

            }
            System.out.println();
        }
    }


    public static void printRect(String text, int size, int to) {
        for (int i = 0; i < to; i++) {
            for (int c = 0; c < size; c++) {

                System.out.print(text);

            }
            System.out.println();
        }

    }

    public static void printTriangleBottomLeft(String text, int size) {
        for (int i = 0; i < size; i++) {
            for (int b = 0; b <= i; ++b) {
                System.out.print(text);
            }
            System.out.println();
        }

    }


    public static void printTriangleTopRight(String text, int size) {
        for (int i = size; i >= 1; --i) {
            for (int d = 1; d <= i; ++d) {
                System.out.print(text);
            }
            System.out.println();
        }

    }

    public static void printTriangleTpoRight(String text, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j < i) {
                    System.out.print("_");
                } else {
                    System.out.print(text);
                }
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomRight(String text, int size) {
        for (int i = 1; i <= size; i++) {
            for (int y = 0; y < size; y++) {
                if (y < size - i) {
                    System.out.print(" ");
                } else {
                    System.out.print(text);
                }
            }
            System.out.println();
        }
    }

    public static void printEmptySqaure(String text, int size) {
        printChars(text, size);
        System.out.println();
        for (int i = 0; i < size - 2; i++) {
            printChars(text, 1);
            printChars(" ", size - 2);
            printChars(text, 1);
            System.out.println();
        }
        printChars(text, size);
        System.out.println();

    }

    public static void printSlash(String text, int size, boolean isBacklash) {
        if (isBacklash) {
            printbacklasch(text, size);
            //("Noch nicht implementiert");
        } else {
            printFowardslash(text, size);

        }

    }


    public static void printbacklasch(String text, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j == size - 1) {
                    System.out.print(text);
                } else {
                    if (i == j) {
                        System.out.print(text);
                    } else {
                        System.out.print(". ");
                    }
                }
            }
            System.out.println();
        }
    }


    public static void printFowardslash(String text, int size) {
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

    public static void printSlash1(String text, int size) {
        for (int i = 0; i < size; i++) {
            for (int y = 0; y < size; y++) {
                if (i + y == size - 1) {
                    System.out.print(text);

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void printTriangle(String text, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size * 2 - 1; j++) {
                if (i + j == size - 1) {
                    System.out.print(text);
                } else if (j == i + size - 1) {
                    System.out.print(text);
                } else if (size - 1 == i) {
                    System.out.print(text);
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }

    }

    private static void printRhombus1(String text, int size) {
        //Zeile für Zeile
        for (int i = 0; i < size; i++) {
            //Leerzeichen bis zum ersten "x"
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print("_");
            }
            //Erste "x"
            System.out.print(text);

            //Ab zeile 2
            if (i >= 1) {
                //Leerzeichen bis zum 2ten "x"
                for (int j = 0; j < i * 2 - 1; j++) {
                    System.out.print("_");
                }
                //"x"
                System.out.print(text);
            }
            //Neue Zeile beginnt
            System.out.println();
        }


    }

    private static void printRhombus2(String text, int size) {
        //Zeile für Zeile
        for (int i = 0; i < size*1; i++) {
            //Leerzeichen bis zum ersten "x"
            for (int j = 0; j <size; j++) {
                System.out.print("ö");
            }
            //Erste "x"
            System.out.print(text);
            System.out.println();
            //Ab zeile 2

            //Leerzeichen bis zum 2ten "x"
            for (int j = 1; j < size*i/2; j++) {
                if (i <j) {
                    System.out.print("_");

                }
            }
            //"x"
            System.out.print(text);

        }
        //Neue Zeile beginnt
        System.out.println();
    }

}


















