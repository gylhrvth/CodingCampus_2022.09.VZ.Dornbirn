package stefan.week04;


import lukas.data.Texts;

import java.util.Arrays;

public class CountLetters {

    public static void main(String[] args) {

        String text = Texts.getSimpleText();
        System.out.println(Texts.getSimpleText());
        System.out.println("Anzahl der Worter");
        countString(text);
        countletters(text);
    }


    public static void countString(String text) {

        int countletters = 0;

        for (int i = 0; i < text.length(); i++) {
            countletters++;
        }

        System.out.println(countletters);
    }

    public static void countletters(String text) {
        char[] array = text.toCharArray();
        int[] counter = new int[1 + Character.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            ++counter[c];
            //System.out.println(c + " " + (int)c);
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > 0) {
                System.out.println((char) i + " " + counter[i]);
            }
        }

    }

}
