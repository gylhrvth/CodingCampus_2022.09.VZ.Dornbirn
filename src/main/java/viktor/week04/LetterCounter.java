package viktor.week04;

import lukas.data.Texts;

import java.util.Random;
import java.util.Scanner;

public class LetterCounter {

    public static int[] counterLetter(String text) {

        int[] count = new int[Character.MAX_VALUE + 1];

        for (int i = 0; i < text.length(); i++) {

            char c = text.charAt(i);

            count[c]++;
        }

        return count;

    }

    public static void print(int[] count) {

        for (int j = 0; j < count.length; j++) {


            if (count[j] > 0) {

                String charName;
                if (j < 33) {
                    charName = Character.getName(j);
                } else {

                    charName = Character.toString((char)j);
                }
                System.out.printf("%5d | (%d) %s%n", count[j], j, charName);

            }
        }
    }

    public static void main(String[] args) {

        String text = Texts.getSimpleText();
        System.out.println(text);
        System.out.println();

        String charName = Character.toString(42);
        System.out.println(charName);

        System.out.printf(Character.getName(20));

        System.out.println(Character.MAX_VALUE+1);


        int[] count = counterLetter(text);
        print(count);


    }
}
