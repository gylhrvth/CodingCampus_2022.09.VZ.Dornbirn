package franz.week04;

import java.util.Arrays;

public class Letters {
    public static void main(String[] args) {
        //printChars();
        //printChars2();
        printChars3();
    }

    private static void printChars() {
        String text = lukas.data.Texts.getSimpleText();
        char[] splititnext = text.toCharArray();

        //char[] letters = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int counter;
        int j = 1;
        char var = 'a';

        while (j <= 26) {
            counter = 0;
            for (int i = 0; i < splititnext.length; i++) {
                if (splititnext[i] == var || splititnext[i] == var - 32) {
                    counter++;
                }
            }
            if (counter > 0) {
                System.out.println(var + ":" + counter);

            }
            var++;
            j++;
        }
    }

    private static void printChars2() {
        String text = lukas.data.Texts.getSimpleText();
        text = text.toLowerCase();
        char[] splititnext = text.toCharArray();

        int counter;
        int j = 1;
        char var = 'a';

        while (j <= 26) {
            counter = 0;
            for (int i = 0; i < splititnext.length; i++) {
                if (splititnext[i] == var) {
                    counter++;
                }
            }
            if (counter > 0) {
                System.out.println(var + ":" + counter);

            }
            var++;
            j++;
        }
    }

    private static void printChars3() {
        String text = lukas.data.Texts.getSimpleText();
        text = text.toLowerCase();
        char[] splititnext = text.toCharArray();

        int[] count = new int[65535];

        for (int i = 0; i < splititnext.length; i++) {
            char currentChar = splititnext[i];
            count[currentChar]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + ": " + count[i]);
            }
        }
    }
}



