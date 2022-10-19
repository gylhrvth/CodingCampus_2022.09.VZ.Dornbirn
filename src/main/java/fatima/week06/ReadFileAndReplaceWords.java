package fatima.week06;

import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;

public class ReadFileAndReplaceWords {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(Objects.requireNonNull(ReadFileAndCountLetters.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));
        String text = ReadFileAndCountLetters.readFile(isr);
        System.out.println(text);

        String word1 = readUserInput("Which word do you want to replace?");
        String word2 = readUserInput("Which word should be replaced with?");
        System.out.println(replaceWord(text, word1, word2));
    }

    public static String readUserInput(String message) {
        System.out.println(message);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static String replaceWord(String text, String word1, String word2) {
        text = text.replaceAll(word1, word2);
        System.out.println(text);
        return text;
    }
}
