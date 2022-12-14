package michel.week06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ReadFileCountLetters {
    public static void main(String[] args) {
//        String text = userInputSampleTextScanner();       // UserInput mit ganzem Pfad - Scanner
        String text = userInputSampleTextStream("txt/simpleText.txt");      // User Input mit File Name
        System.out.println(text);
        countLetters(text);
        System.out.println(countChar(text, 'a'));
        char[] charsToCount = {'a', 'z', 'e'};
        System.out.println(countChars(text, charsToCount));
        System.out.println(countWords(text));
        System.out.println(dynCountWords(text)+"< mal vor");
    }

    private static int dynCountWords(String text) {


        int count = 0;
        text = text
                .replaceAll("\\P{IsLatin}"," ")
                .replaceAll("\\s+"," ")
                .trim();
        String [] arrWords = text.split(" ");
        System.out.println("Welches wort soll gezählt werden? ");
        Scanner sc = new Scanner(System.in);
        String wordToChange =  sc.nextLine();
        for (int i = 0; i < arrWords.length; i++) {
            if(arrWords[i].equals(wordToChange)){
                ++count;
            }
        }
        System.out.print("Das eingegebene Wort >" + wordToChange + "< kommt im Text >");
        return count;
    }

    private static int countWords(String text2) {
        // Cleans up Text
        text2 = text2
                .replaceAll("\\P{IsLatin}"," ")     // Replace all non Latin characters with "Space"
                .replaceAll("\\s+"," ")             // Replace all vertical Whitespace characters with "Space"
                .trim();
        // Split text to words
        String [] arrWords = text2.split(" ");                 // Erstellt ein Array aus dem Text und splittet immer bei "Space"
        System.out.print("Gezählte Wörter im Text: ");
        return arrWords.length;
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
        int countSpaceLF = 0;
        for (int i = 0; i < arrText.length; i++) {
            if (arrText[i] == 32 || arrText[i] == 10) {
                countSpaceLF++;
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
        int result = counter - countSpaceLF;
        System.out.println("Gezählte Buchstaben im Text: " + result);
    }

    private static String userInputSampleTextStream(String ressourceName) {
        StringBuilder sampleText = new StringBuilder();

        InputStream inputStream = Objects.requireNonNull(
                ReadFileCountLetters.class.getClassLoader().getResourceAsStream(ressourceName));
        Scanner sc = new Scanner(inputStream);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            sampleText.append(line);
            sampleText.append("\n");
        }
        return sampleText.toString();
    }

//    private static String userInputSampleTextScanner() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Bitte geben Sie den Pfad an: ");
//        String userPath = sc.nextLine();
//        Scanner scan = null;
//        String sampleText = "";
//        try {
//            scan = new Scanner(new File(String.valueOf(userPath)));
//        } catch (FileNotFoundException fnf) {
//            fnf.printStackTrace();
//        }
//        while (scan.hasNext()) {
//            sampleText += scan.nextLine();
//        }
//        scan.close();
//        System.out.print("Sample Text: \n" + sampleText + "\n\n");
//        return sampleText;
//    }
}
