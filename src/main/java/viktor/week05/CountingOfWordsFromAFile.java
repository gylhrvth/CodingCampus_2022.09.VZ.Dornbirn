package viktor.week05;

import gyula.week05.ReadFileFromRessorcesWithBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;

public class CountingOfWordsFromAFile {

    public static int getCountOfWordsFromAFile(String text){

        int count = 0;

        String cleanText = text
                .replaceAll("\\P{IsLatin}", " ")  // alles, was nicht lateinisch ist, wird gelöscht
                .replaceAll("\\s+", " ")          // wenn es mehrere Spaces gibt, die werden gelöscht
                .trim();                                    // mit trim wird das Leerzeichen vor dem Wort und nach dem Wort abgeschnitten

        String[] words = cleanText.split(" ");

        for(int i = 0; i < words.length; i++){
            if (words[i].length() > 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        try {

            Reader reader = new InputStreamReader(Objects.requireNonNull(   //reader wird für die Datei "simpleText.txt" erstellt, somit muss nicht der ganze Pfad angegeben werden
                    ReadFileFromRessorcesWithBufferedReader.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));
            BufferedReader br = new BufferedReader(reader);

            int countingOfWords = 0;
            while (br.ready()) {
                String input = br.readLine();
                countingOfWords += getCountOfWordsFromAFile(input);
            }
            System.out.println("Anzahl der Wörter: " + countingOfWords);
            br.close();

        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}

