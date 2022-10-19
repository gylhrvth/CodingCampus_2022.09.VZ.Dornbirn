package berna.week06;

import java.util.InputMismatchException;
import java.util.Scanner;

import static berna.week05.ReadFileWithBufferedReader.readFileBuffered;

public class ReadFileAndSearchForWord {

    public static void main(String[] args) {

        //exercise 13: ask user for a word, look for it in the text and return amount of word in the text

        //Location input text:
        String inputText = "txt/simpleText.txt";
        //user input:
        boolean caseSensitiv = getUserInputIfCaseSensitive();
        String searchFor = getUserInputWord();

        int sum = countWord(inputText, searchFor, caseSensitiv);

        System.out.println("The word '" + searchFor + "' exists " + sum + " times in the text.");


    }


    public static boolean getUserInputIfCaseSensitive() {
        Scanner sc = new Scanner(System.in);
        System.out.println("so you´re looking for a word in a text.");
        System.out.println("first i need to know: \n Do you need your word EXACTLY like what you type in? (1) \n Or do you want your search case-independent? (2) \"");

        int nr = 0;
        while (nr == 0) {
            try {
                nr = sc.nextInt();
                if ((nr < 1) || (nr > 2)) {
                    System.out.println("there are only 2 possibilities! choose again: ");
                    nr = 0;  // reset the number to zero because you defined while ==0!
                }
            } catch (InputMismatchException ime) {
                System.out.println("This was not a number! Enter an integer number:");
            }
        }
        sc.nextLine();  // reset the user input
        return (nr == 1); // is equivalent to:  if(nr ==1) return true
    }


    public static String getUserInputWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        return sc.nextLine();
    }

    public static int countWord(String inputText, String searchFor, boolean caseSensitiv) {

        String text = readFileBuffered(inputText);
        System.out.println(text);
        int sum = 0;
        String[] words = berna.week05.ReadFileCountWords.splitTextWordsOnlyLatin(text);

        for (int i = 0; i < words.length; i++) {
            if (caseSensitiv && words[i].equals(searchFor)) {
                sum++;
            } else if (!caseSensitiv && words[i].equalsIgnoreCase(searchFor)) {
                sum++;
            }

        }
        return sum;
    }
}
