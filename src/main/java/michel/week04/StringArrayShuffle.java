package michel.week04;


import java.util.Random;

import static michel.week04.ReverseStringArray.*;

public class StringArrayShuffle {
    private static final Random rand = new Random();

    public static void main(String[] args) {
        String shuffleWord = userInput();
        System.out.println(shuffleString(shuffleWord));
    }

    private static String shuffleString(String toShuffleWord) {
        String randomizedString;
        int stringLength = toShuffleWord.length();
        if (stringLength > 0) {
            char[] splitString = toShuffleWord.toCharArray();
            char[] newStringCharArray = new char[toShuffleWord.length()];
            for (int i = 0; i < splitString.length; i++) {
                newStringCharArray[i] = splitString[i];
            }
            for (int i = 0; i < toShuffleWord.length(); i++) {
                int randInt = rand.nextInt(toShuffleWord.length());
                char Zeichen = newStringCharArray[i];
                newStringCharArray[i] = newStringCharArray[randInt];
                newStringCharArray[randInt] = Zeichen;
            }
            randomizedString = new String(newStringCharArray);
            return randomizedString;
        }
        randomizedString = "";
        return randomizedString;
    }
}
