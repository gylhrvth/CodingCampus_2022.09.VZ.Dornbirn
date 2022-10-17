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
        int anzahl = countLetter(text);
        System.out.println("Anzahl der Wörter: " + anzahl);


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

    public static int countLetter(String text) {

        String text2 = text.replaceAll("[“„,.;!?()*/0-9†]", " ");
        String[] arr = text2.split("\\s+");
        System.out.println(Arrays.toString(arr));
        return arr.length;
    }
}
