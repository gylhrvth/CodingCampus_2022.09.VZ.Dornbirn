package gyula.week01;

public class PrintSquare {
    public static void main(String[] args) {
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


}