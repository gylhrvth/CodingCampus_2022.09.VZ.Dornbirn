package mase.week04;

import java.util.Scanner;

public class UpperString {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        gemNenner();

    }

    public static void gemNenner() {
        System.out.println("Geben Sie Wort 1 ein:");
        String word = sc.nextLine();
        System.out.println("Geben Sie Wort 2 ein");
        String word2 = sc.nextLine();

        String longestSubString = "";
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                String sub = word.substring(i, j + 1);
                if (word2.contains(sub)) {
                    if (sub.length() > longestSubString.length()) {
                        longestSubString = sub;
                    }
                }else {
                        break;
                    }
                }
            }
        System.out.println(longestSubString);
    }
}