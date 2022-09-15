package gyula.week01;

public class PrintSlash {
    public static void main(String[] args) {
        printSlash("x", 8, true);
        printSlash("y", 4, false);
    }

    public static void printSlash(String letter, int size, boolean isBackslash){
        if (isBackslash) {
            printBackslash(letter, size);
        } else {
            printForwardSlash(letter, size);
        }
    }

    public static void printBackslash(String letter, int size){
        for (int i = 0; i < size; i++) { // Zeile Zähler
            for (int j = 0; j < size; j++) { // Spalten Zähler
                if (i + j == size - 1) {
                    System.out.print(letter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printForwardSlash(String letter, int size){
        for (int i = 0; i < size; i++) { // Zeile Zähler
            for (int j = 0; j < size; j++) { // Spalten Zähler
                if (i == j) {
                    System.out.print(letter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
