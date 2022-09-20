package franz.week01;

public class MethodenundSchleifen {

    public static void main(String[] args) {
        printChars("x", 10);
        System.out.println("\n");
        printSquare("a", 5);
        System.out.println("\n");
        printRect("O", 10, 3);
        System.out.println("\n");
        printTriangle("c", 4);
        System.out.println("\n");
        printTriangle2("d", 6);
        System.out.println("\n");
        printTriangle3("e", 5);
        System.out.println("\n");
        printTriangle4("f", 6);
        System.out.println("\n");
        printEmptySquare("f", 6);
        System.out.println("\n");
        }

    public static void printChars(String text, int size) {
        for (int i = 1; i <= size; ++i) {
            System.out.print(text);
        }
        System.out.print("\n");
    }

    public static void printSquare(String text, int size) {
        /*for (int i = 1; i <= size; ++i) {
            for (int j = 1; j <= size; ++j) {
                System.out.print(text);
            }
            System.out.print("\n");
    }
        System.out.println("");*/
        printRect(text, size, size);
    }

    public static void printRect(String text, int columns, int rows) {
        for (int i = 1; i <= rows; ++i) {
            printChars(text, columns);
        }
    }


    public static void printTriangle(String text, int size) {
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
        System.out.println("\n");
    }

    private static void printSpace(int size) {
        for (int i = 0; i <size ; i++) {
            System.out.print(" ");
        }
        // Alternative
        //        System.out.print(" ".repeat(size));
    }

    public static void printTriangle3(String text, int size) {
        for (int i = 0; i < size; i++) {
            printSpace(i);
            printChars(text,size-i);
        }
    }

    public static void printTriangle4(String text, int size) {
        for (int i = 1; i <= size; i++) {
            printSpace(size-i);
            printChars(text,i);
        }
    }
    public static void printEmptySquare(String text, int size){
       printChars(text,size);
        for (int i = 0; i<size-2; i++) {
            System.out.print(text);

            printSpace(size-2);
            System.out.print(text);
            System.out.println();
        }
        printChars(text,size);

    }
}

