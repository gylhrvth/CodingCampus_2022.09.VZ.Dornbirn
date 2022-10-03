package patric.week01;

public class PrintCharacters {
    public static void main(String[] args) {
        printChars("x ", 5);
        System.out.println();
        printSquare("a ", 10);
        System.out.println();
    }

    public static void printChars(String x, int size) {
        for (int i = 0; i < size; ++i) {
            System.out.print(x);
        }
        System.out.println();
    }

    public static void printSquare(String x, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}


