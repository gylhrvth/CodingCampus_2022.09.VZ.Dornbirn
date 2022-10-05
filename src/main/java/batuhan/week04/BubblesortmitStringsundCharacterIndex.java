package batuhan.week04;

import java.util.Arrays;


public class BubblesortmitStringsundCharacterIndex {

    public static void main(String[] args) {
        String[] names = new String[]{"Mahmut", "Josef", "Konstantin", "Magomed", "Maria", "Said", "Jackichan", "Torsten"};
        System.out.println("befor: " + Arrays.toString(names));
        sortNamesatIndex(names, 2);
        System.out.println("After; " + Arrays.toString(names));
        System.out.println();

    }


    public static String[] sortNamesatIndex(String[] texts, int index) {
        for (int i = 0; i < texts.length; i++) {
            for (int j = 0; j < texts.length - i - 1; j++) {
                if ((texts[j].length() > index &&
                        texts[j + 1].length() > index &&
                        texts[j].charAt(index) > texts[j + 1].charAt(index))


                        || (texts[j].length() <= index &&
                        texts[j].length() < texts[j + 1].length()

                )) {
                    String temp = texts[j];
                    texts[j] = texts[j + 1];
                    texts[j + 1] = temp;


                }

            }
        }
        return texts;
    }



}
