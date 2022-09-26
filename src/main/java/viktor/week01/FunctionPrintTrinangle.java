package viktor.week01;

public class FunctionPrintTrinangle {

    public static void printChar(String letter, int length, String midletter, int second_size, String plusletter, int plussize) {
        for (int i = 0; i <= length - 1; i++) {
            System.out.print(letter);
        }
        System.out.print(midletter);
        for (int j = 0; j < second_size; j++) {
            System.out.print(midletter);
        }
        for (int b = 0; b < plussize; b++) {
            System.out.print(plusletter);
        }
    }

    public static void groundToChristmasTree(String space, int length_of_space, String letter, int length_of_letter) {
        for (int i = 0; i < length_of_space; i++) {
            System.out.print(space);
        }
        for (int j = 0; j < length_of_letter; j++) {
            System.out.print(letter);
        }
    }


    public static void printTriangleBottomLeft(String f, int rows) {
        System.out.println(f);
        for (int j = 2; j <= rows; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(f);
            }
            System.out.println();
        }

    }


    public static void printTriangleTopLeft(String f, int rows) {

        for (int j = rows; j >= 1; j--) { // Wiederholung laut Zeile
            for (int i = 1; i <= j; i++) //string nebeneinander
            {
                System.out.print(f);
            }
            System.out.println(); //neue Zeile
        }
    }

    public static void printTriangleTopRight(String f, int rows) {

        for (int j = 1; j <= rows; j++) { //Zeile
            for (int s = 1; s < j; s++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= rows - j + 1; k++) {
                System.out.print(f);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopRight2(String f, int rows) {
        for (int j = 1; j <= rows; j++) {
            for (int i = 1; i <= rows; i++) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print(f);
                }
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomRight(String f, int m) { // m - Zeile


        for (int j = 1; j <= m; j++) // Zeile
        {
            for (int i = 1; i <= m - j; i++) {   // mit Leer-Zeichen befüllen
                System.out.print(" ");
            }
            for (int k = 1; k <= j; k++) {
                System.out.print(f);
            }
            System.out.println();
        }

    }

    public static void printEmptySquare(String f, int rows) {
        for (int i = 1; i <= rows; i++) { // erste Zeile
            System.out.print(f);
        }
        System.out.println();

        for (int j = 1; j <= rows - 2; j++) {

            int space = rows - 2;
            System.out.print(f);

            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            System.out.print(f);
            System.out.println();
        }

        for (int l = 1; l <= rows; l++) {
            System.out.print(f);
        }

    }

    public static void printSlash(String f, int rows, boolean c) {


        if (c) {
            for (int i = 0; i < rows; i++) { // Schleife für die Zeilen

                int j = 0;
                while (j < i) { // Schleife für die Zeichen
                    System.out.print(".");
                    j++;
                }
                System.out.println(f);
            }
        } else {
            for (int k = rows; k > 0; k--) {
                int l = 0;
                while (l < k) {
                    System.out.print(".");
                    l++;
                }
                System.out.println(f);
            }

        }
    }

    public static void printTriangle(String text, int zeile) {
        for (int i = 0; i < zeile; i++) {   // Zeilen
            for (int j = 0; j < 2 * zeile - 1; j++) {   // Positionen innerhalb der Zeile
                if (i + j == zeile - 1) {   // Ist es linke Kante?
                    System.out.print(text);

                } else if (i == j - zeile + 1) {    // Ist es rechte Kante?
                    System.out.print(text);

                } else if (i == zeile - 1) {         // Ist es das Fussboden?
                    System.out.print(text);

                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

    public static void printRhombus(String f, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {   // Positions in the rows
                if ((i + j) * 2 == rows - 1) {  // Load with chars on the top left side
                    System.out.print(f);
                } else if ((j - i) * 2 == rows - 1) {  // Load with chars on the top right side
                    System.out.print(f);
                } else if ((i - j) * 2 == rows - 1) {  // Load with chars on the bottom left side
                    System.out.print(f);
                } else if ((i + j) * 2 == (rows - 1) * 3) {  // Load with chars on the bottom right side
                    System.out.print(f);
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }


    public static void printX(String f, int rows) {

        for (int i = 0; i < rows; i++) { // rows
            for (int j = 0; j < rows; j++) { // positions in the rows
                if (i + j == rows - 1) {   // condition from printSlash
                    System.out.print(f);
                } else if (i == j) {      //condition from printSlash
                    System.out.print(f);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printTree(String f, int rows) {

        for (int i = 0; i <= rows - 1; i++) {  //upper range of the tree
            printChar(" ", rows - 1 - i, f, i, f, i);
            System.out.println();
        }

        for (int k = 0; k < 2 * rows - 1; k++) { //middle range of the tree
            if (k % 2 == 0) {
                System.out.print(0);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

        for (int n = 0; n <= 1; n++) {  // lower range of the tree
            groundToChristmasTree(" ", rows-3, "x", 5);
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printTriangleBottomLeft("x", 5);
        System.out.println("\n");
        printTriangleTopLeft("x", 5);
        System.out.println("\n");
        printTriangleTopRight2("T", 5);
        System.out.println("\n");
        printTriangleBottomRight("x", 5);
        System.out.println("\n");
        printEmptySquare("A", 3);
        System.out.println("\n");
        printSlash("x", 4, true);
        System.out.println("\n");
        printSlash("x", 4, false);
        System.out.println("\n");
        printTriangle("x", 5);
        System.out.println("\n");
        printRhombus("x", 7);
        System.out.println("\n");
        printX("x", 5);
        System.out.println("\n");
        printTree("x", 9);
        System.out.println("\n");


    }
}
