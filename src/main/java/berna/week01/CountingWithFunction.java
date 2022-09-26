package berna.week01;

public class CountingWithFunction { //exercises with methods and loops


    public static void main(String[] args) {
        System.out.println("\n");
        printChars("X", 10);
        System.out.println("\n");
        printSquare("X", 10, 10);
        System.out.println("\n");
        printRect("X", 10, 3);
        System.out.println("\n");
        printTriangleBottomLeft("x", 4);
        System.out.println("\n");
        printTriangleTopLeft("X", 5);
        System.out.println("\n");
        printTriangleBottomRight("x", 5);
        System.out.println("\n");
        printEmptySquare("x", 10);
        System.out.println("\n");
        printSlash("X", 3, true);
        System.out.println("\n");
        printSlash("y", 4, false);
        System.out.println("\n");
        printTriangle("X", 3);
        System.out.println("\n");
        printTriangle("X", 5);
        System.out.println("\n");
        printTriangle("X", 1);
        System.out.println("\n");
        printRhombus("X", 7);
        System.out.println("\n");
        printX("X", 5);
        System.out.println("\n");
        printChristmasTree(9);


    }

    // 1. exercise: print a given number of characters in a row
    public static void printChars(String letter, int amount) {

        int c = 0;
        while (c < amount) {
            System.out.print(letter);
            ++c;
        }
    }


    // 2. exercise: print a square of variable size

    public static void printSquare(String letter, int column, int rows) {

        System.out.println("2.exercise: ");
        System.out.println();
        int c = 0;
        while (c < rows) {

            for (int i = 0; i < column; ++i) {
                System.out.print(letter);
            }

            System.out.println();
            ++c;
        }
        System.out.println("\n");

    }

    // 3. exercise: print a square of variable size

    public static void printRect(String letter, int column, int rows) {

        System.out.println("3.exercise: ");
        System.out.println();
        int c = 0;
        while (c < rows) {

            for (int i = 0; i < column; ++i) {
                System.out.print(letter);
            }

            System.out.println();
            ++c;
        }
        System.out.println();

    }

    // 4.1 exercise: print a rectangle of variable size

    public static void printTriangleBottomLeft(String letter, int rows) {

        System.out.println("4.1 exercise: ");
        System.out.println();
        for (int d = 1; d <= rows; ++d) {
            printChars(letter, d);
            System.out.println();
        }
    }

    // 4.2 exercise: print a rectangle of variable size
    public static void printTriangleTopLeft(String letter, int rows) {

        System.out.println("4.2 .exercise: ");
        System.out.println();
        for (int d = 0; d <= rows; ++d) {
            printChars(letter, rows - d);
            System.out.println();
        }
    }

    // 4.3 exercise: printTriangleBottomRight("x", 5);
    public static void printTriangleBottomRight(String letter, int rows) {

        System.out.println("4.3 exercise: ");
        System.out.println();
        for (int d = 0; d < rows; d++) {
            printChars(" ", rows - d);
            printChars(letter, d + 1);
            System.out.println();
        }
    }

    // 5. exercise: emptysquare:  printEmptySquare("x", 10);
    public static void printEmptySquare(String letter, int rows) {

        System.out.println("5.exercise: ");
        System.out.println();

        printChars(letter, rows); // at the top, print a row filled with signs
        System.out.println();

        for (int e = 0; e < rows - 2; ++e) {

            int space = rows - 2; // number of space

            System.out.print(letter); // one letter at the beginning
            for (int f = 0; f < space; ++f) { //after the first letter, add space
                System.out.print(" ");
            }
            System.out.println(letter); //after the space, add one letter
        }

        printChars(letter, rows); // at the bottom, print a row filled with signs
        System.out.println();
    }

