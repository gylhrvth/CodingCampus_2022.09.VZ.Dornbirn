package stefan.week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class DynamischeWorterZahlen {
    public static void main(String[] args) {
        String text = textReader("txt/simpleText.txt");
        System.out.println(text);
       String input = userInput();
        int anzahal = count(text,input);
        System.out.println("Das Wort kommt: "+ anzahal +" mal vor");
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

    public static String userInput() {
        System.out.println("Geben sie ein Wort ein");
        Scanner sc = new Scanner(System.in);
        sc.hasNextLine();
        return sc.nextLine();
    }

    public static int count(String text ,String userInput) {
        int anzahl = 0;
        if (text.contains(userInput)) {
            String[] arr = text.split("\\s");
            for (String a:arr) {
                if (a.equals(userInput)) {
                    anzahl++;

                }
            }
        }
      return anzahl;

    }

}


