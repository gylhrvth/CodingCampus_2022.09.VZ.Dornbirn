package milan.week01;

public class PrintSlash {

    public static void main(String[] args) {

        printSlash("x", 3, true);
        printSlash("y", 11, false);
        System.out.println("======");

    }
    public static void printSlash(String letter, int stueck, boolean istRueckSlash){
        if(istRueckSlash){
            printForwardSlash(letter, stueck);
        } else {
            printBackwardSlash(letter, stueck);
            }
        }
    public static void printForwardSlash(String letter, int stueck) {
        for (int i = 0; i < stueck; i++) {
            for (int j = 0; j < stueck; j++) {
                if (i == j) {
                    System.out.print(letter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void printBackwardSlash(String letter, int stueck) {
        for (int i = 0; i < stueck; i++) {
            for (int j = 0; j < stueck; j++) {
                if (j + i == stueck -1) {
                    System.out.print(letter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
