package patric.week01;

public class PrintCharacter2 {
    public static void main(String[] args) {
        printRectangle("x ", 10, 3);
        System.out.println();
        printTriangleBottomLeft("f ", 4);
        System.out.println();
        printTriangleTopLeft("z", 5);
        System.out.println();
        printTriangleBottomRight("o", 5);
        System.out.println();
        printEmptySquare("x ", 10);
        System.out.println();
        printEmptySquare("A ", 3);
        System.out.println();
        printSlash("c", 3);
        System.out.println();
        printSlash2("y", 4);
        System.out.println();
        printTriangle("x", 10);
        System.out.println();
        printRhombus("x", 7);
        System.out.println();


    }


    public static void printRectangle(String text,int height , int i) {
        for (i = 0; i < height -7; i++) {
            for (int j = 0; j < height; j++)
                System.out.print(text);
            {
                System.out.println();
            }
        }
    }


    public static void printTriangleBottomLeft(String x, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(x);
            }
            System.out.println();

        }
    }


    public static void printTriangleTopLeft(String x, int rows) {
        for (int j = rows; j >= 1; j--) {
            for (int i = 1; i <= j; i++) {
                System.out.print(x);
            }
            System.out.println();

        }
    }

    public static void printTriangleBottomRight(String x, int rows) {
        for (int i = rows; i >= 1; --i) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < rows - i + 1; ++j) {
                System.out.print(x);
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomRight2(String x, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i + j >= rows - 1) {
                    System.out.print(x);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void emptySquare(String x, int rows) {
        int m = 6;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == m)
                    System.out.print("*");
                else if (j == 1 || j == m)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printEmptySquare(String x, int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                /*
                if (i == 1 || i == rows)
                    System.out.print(x);
                else if (j == 1 || j == rows)
                    System.out.print(x);
                else
                 */
                if (i == 1) { //erste Reihe
                    System.out.print(x);
                } else if (j == 1) { //zweite Reihe
                    System.out.print(x);
                } else if (i == rows) { //dritte Reuhe
                    System.out.print(x);
                } else if (j == rows) { //vierte Reihe
                    System.out.print(x);
                } else {
                    System.out.print("  "); //leerer Raum
                }
            }
            System.out.println();
        }
    }


    public static void printSlash(String x, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(x);
        }
    }


    public static void printSlash2(String x, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {

                System.out.print(" ");
            }
            System.out.println(x);

        }


    }

    private static void printTriangle(String text, int height) {
        //Zeile für Zeile
        for (int i = 0; i < height - 1; i++) {
            //Leerzeichen bis zum ersten "x"
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            //Erste "x"
            System.out.print(text);

            //Ab zeile 2
            if (i >= 1) {
                //Leerzeichen bis zum 2ten "x"
                for (int j = 0; j < i * 2 - 1; j++) {
                    System.out.print(" ");
                }
                //"x"
                System.out.print(text);
            }
            //Neue Zeile beginnt
            System.out.println();
        }

        //Boden
        for (int i = 0; i < height * 2 - 1; i++) {
            System.out.print(text);
        }
    }


    private static void printRhombus(String text, int height) {
        //Zeile für Zeile
        for (int i = 0; i < height - 1; i++) {
            //Leerzeichen bis zum ersten "x"
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            //Erste "x"
            System.out.print(text);

            //Ab zeile 2
            if (i >= 1) {
                //Leerzeichen bis zum 2ten "x"
                for (int j = 0; j < i * 2 - 1; j++) {
                    System.out.print(" ");
                }
                //"x"
                System.out.print(text);
            }
            //Neue Zeile beginnt
            System.out.println();
        }
        //zweites Dreieck
        for (int i = 0; i < height; i++) {
            //Leerzeichen bis zum ersten "x"
            for (int j = 0; j <  i ; j++) {
                System.out.print(" ");
            }
            //Erste "x"
            System.out.print(text);

            //Ab zeile 2
            if (i < height - 1) {
                //Leerzeichen bis zum 2ten "x"
                for (int j = 0; j < (height- i) * 2 - 3; j++) {
                    System.out.print(".");
                }
                //"x"
                System.out.print(text);
            }
            //Neue Zeile beginnt
            System.out.println();

        }


    }
}


