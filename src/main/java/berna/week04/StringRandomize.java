package berna.week04;

import berna.week02.SimpleUserInput;

import java.util.Random;

public class StringRandomize {
    //exercise: randomize
    // user input text is shuffled randomly
    private static Random randy = new Random();

    public static void main(String[] args) {
        String inputText = SimpleUserInput.readUserInputString();
        String randomText = createRandomlyFilledText(inputText);
        System.out.println();
        System.out.println("shuffled text : ");
        System.out.println(randomText);

    }

    public static String createRandomlyFilledText(String inputText) {


        char[] letters = inputText.toCharArray(); //split the text
        for (int i = 0; i < 3*inputText.length(); i++) {
            int posA = randy.nextInt(letters.length);
            int posB = randy.nextInt(letters.length);
            //the swap part:
            char temp = letters[posA];
            letters[posA] = letters[posB];
            letters[posB] = temp;
        }
        return new String(letters);
    }
}



