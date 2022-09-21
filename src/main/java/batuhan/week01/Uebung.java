package batuhan.week01;

public class Uebung {

    public static void main(String[] args) {


        printSlash("y", 8, true);
        printSlash("x", 8, false);
        System.out.println();
        printTriangle("w ", 8);


    }

    public static void printSlash(String text, int height, boolean a) {
        if (a) {
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= height - i; j++) {
                    System.out.print(" ");
                }
                System.out.println(text);
            }
            System.out.println();
            System.out.println();
        } else {
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j < i + 1; j++) {
                    System.out.print("  ");

                }
                System.out.println(text);

            }
        }
    }


    public static void printTriangle(String text, int zeile) {


        for (int i = 1; i < zeile; i++) { // Zeile
            for (int j = 1; j < 2 * zeile - 1; j++) {
                if (j == i) {
                    System.out.println(text);
                }
                System.out.print("..");

            }
            System.out.println(text);
        }

    }
}

