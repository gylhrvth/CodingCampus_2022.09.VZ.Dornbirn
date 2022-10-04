package berna.week04;

import berna.week02.SimpleUserInput;

public class StringReverse {
    public static void main(String[] args) {
        String inputText = SimpleUserInput.readUserInputString();
        String turnedText = turnAroundString(inputText);
        System.out.println("Result: " + turnedText);
    }

    public static String turnAroundString(String inputText) {

        char[] letters = inputText.toCharArray(); //split the text
        char[] turned = new char[letters.length]; //new array to fill with turned text

        for (int i = 0; i < turned.length; i++) {
            turned[i] = letters[letters.length - 1 - i];
        }
        return String.valueOf(turned);
    }
}

