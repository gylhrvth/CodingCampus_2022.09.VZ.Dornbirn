package viktor.week04;

import java.util.Scanner;

public class LongestSubstring {

    public static String readString() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Gib mir bitte ein Wort an!");
        String text = sc.nextLine();
        return text;
    }

    public static String longestCommonSubString(String text1, String text2) {


        if (text1.length() < text2.length()) {
            String temp = text1;
            text1 = text2;
            text2 = temp;
        }

        for (int testLen = text2.length() ; testLen >= 1 ; testLen--) {
            for (int startIndex = 0; startIndex < text2.length() - testLen + 1; startIndex++) {
                String sub = text2.substring(startIndex, startIndex + testLen);
                if (text1.contains(sub)){
                    return sub;
                }
            }
        }
        return "";

    }


    public static void main(String[] args) {

        String text1 = readString();
        String text2 = readString();


        System.out.println(longestCommonSubString(text1,text2));

    }

}


