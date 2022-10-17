package berna.week06;

import static berna.week05.ReadFileWithBufferedReader.readFileBuffered;

public class ReadFileAndSearchForWord {

    public static void main(String[] args) {

        //exercise 13: ask user for a word, look for it in the text and return amount of word in the text

        //Location input text:
        String inputText = "txt/simpleText.txt";
        //user input:
        String searchFor = berna.week02.SimpleUserInput.readUserInputString();

        int sum = countWord(inputText,searchFor);

        System.out.println("The word '"+searchFor + "' exists " + sum + " times in the text.");

    }

    public static int countWord(String inputText, String searchFor) {

        String text = readFileBuffered(inputText);
        int sum = 0;
        String[] words = berna.week05.ReadFileCountWords.splitTextWordsOnlyLatin(text);

        for (int i = 0; i < words.length; i++) {

            if(words[i].equals(searchFor)) {
                sum++;
            }

        }
        return sum;
    }
}
