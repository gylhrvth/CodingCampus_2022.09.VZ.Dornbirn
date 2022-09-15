package milan.week01;

public class printTriangle {

    public static void main(String[] args) {
        System.out.println("===========");
        printTriangle1("x", 11);
        System.out.println("===========");
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
