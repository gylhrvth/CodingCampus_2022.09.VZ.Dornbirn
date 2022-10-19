package fatima.week06;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class ReadFileAndCountWords {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(Objects.requireNonNull(ReadFileAndCountLetters.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));
        String text = ReadFileAndCountLetters.readFile(isr);
        System.out.println("word count: " + countWords(text));
    }

    public static int countWords(String text) {
        text = text
                .replaceAll("\\P{IsLatin}", " ")
                .replaceAll("\\s+", " ")
                .trim();
        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));
        return words.length;
    }
}
