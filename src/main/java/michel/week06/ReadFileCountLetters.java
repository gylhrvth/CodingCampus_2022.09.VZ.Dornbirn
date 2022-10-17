package michel.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFileCountLetters {
    public static void main(String[] args) {
        String text = userInputSampleText();
        countLetters(text);
        System.out.println(countChar(text, 'a'));
        char[] charsToCount = {'a','z','e'};
        System.out.println(countChars(text, charsToCount));
    }

    private static int countChars(String text, char[] charsToCount) {
        char[] arrText = text.toCharArray();
        int count = 0;
        for (int i = 0; i < arrText.length; i++) {
            for (int j = 0; j < charsToCount.length; j++) {
                if (arrText[i] == charsToCount[j]) {
                    count++;
                }
            }
        }
        System.out.print("Gesammt Anzahl von > " + Arrays.toString(charsToCount) + " < im Text: ");
        return count;
    }

    private static int countChar(String text, char letter) {
        char[] arrText = text.toCharArray();
        int counter = 0;
        for (int i = 0; i < arrText.length; i++) {
            if (letter == arrText[i]) {
                counter++;
            }
        }
        System.out.print("Gezählte > " + letter + " < im Text: ");
        return counter;
    }

    private static void countLetters(String text) {
        char[] arrText = text.toCharArray();
        int counter = 0;
        int countSpace = 0;
        for (int i = 0; i < arrText.length; i++) {
            if(arrText[i] == 32){
                countSpace++;
            }
        }
        for (int i = 0; i < arrText.length; i++) {
            if (arrText[i] <= 65
                    || arrText[i] >= 90
                    || arrText[i] <= 97
                    || arrText[i] >= 122) {
                counter++;
            }
        }
       int result = counter - countSpace;
        System.out.println("Gezählte Buchstaben im Text: " + result);
    }

    private static String userInputSampleText() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Pfad an: ");
        String userPath = sc.nextLine();
        Scanner scan = null;
        String sampleText = "";
        try {
            scan = new Scanner(new File(String.valueOf(userPath)));
        } catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        }
        while (scan.hasNext()) {
           sampleText += scan.nextLine();
        }
        scan.close();
        System.out.print("Sample Text: \n" + sampleText + "\n\n");
        return sampleText;
    }
}
