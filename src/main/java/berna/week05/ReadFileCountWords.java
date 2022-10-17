package berna.week05;

import java.util.Arrays;

import static berna.week05.ReadFileWithBufferedReader.readFileBuffered;

public class ReadFileCountWords {
    public static void main(String[] args) {

        //Location input text
        String input = "txt/simpleText.txt";
        String text = readFileBuffered(input);

        //a short test text :)
        String testtext = "all birds        are evil except the 2+3 next to me, and the ice-bear!";
/*
        /
        /Variante 1: remove everything what is NOT a WORD from the text

        String[] wordsOnly = createTextWordsOnly1(text);
        System.out.println("the words-only string looks like: \n" + Arrays.toString(wordsOnly));
        System.out.println("Amount of words variante 1: " + wordsOnly.length);
        System.out.println("\n");

        // variante 2: a word has whitespace before and afterwards!

        int numberWords = readFileCountWords(testtext);

        System.out.println("Amount of words variante 2: " + numberWords);

 */

        //variante 3 : the precise one! works for latinSigns
        String[] wordsOnlyLatin = splitTextWordsOnlyLatin(text);
        System.out.println(Arrays.toString(wordsOnlyLatin));
        System.out.println("Amount of words variante 3: " + wordsOnlyLatin.length);
        System.out.println("\n");

    }

  /*  public static String[] createTextWordsOnly1(String inputText) {
        //variante 1: remove everything which is not a letter from the text, put it into a String and say String.length()

        //!!!!fine for "normal" letters but what´s with all the others? (accents,ao,oe,ue,polish l, etc???)

        String inputText1 = inputText.replaceAll("[^a-zA-Zäöü]", " ");
        String inputText2 = inputText1.replaceAll("\s+", " ");
        String inputText3 = inputText2.replaceAll("[0-9]", " ");

        String[] words = inputText3.split(" ");

        return words;
    }

   */

    public static String[] splitTextWordsOnlyLatin(String inputText) {

        String txt = inputText
                .replaceAll("\\P{IsLatin}", " ")
                .replaceAll("\\s+", " ");

        String[] words = txt.split(" ");
        return words;

    }


   /*
    public static int readFileCountWords(String inputText) {
        //variante 2: // a word has whitespace before and afterwards!

        //!!!!! counts also special characters like * as a word!!

        String t1 = inputText.replaceAll("\n", " ");
        String t2 = t1.replaceAll("[;/\\.?!,():*†\"]", " ");
        String t3 = t2.replaceAll("[0-9]", " ");
        String t4 = t3.replaceAll("\s+", " ");

        System.out.println("t3 was : \n " + t3);

        System.out.println("the words-only string var.2 looks like: \n" + t4);
        System.out.println(Arrays.toString(t4.split(" ")));


        System.out.println("(\s)");
        System.out.println("(\\s)");

        int count = 0;

        for (int i = 0; i < t3.length() - 1; i++) {

            if (t3.charAt(i) == ' ' && t3.charAt(i + 1) != ' ') {
                count++;
            }
        }

        return count;
    }

    */

}