package michel.week04;

import lukas.data.Texts;

public class CountingLetters {
    public static void main(String[] args) {
        String sampleText = Texts.getSimpleText();
        System.out.println(sampleText);
        //printCoutnLetters(countTextLetters(sampleText));

        int [] countedText = countTextLetters2(sampleText);

        for (int i = 0; i < countedText.length; i++) {
           if(countedText[i] > 0) {
               System.out.printf("%3s - %4d %n", (char)i, countedText[i]);
           }
        }
    }

    private static int[] countTextLetters2(String text) {
        int [] arrCounter = new int[Character.MAX_VALUE];
        char [] arrText = text.toCharArray();
        for (int i = 0; i < arrText.length; i++) {
            ++arrCounter[arrText[i]];
        }
        return arrCounter;
    }


//    private static void printCoutnLetters(int[] index) {
//        for (char i = 0; i < index.length; i++) {
//            System.out.println(i);
////            System.out.print(index[i]);
//
//        }
//    }
//
//    private static int[] countTextLetters(String text) {
//        int [] arrCounter = new int [128];                          // Neues Integer Array fürs Zählen 128 Zeichen 0x00 - 0x7F
//        if (text.length() > 0) {                                    // Gesammtlänge "xxxx" des sample Textes solange >0
//            char[] splitString = text.toCharArray();                // Aufsplitten des Strings in ein char Array
//            for (int i = 0; i < text.length(); i++) {               //
//                for (int j = 0; j < text.length() - 1; j++) {
//                    if (splitString[j] > splitString[j + 1]) {
//                        char name = splitString[j];
//                        splitString[j] = splitString[j + 1];
//                        splitString[j + 1] = name;
//                    }
//                }
//            }
//            for (char i = 0; i < arrCounter.length-1; i++) {
//                for (int j = 0; j < splitString.length; j++) {
//                    if (splitString[j] == i) {
//                        arrCounter[i] += 1;
//                    }
//                }
//            }
//            return arrCounter;
//        } else {
//            return null;
//        }
//}
}
