package gyula.week06;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class CountLettersAndWords {
    public static void main(String[] args) {
        String text = readTextFile("txt/simpleText.txt");
        System.out.println(text);
        char c = 'a';
        System.out.println("Count letter '" + c + "': " + countLetter(text, c));
        System.out.println("Count words: " + countWords(text));
    }

    public static String readTextFile(String ressourceName){
        StringBuilder result = new StringBuilder();

        InputStream inputStream = Objects.requireNonNull(CountLettersAndWords.class.getClassLoader().getResourceAsStream(ressourceName));
        Scanner sc = new Scanner(inputStream);
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            result.append(line);
            result.append("\n");
        }

        return result.toString();
    }

    public static int countLetter(String text, char c){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == c){
                ++count;
            }
        }

        return count;
    }

    public static int countWords(String text){
        // 1. Step: Clean input
        text = text
                .replaceAll("\\P{IsLatin}", " ")
                .replaceAll("\\s+", " ")
                .trim();
        // 2. Step: Split text to words
        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));

        return words.length;
    }
}
