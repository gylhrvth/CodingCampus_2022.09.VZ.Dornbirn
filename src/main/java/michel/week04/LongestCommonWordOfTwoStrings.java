package michel.week04;

import java.util.Scanner;

public class LongestCommonWordOfTwoStrings {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bitte Geben Sie einen Text ein: ");
        String userInput1 = sc.nextLine();
        System.out.println("Bitte Geben Sie noch einen Text zum vergleichen ein: ");
        String userInput2 = sc.nextLine();
        System.out.println("input1: @"+userInput1+"@ input2: @"+userInput2+"@");


        String longestSubString = "";
        for (int i = 0; i < userInput1.length(); i++) {
            for (int j = i; j < userInput1.length(); j++) {
                String subStr = userInput1.substring(i, j + 1);
                if (userInput2.contains(subStr)) {
                    if(subStr.length() > longestSubString.length()) {
                        longestSubString = subStr;
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println(longestSubString);
    }
}
