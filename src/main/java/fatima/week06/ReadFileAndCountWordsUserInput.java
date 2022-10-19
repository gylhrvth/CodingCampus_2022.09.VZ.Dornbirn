package fatima.week06;

import fatima.week02.UserInput;

import java.io.InputStreamReader;
import java.util.Objects;

public class ReadFileAndCountWordsUserInput {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(Objects.requireNonNull(ReadFileAndCountLetters.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));
        String text = ReadFileAndCountLetters.readFile(isr);
        String input = UserInput.readUserInputString();
        System.out.print("the word >> " + input + " << appears " + countWords(text, input));

        if (countWords(text, input) > 1) {
            System.out.println(" times");
        }
        else System.out.println(" time");
    }

    public static int countWords(String text, String input) {
        text = text
                .replaceAll("\\P{IsLatin}", " ")
                .replaceAll("\\s+", " ")
                .trim();
        String[] words = text.split(" ");
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(input)) {
                counter++;
            }
        }
        return counter;
    }
}

