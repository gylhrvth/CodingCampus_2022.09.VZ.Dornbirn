package viktor.week05;

import gyula.week05.ReadFileFromRessorcesWithBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Beispiel {

    public static void printWords(String text) {


        String cleanText = text
                .replaceAll("\\P{IsLatin}", " ")  // alles, was nicht lateinisch ist, wird gelöscht
                .replaceAll("\\s+", " ")
                .trim();

          String[] words = cleanText.split(" ");

          for(int i = 0; i < words.length; i++){
              if (words[i].length() > 0){
                    System.out.println(words[i]);
              }
          }

        }



    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();

        try {

            Reader reader = new InputStreamReader(Objects.requireNonNull(   //reader wird für die Datei "simpleText.txt" erstellt, somit muss nicht der ganze Pfad angegeben werden
                    ReadFileFromRessorcesWithBufferedReader.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));
            BufferedReader br = new BufferedReader(reader);

            int count = 0;
            while (br.ready()) {
                String input = br.readLine();
//                sb.append(input);
//                sb.append('\n');
                printWords(input);

            }

            br.close();

        }catch(IOException ioe){
            ioe.printStackTrace();
        }
//        printWords(sb.toString());
    }
}
