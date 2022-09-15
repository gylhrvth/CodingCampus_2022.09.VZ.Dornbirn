package alp.week01;

public class PrintCharacters {

    public static void main(String[] args) {
        printchars("x", 5);
        System.out.println();
        printsquare("a", 10);
        System.out.println();
        printRect("o ", 10, 3);
        System.out.println();
        printTriangleBottomLeft("x", 4);
        System.out.println();
        printTriangleTopLeft("d", 5);
    }

    public static void printchars(String text, int size) {
        for (int i = 0; i < size; ++i) {
            System.out.print(text);
        }
        System.out.println();
    }

    public static void printsquare(String text, int size) {
        for (int rows = 0; rows < size; rows++) {
            for (int i = 0; i < size; i++) {
                System.out.print(text);
            }
            System.out.println();
        }

    }

    public static void printRect(String text, int width, int height) {
        for (int rows = 0; rows < height; rows++) {
            for (int i = 0; i < width; i++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomLeft(String text, int size) {
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print(text);
            }
            System.out.println();
        }
    }


    public static void printTriangleTopLeft(String text, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i <= j)

                    System.out.print(text);
            }
            System.out.println();
        }
    }


}








