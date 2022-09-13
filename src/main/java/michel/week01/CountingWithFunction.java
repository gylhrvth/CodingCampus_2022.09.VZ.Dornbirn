package michel.week01;

public class CountingWithFunction {
    public static void main(String[] args) {
        printChars("x", 10);
        System.out.println();
        printSquare("x", 10);
        System.out.println();
        printRectangle("x", 10,3);
        System.out.println();
        printTriangleBottomLeft("x", 4);
        System.out.println();
        printTriangleBottomRight("x", 5);
    }

    public static void printChars(String x, int size) {
        for (int i = 0; i < size; ++i) {
            System.out.print(x);
        }
        System.out.println();
    }

    public static void printSquare(String x, int length) {
        for (int rows = 0; rows < length; rows++) {
            for (int i = 0; i < length; i++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }

    public static void printRectangle(String x, int length, int hight){
        for (int rows = 0; rows < hight; rows ++) {
            for (int i = 0; i < length; i++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomLeft(String x, int rows){
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print(x);
            }
            System.out.println();
        }

    }

    public static void printTriangleBottomRight(String x, int rows){
        for (int i = 5; i >= rows; --i) {
            for (int j = 1; j <= i; ++j) {

                System.out.print(x);
            }
            System.out.println();
        }

    }
}