    // 6. exercise: print a diagonal of variable size and a boolean controls the direction such that "true" results in a backslash
    public static void printSlash(String letter, int rows, boolean choice) {
        System.out.println();
        System.out.println("6.exercise: ");

        if (choice) {           // if true, print a backslash

            for (int w = 0; w < rows; ++w) {

                for (int f = 0; f < w; ++f) {
                    System.out.print(" ");
                }
                System.out.println(letter);
            }
        } else {               // elase print a slash

            for (int w = rows; w > 0; --w) {

                for (int f = 0; f < w; ++f) {
                    System.out.print(" ");
                }
                System.out.println(letter);
            }
        }
    }
    // 7. exercise: triangle with variable and uneven height


    public static void printTriangle(String letter, int rows) {

        System.out.println("7.exercise: ");
        System.out.println();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {  //number of space
                System.out.print(" ");
            }
            System.out.print(letter);

            if (i >= 1) {

                for (int j = 1; j < 2 * i; ++j) { // number of space in between letters
                    System.out.print(" ");
                }
                System.out.println(letter);
            } else {
                System.out.println();
            }
        }
    }
    // kdsjhfjksdhfjksdhfkjsdhfksdjhfkjsdhfsdkfjhsdf
    // kdsjhfjksdhfjksdhfkjsdhfksdjhfkjsdhfsdkfjhsdf
    // kdsjhfjksdhfjksdhfkjsdhfksdjhfkjsdhfsdkfjhsdf
    // kdsjhfjksdhfjksdhfkjsdhfksdjhfkjsdhfsdkfjhsdf
    // kdsjhfjksdhfjksdhfkjsdhfksdjhfkjsdhfsdkfjhsdf
    // kdsjhfjksdhfjksdhfkjsdhfksdjhfkjsdhfsdkfjhsdf
    // kdsjhfjksdhfjksdhfkjsdhfksdjhfkjsdhfsdkfjhsdf
    // kdsjhfjksdhfjksdhfkjsdhfksdjhfkjsdhfsdkfjhsdf
    // kdsjhfjksdhfjksdhfkjsdhfksdjhfkjsdhfsdkfjhsdf

    // 8. exercise: Rhombus mit variabler höhe

    public static void printRhombus(String letter, int height) {
        System.out.println();
        System.out.println("8.exercise: ");
        int symindex = (height - 1) / 2;
        System.out.println("height = " + height + " ,index of symmetry: " + symindex);


        for (int i = 0; i < height; i++) {  //number of rows
            for (int j = 0; j < height; j++) { //number of columns

                if (j == symindex - i) {       //upper left quadrant
                    System.out.print(letter);
                } else if (j == i - symindex) {  //lower left quadrant
                    System.out.print(letter);
                } else if (i == j - symindex) {
                    System.out.print(letter);  //upper right quadrant
                } else if (i == (3 * symindex) - j) {
                    System.out.print(letter); // lower right quadrant
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    // 9. exercise: x mit variabler grösse

    public static void printX(String letter, int height) {
        System.out.println();
        System.out.println("9.exercise: ");

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {

                if (i == j) {    // from top left to bottom right (backslash)
                    System.out.print(letter);
                } else if (j == height - 1 - i) {   // from top right to bottom left (slash)
                    System.out.print(letter);
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }


    }

    // 10. exercise: under the christmas tree :) variable höhe

    public static void printChristmasTree(int treetopheight) {
        System.out.println();
        System.out.println("10.exercise: Happy Christmas! ");


        // first we create the treetop
        int middlecol = (treetopheight * 2 + 1) / 2;

        for (int i = 0; i < treetopheight + 1; i++) {
            for (int j = 1; j < treetopheight * 2; j++) {

                if (j > middlecol - i && j < middlecol + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        // then add the line of christmas balls
        for (int i = 1; i < treetopheight * 2; ++i) {
            System.out.print("O");
        }
        System.out.println();


        // then add the trunk of the tree
        for (int i = 1; i < 4; ++i) {
            for (int j = 1; j < treetopheight * 2; j++) {
                if (j >= middlecol - 2 && j <= middlecol + 2) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}



