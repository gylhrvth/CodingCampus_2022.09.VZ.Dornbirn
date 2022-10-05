package milan.week04;

import lukas.data.Texts;

import java.util.Arrays;

public class StringBuchstabenCount {

    public static void main(String[] args) {
        String text = Texts.getSimpleText();

        char[] arr = text.toCharArray();
        int[] zaehler = new int[1 + Character.MAX_VALUE];

        countChar(arr, zaehler);
        printZaehler(zaehler);

    }

    public static void printZaehler(int[] zaehler) {
        for (int i = 0; i < zaehler.length; i++) {
            if (zaehler[i] > 0) {
                System.out.println((char) i + " (" + i + "): " + zaehler[i]);
            }
        }
    }

    public static void countChar(char[] arr, int[] zaehler) {
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];                        //char c = M (M ist arr[0]
            zaehler[c] = zaehler[c] + 1;            //im Int[] M = ASCII 77, die position wird um 1 erhöht
        }
    }


}
