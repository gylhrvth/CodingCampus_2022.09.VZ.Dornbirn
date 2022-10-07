package mase.week04;
import mase.week02.UserInput;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String reverseWord = UserInput.readUserInputString();
        System.out.println(reverseString(reverseWord));
    }

    public static String reverseString(String reverseString) {
        String reversedString;

        char[] splitString = reverseString.toCharArray();
        char[] newStringCharArray = new char[reverseString.length()];
        for (int i = 0; i < reverseString.length(); i++) {
            newStringCharArray[i] = splitString[reverseString.length() - 1 - i];

        }
        reversedString = new String(newStringCharArray);
        return reversedString;
    }
}
