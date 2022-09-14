package milan.week01;


public class CountingWithFunction {
    public static void main(String[] args) {
        printChars("x", 10);
        System.out.println("=============");
        printSquare("a", 10);
        System.out.println("=============");
        printRect("c", 10, 3);
        System.out.println("=============");
        printTriangleBottomLeft("d", 4);
        System.out.println("=============");
        printTriangleTopLeft("e", 5);
        System.out.println("=============");
        printTriangleTopRight("f", 5);
        System.out.println("=============");
        printTriangleBottomRight("g", 5);
        System.out.println("=============");
        printEmptySquare("h", 5);
        System.out.println("=============");
        printEmptySquare1("h", 8);
        System.out.println("=============");
    }

    public static void printChars(String titel, int anzahl) {
        for (int i = 1; i <= anzahl; i++) {
            System.out.print(titel);
        }
        System.out.println();
    }

    public static void printSquare(String titel, int anzahly) {
        for (int i = 1; i <= anzahly; i++) {
            for (int j = 1; j <= anzahly; j++) {
                System.out.print(titel);
            }
            System.out.println();
        }
    }

    public static void printRect(String titel, int anzahlhorizontal, int anzahlvertikal) {
        for (int i = 1; i <= anzahlvertikal; i++) {
            for (int j = 1; j <= anzahlhorizontal; j++) {
                System.out.print(titel);
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomLeft(String titel, int anzahld) {
        for (int i = 1; i <= anzahld; i++) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(titel);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopLeft(String titel, int anzahle) {
        for (int i = 1; i <= anzahle; i++) {
            for (int j = 0; j <= anzahle - i; j++) {
                System.out.print(titel);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopRight(String letter, int stueck) {
        for (int i = 1; i <= stueck; i++) {
            for (int j = 1; j <= stueck; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print(letter);
                }
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomRight(String letter, int stueck) {
        for (int i = 1; i <= stueck; i++) {
            for (int j = 1; j < stueck; j++) {
                if (j <= stueck - i) {
                    System.out.print(" ");
                } else {
                    System.out.print(letter);
                }
            }
            System.out.println(letter);
        }

    }


    public static void printCharsInline(String letter, int stueck){
        for (int i = 0; i < stueck; i++) {
            System.out.print(letter);
        }
    }

    public static void printEmptySquare1(String letter, int stueck) {
        printCharsInline(letter, stueck);
        System.out.println();
        for (int i = 0; i < stueck - 2; i++) {
            printCharsInline(letter, 1);
            printCharsInline(" ", stueck - 2);
            printCharsInline(letter, 1);
            System.out.println();
        }
        printCharsInline(letter, stueck);
        System.out.println("\n");
    }

    public static void printEmptySquare(String letter, int stueck) {
        for (int j = 0; j < stueck; j++) {
            for (int i = 0; i < stueck; i++) {
                if ((i > 0) && (j > 0) && (i < stueck - 1) && (j < stueck - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print(letter);
                }
            }
            System.out.println();
        }
    }
}
