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
        /*'printSlash("c", 3);*/
    }


    public static void printRectangle(String x, int length, int hight) {
        for (int rows = 0; rows < hight; rows++) {
            for (int i = 0; i < 10; i++)
                System.out.print(x);
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
}

  /*  public static void printSlash2(String x, ar) {

    }*/


