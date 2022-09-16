package gyula.week01;

public class PrintSquare {
    public static void main(String[] args) {
        /*
        printChars("x", 10);
        System.out.println();
        printSquare("a ", 5);
        System.out.println();
        printRect("b ", 5, 3);
        System.out.println();
        triangleBottomLeft("c ", 7);
        System.out.println();
        triangleTopLeft("d ", 3);
        System.out.println();
        triangleTopRight2("e ", 8);
        System.out.println();
        rombus("X ", 5);
         */

        rombus2("X ", 5);
    }

    public static void printChars(String letter, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(letter);
        }
        System.out.println();
    }

    public static void printSquare(String letter, int size) {
        for (int rows = 0; rows < size; rows++) {
            for (int i = 0; i < size; i++) {
                System.out.print(letter);
            }
            System.out.println();
        }
    }

    public static void printRect(String letter, int width, int heigt) {
        for (int rows = 0; rows < heigt; rows++) {
            for (int i = 0; i < width; i++) {
                System.out.print(letter);
            }
            System.out.println();
        }
    }

    public static void triangleBottomLeft(String letter, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(letter);
            }
            System.out.println();
        }
    }

    public static void triangleTopLeft(String letter, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(letter);
            }
            System.out.println();
        }
    }


    public static void triangleTopRight(String letter, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < size - i; j++) {
                System.out.print(letter);
            }
            System.out.println();
        }
    }

    public static void triangleTopRight2(String letter, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j < i){
                    System.out.print("  ");
                } else {
                    System.out.print(letter);
                }
            }
            System.out.println();
        }
    }


    public static void rombus(String letter, int size){
        for (int i = 0; i < 2*size-1; i++) {
            for (int j = 0; j < 2*size-1; j++) {
                if (i + j == size - 1) {
                    System.out.print(letter);
                } else if (j == i + size - 1) {
                    System.out.print(letter);
                } else if (j + size - 1 == i) {
                    System.out.print(letter);
                } else if (i + j == 3*(size-1)) {
                    System.out.print(letter);
                } else {
                    System.out.print(" ".repeat(letter.length()));
                }
            }
            System.out.println();
        }
    }


    public static void printLine(int preFix, String preFixletter, String letter, int midLength, String midLetter){
        for (int i = 0; i < preFix ; i++) {
            System.out.print(preFixletter);
        }
        System.out.print(letter);
        if (midLength >= 0){
            for (int i = 0; i < midLength; i++) {
                System.out.print(midLetter);
            }
            System.out.print(letter);
        }
        for (int i = 0; i < preFix; i++) {
            System.out.print(preFixletter);
        }
        System.out.println();
    }

    public static void rombus2(String letter, int size){
        for (int i = 0; i < 2 * size - 1; i++) {
            int prefix = Math.abs(size - 1 - i);
            int mid = 2*size - 3 - Math.abs(2*(size-1) - 2*i);
            printLine(prefix, "  ", "X ", mid, "  ");
        }
    }

}