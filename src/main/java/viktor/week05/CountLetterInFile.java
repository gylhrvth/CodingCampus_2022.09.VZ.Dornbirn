package viktor.week05;

import gyula.week05.ReadFileFromRessorcesWithBufferedReader;
import viktor.week04.LetterCounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;

public class CountLetterInFile {

    public static int counterLetterInFile(String text, char letter) {

        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == letter) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        try {

            Reader reader = new InputStreamReader(Objects.requireNonNull(   //reader wird für die Datei "simpleText.txt" erstellt, somit muss nicht den ganzen Pfad angegeben werden
                    ReadFileFromRessorcesWithBufferedReader.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));
            BufferedReader br = new BufferedReader(reader);

            int count = 0;
            while (br.ready()) {

                String input = br.readLine();

                //int[] count = LetterCounter.counterLetter(input);
                //LetterCounter.print(count);
                count += counterLetterInFile(input, 'r');

            }
            System.out.println(count);
            br.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


    }
}
