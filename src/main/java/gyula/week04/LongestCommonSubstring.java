package gyula.week04;

import lukas.data.Texts;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String t1 = "Hallo wie gehts dir?";
        String t2 = Texts.HESSE;

        System.out.println("Longest common substring: \"" + longestSubString(t1, t2) + "\"");
    }

    public static String longestSubString(String text1, String text2){
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
}
