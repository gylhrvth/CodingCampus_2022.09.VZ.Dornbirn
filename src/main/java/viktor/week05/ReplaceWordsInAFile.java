package viktor.week05;

import gyula.week05.ReadFileFromRessorcesWithBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceWordsInAFile {

    public static void replaceWordsFromUser(String text, String oldWord, String newWord) {

        Pattern pattern = Pattern.compile(oldWord, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        String result ="";

        while (matcher.find()) {
            result = matcher.replaceAll(newWord);
        }

        System.out.println(result);
    }

    public static void main(String[] args) {


        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Gib mir bitte das zu ersetzende Wort an:");
            String wort1 = sc.nextLine();
            System.out.println("Gib mir bitte das neue Wort an:");
            String wort2 = sc.nextLine();

            Reader reader = new InputStreamReader(Objects.requireNonNull(   //reader wird für die Datei "simpleText.txt" erstellt, somit muss nicht den ganzen Pfad angegeben werden
                    ReadFileFromRessorcesWithBufferedReader.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));
            BufferedReader br = new BufferedReader(reader);

            while (br.ready()) {
                String input = br.readLine();
                replaceWordsFromUser(input, wort1, wort2);
            }

            br.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
