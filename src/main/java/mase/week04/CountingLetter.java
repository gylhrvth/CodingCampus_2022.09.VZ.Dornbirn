package mase.week04;

import lukas.data.Texts;
import mase.week05.Logger;

public class CountingLetter {
    public static void main(String[] args) {
        String sampleText = Texts.getSimpleText();
        System.out.println(sampleText);
        int[]countedText = countChars(sampleText);
        for (int i = 0; i < countedText.length; i++) {
            if (countedText[i] > 0) {
                System.out.printf("%3s - %4d %n", (char) i, countedText[i]);
            }
        }
    }
    public static int[] countChars(String text){
       int[] arrCounter = new int[Character.MAX_VALUE];
       char[] arrText = text.toCharArray();
        for (int i = 0; i < arrText.length; i++) {
            ++arrCounter[arrText[i]];
        }
        return arrCounter;
    }
}
