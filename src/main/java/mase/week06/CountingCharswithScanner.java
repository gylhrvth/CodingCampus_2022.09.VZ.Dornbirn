package mase.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class CountingCharswithScanner {
    public static void main(String[] args) {
        String text = userInputSampleText();
        countLetters(text);
        System.out.println(countChar(text, 'a'));
        char[] charsToCount = {'a', 'z', 'e'};
        System.out.println(countingChar(text, charsToCount));
    }

    public static int countingChar(String text, char[] charsToCount ){
        char[] arr = text.toCharArray();
        int count = 0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <charsToCount.length; j++) {
                if (arr[i] == charsToCount[j]){
                    count++;
                }
            }

        }
        System.out.println("Gesamtzahl von: " + Arrays.toString(charsToCount) + "Im Text");
        return count;
    }

    public static int countChar(String text , char letter) {
        char[] arrText = text.toCharArray();
        int counter = 0;
        for (int i = 0; i < arrText.length; i++) {
            if (letter == arrText[i]){
                counter++;
            }
        }
        System.out.print("Gezählter Buchstabe : " + letter + " im Text vorhanden: ");
        return counter;
    }

    public static void countLetters(String text) {
        char[] arrText = text.toCharArray();
        int count = 0;
        int countSpace = 0;
        for (int i = 0; i < arrText.length; i++) {
            if (arrText[i] == 32) {
                countSpace++;
            }
        }
        for (int i = 0; i < arrText.length; i++) {
            if (arrText[i] <= 65
                    || arrText[i] >= 90
                    || arrText[i] <= 97
                    || arrText[i] >= 122) {
                count++;
            }

        }
        System.out.println("Alle Buchstaben zusammen ergeben: " + (count - countSpace));

    }

    public static String userInputSampleText() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Geben Sie einen Pfad ein");
        String userPath = scanner.nextLine();
        Scanner scan = null;
        String sampleText = "";
        try {
            scan = new Scanner(new File(String.valueOf(userPath)));
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        while (scan.hasNext()) {
            sampleText += scan.nextLine();
        }
        scan.close();
        System.out.print("Sample Text: \n" + sampleText + "\n\n");
        return sampleText;
    }
}
