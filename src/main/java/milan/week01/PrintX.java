package milan.week01;

public class PrintX {
    public static void main(String[] args) {

        System.out.println("=====");
        printX("x", 7);
        System.out.println("=====");

    }

    public static void printX(String letter, int stueck) {
        for (int i = 0; i < stueck; i++) {
            for (int j = 0; j < stueck; j++) {
                if (i == j) {
                    System.out.print(letter);
                } else if (j + i == stueck - 1) {
                    System.out.print(letter);
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
