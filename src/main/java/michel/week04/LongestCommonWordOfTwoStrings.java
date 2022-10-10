package michel.week04;

import java.util.Scanner;

public class LongestCommonWordOfTwoStrings {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bitte Geben Sie einen Text ein: ");
        System.out.print(">>> ");
        String userInput1 = sc.nextLine();
        System.out.println("Bitte Geben Sie noch einen Text zum vergleichen ein: ");
        System.out.print(">>> ");
        String userInput2 = sc.nextLine();

        longestWord(userInput1, userInput2);
        longestString(userInput1, userInput2);

    }

    private static void longestString(String userInput1, String userInput2) {
        String longestSubString = "";
        for (int i = 0; i < userInput1.length(); i++) {
            for (int j = i; j < userInput1.length(); j++) {
                String subStr = userInput1.substring(i, j + 1);
                if (userInput2.contains(subStr)) {
                    if (subStr.length() >= longestSubString.length()) {
                        longestSubString = subStr;
                    }
                } else {
                    break;
                }
            }
        }
        System.out.print("Die längste gemeinsame Zeichenkette lautet: ");
        System.out.println(longestSubString);
    }


    private static void longestWord(String userInput1, String userInput2) {
        String longestSubString = "";
        for (int i = 0; i < userInput1.length(); i++) {
            for (int j = i; j < userInput1.length(); j++) {
                String subStr = userInput1.substring(i, j + 1);
                if (userInput2.contains(subStr)) {
                    if (subStr.length() > longestSubString.length()) {
                        longestSubString = subStr;
                    }
                } else {
                    break;
                }
            }
        }
        System.out.print("Der längste gemeinsame Wort lautet: ");
        System.out.println(longestSubString);
    }
}
