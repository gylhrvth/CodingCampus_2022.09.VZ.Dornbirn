package franz.week06;

import gyula.week06.CountLettersAndWords;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class CountOneWord {
    public static void main(String[] args) {
        String text = readTextFile("txt/simpleText.txt");
        System.out.println(text);
        char c = 'a';
        System.out.println("Count letters'" + c + "':" + countLetters(text, c));
        System.out.println("Count Words:" + countWords(text));
    }

    public static String readTextFile(String ressourceName) {
        StringBuilder result = new StringBuilder();

        InputStream inputStream = Objects.requireNonNull(CountLettersAndWords.class.getClassLoader().getResourceAsStream(ressourceName));
        Scanner sc = new Scanner(inputStream);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            result.append(line);
            result.append("\n");
        }
        return result.toString();
    }

    public static int countLetters(String text, char c) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == c) {
                ++count;
            }

        }
        return count;
    }

    public static int countWords(String text) {
        text = text
                .replaceAll("\\P{IsLatin}", " ")
                .replaceAll("\\s+", "")
                .trim();
        String[] words = text.split("");
        System.out.println(Arrays.toString(words));
        return words.length;
    }

    public static Scanner sca() {
        Scanner sc = new Scanner(System.in);
        return sc;
}
}
