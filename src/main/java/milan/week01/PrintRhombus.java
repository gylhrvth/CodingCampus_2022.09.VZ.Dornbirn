package milan.week01;

public class PrintRhombus {

    public static void main(String[] args) {

        System.out.println("======");
        printRhombus("o", 11);
        System.out.println("======");

    }

    public static void printRhombus(String letter, int stueck) {
        for (int i = 0; i < stueck; i++) {
            for (int j = 0; j < stueck; j++) {
                if ((i + j) * 2 == stueck - 1) {
                    System.out.print(letter);
                } else if ((j - i) * 2 == stueck - 1) {
                    System.out.print(letter);
                } else if ((i - j) * 2 == stueck - 1) {
                    System.out.print(letter);
                } else if ((i + j) * 2 == (stueck - 1) * 3) {
                    System.out.print(letter);
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();

        }
    }
}
