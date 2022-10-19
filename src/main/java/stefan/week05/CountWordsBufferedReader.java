package stefan.week05;


import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class CountWordsBufferedReader {


    public static void main(String[] args) {

        String text = textReader("txt/simpleText.txt");
        System.out.println(text);
        int anzahl = countWords(text);
        System.out.println();
        System.out.println("Anzahl der Wörter:" + anzahl);
        char c = 'b';
        System.out.println("Count letter '" + c + "': " + countLetter(text, c));
    }

    public static String textReader(String ressourceName) {
        StringBuilder content = new StringBuilder();
        try {
            Reader reader = new InputStreamReader(
                    Objects.requireNonNull(
                            gyula.week05.ReadFileFromRessorcesWithBufferedReader.class.getClassLoader().getResourceAsStream(ressourceName)));
            BufferedReader br = new BufferedReader(reader);
            while (br.ready()) {
                String line = br.readLine();
                content.append(line);
                content.append("\n");


            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    public static int countWords(String text) {
        String replace = text.replaceAll("[*,(,),.,!,?]", " ");
        String[] arr = replace.split("\\s+");

        System.out.println(Arrays.toString(arr));
        return arr.length;

    }

    public static int countLetter(String text, char c) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

}
