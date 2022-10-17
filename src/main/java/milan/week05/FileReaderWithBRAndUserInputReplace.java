package milan.week05;

import gyula.week05.ReadFileFromRessorcesWithBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;
import java.util.Scanner;

public class FileReaderWithBRAndUserInputReplace {

    public static void main(String[] args) {

        String text = readFileWithBufferedReader("txt/simpleText.txt");
        String prompt = "Bitte das zu ersetzende Wort angeben ";
        String prompt2 = "Mit welchem Wort soll es ersetzt werden?";

        String input1 = userInput(prompt);
        String input2 = userInput(prompt2);
        String finalText = replaceWords(text, input1, input2);
        System.out.println(finalText);
    }

    public static String replaceWords(String text, String input, String input2) {
        if (text.contains(input)){
            return text.replaceAll(input,input2);
        }
        return "Das zu ersetzende Wort kommt nicht im Text vor!";
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

    public static String userInput(String prompt) {
        System.out.println(prompt);
        System.out.println(">>");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
