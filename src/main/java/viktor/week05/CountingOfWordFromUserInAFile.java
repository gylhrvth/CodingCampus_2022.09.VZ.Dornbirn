package viktor.week05;

import gyula.week05.ReadFileFromRessorcesWithBufferedReader;
//import org.intellij.lang.annotations.Pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountingOfWordFromUserInAFile {

    public static int getCountingOfWordFromUser(String text, String wort) {

        int count = 0;

        Pattern pattern = Pattern.compile(wort, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {


        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Gib mir bitte ein Wort an:");
            String searchingOfWort = sc.nextLine();

            Reader reader = new InputStreamReader(Objects.requireNonNull(   //reader wird für die Datei "simpleText.txt" erstellt, somit muss nicht den ganzen Pfad angegeben werden
                    ReadFileFromRessorcesWithBufferedReader.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));
            BufferedReader br = new BufferedReader(reader);

            int countingOfWordFromUser = 0;

            while (br.ready()) {
                String input = br.readLine();
                countingOfWordFromUser += getCountingOfWordFromUser(input, searchingOfWort);
                //System.out.println(input);
            }
            System.out.println(searchingOfWort + " kommt " + countingOfWordFromUser + " mal im Text vor.");

            br.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


    }
}
