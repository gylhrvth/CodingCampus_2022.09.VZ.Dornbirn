package milan.week05;

import gyula.week05.ReadFileFromRessorcesWithBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;
import java.util.Scanner;

public class FileReaderWithBRAndUserInput {

    public static void main(String[] args) {

        int count = 0;
        String text = readFileWithBufferedReader("txt/simpleText.txt");
        do {
            String input = userInput();
            count = checkIfContainsAndCount(text, input);
            System.out.println("Das Wort \"" + input + "\" kommt " + count + " mal vor!");
        } while (count == 0);
    }

    public static int checkIfContainsAndCount(String text, String input) {
        int count = 0;
        if (text.contains(input)) {
            String[] arr = text.split("\\s+");
            for (String x : arr) {
                if (x.equals(input)) {
                    ++count;
                }
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

    public static String userInput() {
        System.out.println("Bitte das gesuchte Wort eingeben!");
        System.out.println(">>");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
