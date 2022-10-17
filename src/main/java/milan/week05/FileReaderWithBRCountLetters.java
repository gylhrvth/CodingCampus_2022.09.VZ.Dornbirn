package milan.week05;

import gyula.week05.ReadFileFromRessorcesWithBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

public class FileReaderWithBRCountLetters {
    public static void main(String[] args) {

        String text = readFileWithBufferedReader("txt/simpleText.txt");
        char c = 'a';
        int anzahlZeichen = countLetter(text, c);
        System.out.println("Der Buchstabe: \"" + c + "\" kommt " + anzahlZeichen + " mal vor!");
    }

    public static int countLetter(String text, char c) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == c) {
                ++count;
            }
        }

        return count;
    }

    public static String readFileWithBufferedReader(String ressourceName) {
        Reader reader = new InputStreamReader(Objects.requireNonNull(ReadFileFromRessorcesWithBufferedReader.class.getClassLoader().getResourceAsStream(ressourceName)));
        StringBuilder content = new StringBuilder();     //legt einen Stringbulder an, um die Lines zusammenzuhängen
        try {
            BufferedReader br = new BufferedReader(reader);
            while (br.ready()) {
                String line = br.readLine();             //liest Line
                content.append(line);                    //hängt die Lines zusammen
                content.append('\n');                    //fügt einen Zeilenumbruch hinzu
            }
            br.close();
        } catch (IOException ieo) {
            ieo.printStackTrace();
        }
        return content.toString();
    }

}
