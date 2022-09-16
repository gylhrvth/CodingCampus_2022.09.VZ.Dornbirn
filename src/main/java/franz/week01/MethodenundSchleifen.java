package franz.week01;

public class MethodenundSchleifen {

    public static void main(String[] args) {
        printChars("x", 10);
        System.out.println("\n");
        printSquare("a", 5);
        System.out.println("\n");
        printRect("O", 10, 3);
        System.out.println("\n");
        printTriangle1("c", 4);
        System.out.println("\n");
        printTriangle2("d", 6);
        System.out.println("\n");
        printTriangle3("e", 5);
        System.out.println("\n");
        printTriangle4("f", 6);
        System.out.println("\n");
        printEmptySquare("x", 15);
        System.out.println("\n");
        //printPrintSlashTrue("Y", 5, true);
        System.out.println("\n");
        //printPrintSlashFalse("Y", 5, false);
        System.out.println("\n");
        printPrintTriangle("x", 5);
        System.out.println("\n");

        int size = 10;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    System.out.print("x");
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

    public static void printSquare(String text, int size) {
        for (int i = 1; i <= size; ++i) {
            for (int j = 1; j <= size; ++j) {
                System.out.print(text);
            }
            System.out.print("\n");
        }
        System.out.println("");
        printRect(text, size, size);
    }

    public static void printRect(String text, int size, int rows) {
        for (int i = 1; i <= rows; ++i) {
            printChars(text, size);
        }
    }


    public static void printTriangle1(String text, int size) {
        for (int i = 0; i < size; ++i) {
            printChars(text, i + 1);
        }
    }

    public static void printTriangle2(String text, int size) {
        for (int i = 0; i < size; ++i) {
            /*
            for (int j = 0; j <= size - i - 1; ++j) {
                System.out.print(text);
            }
            */
            printChars(text, size - i - 1);
            // System.out.println("");
        }
    }

    private static void printSpace(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(" ");
        }
        // Alternative
        //        System.out.print(" ".repeat(size));
    }

    public static void printTriangle3(String text, int size) {
        for (int i = 0; i < size; i++) {
            printSpace(i);
            printChars(text, size - i);
        }
    }

    public static void printTriangle4(String text, int size) {
        for (int i = 1; i <= size; i++) {
            printSpace(size - i);
            printChars(text, i);
        }
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

/*
    public static void printPrintSlash(String text, int size, boolean b) {
        if (b) {
            printPrintSlashTrue(text, size);
        } else {
            printPrintSlashFalse(text, size);
        }
    }


    public static void printPrintSlashTrue(String text, int size) {
         for (int i = 0; i <size; i++) {
         printSpace(i);
         System.out.println(text);
             }
         }

     public static void printPrintSlashFalse(String text, int size) {
         for (int i = 0; i <=size; i++) {
             printSpace(size - i);
             System.out.println(text);
         }
     }
*/
    public static void printPrintTriangle(String text, int size) {
        for (int i = 0; i <=size; i++) {
            printSpace(size - i);
            System.out.println(text);
        }

    }



}


