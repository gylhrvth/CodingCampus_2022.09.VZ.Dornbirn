package milan.week01;

public class PrintChristmasTree {

    public static void main(String[] args) {

        System.out.println("=====");
        printChristmasTree(9);
        System.out.println("=====");
    }


    public static void printChristmasTree(int stueck) {
        for (int i = 0; i < stueck; i++) {
            for (int j = 0; j < stueck * 2 - 1; j++) {
                if (j < stueck - i - 1) {
                    System.out.print(".");
                } else if (j > stueck + i - 1) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < stueck; j++) {
                System.out.print("0 ");
            }

        }
        System.out.println();

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j < stueck * 2 - 1; j++) {
                if (j < stueck - 3) {
                    System.out.print(".");
                } else if (j > stueck + 1) {
                    System.out.print(".");
                } else {
                    System.out.print("+");
                }

            }
            System.out.println();

        }
    }
}