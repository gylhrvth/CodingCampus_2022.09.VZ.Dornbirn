package stefan.week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;
import java.util.Scanner;

public class DynamicheWorterErsetezn {
    public static void main(String[] args) {



        String text = textReader("txt/simpleText.txt");
        System.out.println(text);
        String input1 = userInput(text);
        if (input1.equals("Dieses Wort gibt es nicht")) {
            System.out.println(input1);
        }else {
        String input2 = userInput2();
        String change = changeLetter(text, input1, input2);
          System.out.println(change);}

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

    public static String userInput2() {
        System.out.println("Geben sie ein Wort ein ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }


    public static String userInput(String text) {
        System.out.println("Geben sie ein Wort ein wo sie ändern mochten");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if (text.contains(line)) {
            return line;
        } else {

            return "Dieses Wort gibt es nicht";
        }
    }

    public static String changeLetter(String text, String input1, String input2) {
        String text2 = text.replaceAll(input1, input2);
        return text2;


    }
}

