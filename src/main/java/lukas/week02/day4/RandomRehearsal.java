package lukas.week02.day4;

public class RandomRehearsal {
    public static void main(String[] args) {
        //Rauten von der Höhe 1 bis 30, ungerade zahlen
//        for (int i = 1; i <= 30; i++) {
//            if(i % 2 != 0) {
//                printRaute(i);
//            }
//        }

        for (int i = 1; i <= 30; i += 2) {
            System.out.println("--- Raute der Höhe: " + i + " ---");
            printRaute(i);
            System.out.println("---");
        }
    }

    private static void printChars(String character, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(character);
        }
    }

    private static void printRaute(int height) {
        //Oberer Teil
        int upperHeight = height / 2 + 1;
        for (int i = 0; i < upperHeight; i++) {
            printChars(" ", upperHeight - 1 - i);
            if (i == 0) {
                System.out.println("x");
            } else {
                System.out.print("x");
                printChars("+", i * 2 - 1);
                System.out.println("x");
            }
        }

        int lowerHalf = height - upperHeight;
        //Unterer Teil
        for (int i = 0; i < lowerHalf; i++) {
            printChars(" ", i + 1);
            if (i < lowerHalf - 1) {
                System.out.print("x");
                printChars("-", lowerHalf * 2 - i * 2 - 3);
                System.out.println("x");
            } else {
                System.out.println("x");
            }
        }
    }
}
