package gyula.week01;

public class PrintX {
    public static void main(String[] args) {
//        printX("X ", 8);
        printX2("X ", 8);
    }

    public static void printX2(String letter, int size){
        for (int i = 0; i < 2*size-1; i++) {
            for (int j = 0; j < 2*size-1; j++) {
                if (i == j) {
                    System.out.print(letter);
                } else if (i + j == 2*(size - 1)){
                    System.out.print(letter);
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public static void printX(String letter, int size){
        for (int i = 0; i < size; i++) { // Obere Hälfte
            int prefix = i;
            int mid = 2*(size - i - 1) - 1;
            printLine(prefix, "  ", letter, mid, "  ");
        }
        for (int i = 0; i < size - 1; i++) { // Untere Hälfte
            int prefix = size - i - 2;
            int mid = 2*i + 1;
            printLine(prefix, "  ", letter, mid, "  ");

        }
    }

    public static void printLine(int prefix, String prefixLetter, String letter, int mid, String midLetter){
        for (int i = 0; i < prefix; i++) {
            System.out.print(prefixLetter);
        }
        System.out.print(letter);
        for (int i = 0; i < mid; i++) {
            System.out.print(midLetter);
        }
        if (mid > 0) {
            System.out.print(letter);
        }
        for (int i = 0; i < prefix; i++) {
            System.out.print(prefixLetter);
        }
        System.out.println();
    }
}
