package batuhan.week04;

import java.util.Arrays;

public class BuchstabenZaehlen {


    public static void main(String[] args) {
        String text = lukas.data.Texts.getSimpleText();
        printCharacters(text);
    }


    public static void printCharacters(String str) {
        char[] arr = str.toCharArray();
        int[] charCounter = new int[65535];

        for (int i = 0; i < arr.length; i++) {
            char currentChar = arr[i];
            System.out.println(arr[i] + " " +(int) arr[i]);


        }

    }
}
