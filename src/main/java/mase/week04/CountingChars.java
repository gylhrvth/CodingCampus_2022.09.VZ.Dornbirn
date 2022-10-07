package mase.week04;

import lukas.data.Texts;

public class CountingChars {
    public static void main(String[] args) {
        String sampleText = Texts.getSimpleText();
        System.out.println(sampleText);
        printcountingChars(countingChars(sampleText));
    }

    public static int[] countingChars(String text) {
        int[] arr = new int[128];
        if (text.length() > 0) {
            char[] stringSplit = text.toCharArray();
            for (int i = 0; i < text.length(); i++) {
                for (int j = 0; j + 1 < text.length(); j++) {
                    if (stringSplit[j] > stringSplit[j + 1]) {
                        char name = stringSplit[j];
                        stringSplit[j] = stringSplit[j + 1];
                        stringSplit[j + 1] = name;
                    }
                }
            }
            for (char i = 0x00; i < 0x7F; i++) {
                for (int j = 0; j < stringSplit.length; j++) {
                    if (stringSplit[j] == i) {
                        arr[i] += 1;
                    }
                }

            }
            return arr;

        } else {
            return null;
        }
    }
    public static void printcountingChars(int[] index){
        for (char i = 0x00; i < 0x7F; i++) {
            if (i > 0)
            System.out.printf("%s: %d |", i, index[i]);
        }
    }
}
