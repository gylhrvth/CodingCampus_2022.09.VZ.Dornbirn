package milan.week01;

public class printTriangle {

    public static void main(String[] args) {
        System.out.println("===========");
        printTriangle1("x", 7);
        System.out.println("===========");

        int size = 8;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("x");
        }

        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("x");
        }
    }

    public static void printTriangle1(String letter, int anzahl) {
        for (int i = 0; i < anzahl; i++) {
            for (int j = 0; j < anzahl * 2 - 1; j++) {
                if (i + j == anzahl - 1) {
                    System.out.print(letter);
                } else if (j == i + anzahl - 1) {
                    System.out.print(letter);
                } else if (i == anzahl - 1) {
                    System.out.print(letter);
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
