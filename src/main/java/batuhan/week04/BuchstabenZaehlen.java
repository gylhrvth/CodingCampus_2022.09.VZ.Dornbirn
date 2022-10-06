package batuhan.week04;

import java.util.Arrays;

public class BuchstabenZaehlen {


    public static void main(String[] args) {

        String text = lukas.data.Texts.getSimpleText();

        char[] arr = new char[]{'a', 'b', 'c'};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Anzahl: " + arr[i] + " " + countLetter(text, arr[i]));
        }

        printCharacters(text);
    }

    public static void printCharacters(String str) {
        char[] arr = str.toLowerCase().toCharArray();

        int[] charCounter = new int[65535];

        for (int i = 0; i < arr.length; i++) {
            char currentChar = arr[i];
            charCounter[currentChar]++;
        }

        for (int i = 0; i < charCounter.length; i++) {
            int count = charCounter[i];
            if (count > 0) {
                System.out.println("|" + (char) i + "| " + count);
            }
        }
    }



    public static int countLetter(String str, char letter) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentLetter = str.charAt(i);
            if (currentLetter == letter)
                count++;

        }
        return count;
    }
}
