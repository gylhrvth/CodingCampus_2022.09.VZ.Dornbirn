package berna.week05;

import static berna.week05.ReadFileWithBufferedReader.readFileBuffered;
import static berna.week04.SearchAndCountWords.searchAndCount;


public class ReadFileAndCountLetters {
    //read a file in and count letters

    public static void main(String[] args) {

        //Location input text
        String input = "txt/simpleText.txt";
        String letter = "*";
        // How many of "letter"?
        int amount = readFileAndCountLetter(input,letter);
        System.out.println("amount '" + letter + "' : " + amount);
        System.out.println("\n");

        //char exercise
        char[] charsToCount = new char[]{'a', 'z', 'e'};
        int sum = readFileAndCountChars(input, charsToCount);

        //check if done correctly:
        System.out.println("a: " + readFileAndCountLetter(input,"a"));
        System.out.println("z: " + readFileAndCountLetter(input,"z"));
        System.out.println("e: " + readFileAndCountLetter(input,"e"));

        System.out.println("Sum: " + sum);


    }

    public static int readFileAndCountLetter(String inputText, String searchfor){
        String text = readFileBuffered(inputText);
        int amount = searchAndCount(text,searchfor);
        return amount;
    }

    public static int readFileAndCountChars(String inputText, char[] searchforChar){
        String text = readFileBuffered(inputText);
        int sum = 0;

        for (int i = 0; i < searchforChar.length; i++) {
            int amount = searchAndCount(text, String.valueOf(searchforChar[i]));
            sum = sum + amount;
        }
        return sum;
    }

}
