package fatima.week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class ReadFileAndCountLetters {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(Objects.requireNonNull(ReadFileAndCountLetters.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));
        String text = readFile(isr);
        System.out.println("Dein Text ist: " + text);
        System.out.println();

        int countChar = countChar(text);
        System.out.println("Total characters: " + countChar);

        char c = 'a';
        int countSpecChar = countSpecificChar(text, c);
        System.out.println("The char '" + c + "' appears " + countSpecChar + " times.");

        char[] charsToCount = new char[]{'a', 'z', 'e'};
        System.out.println("The chars " + Arrays.toString(charsToCount) + " appears " + countChars(text, charsToCount) + " times in the text.");
    }

    public static String readFile(InputStreamReader reader) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(reader);
            while (br.ready()) {
                String line = br.readLine();
                sb.append(line);
                if (br.ready()) {
                    sb.append('\n');
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static int countChar(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ')
                count++;
        }
        return count;
    }

    public static int countSpecificChar(String text, char letter) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter)
                count++;
        }
        return count;
    }

    public static int countChars(String text, char[] letters) {
        int count = 0;
        char[] charsInText = text.toCharArray();
        for (int i = 0; i < charsInText.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                if (charsInText[i] == letters[j]) {
                    ++count;
                }
            }
        }
        return count;
    }
}

