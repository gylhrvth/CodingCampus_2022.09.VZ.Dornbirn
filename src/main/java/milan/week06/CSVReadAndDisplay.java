package milan.week06;

import gyula.week05.ReadFileFromRessorcesWithBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

public class CSVReadAndDisplay {
    public static void main(String[] args) {

        String text = readFileWithBufferedReader("csv/sales_100.csv");
        System.out.println(text);
        //String [][] newArr =
        createArr(text);
    }

    public static void createArr(String text) {
        String[] arrRow = text.split("\\n");
        System.out.println(arrRow[1]);

    }

    //return arr;


    public static String readFileWithBufferedReader(String ressourceName) {
        Reader reader = new InputStreamReader(Objects.requireNonNull(CSVReadAndDisplay.class.getClassLoader().getResourceAsStream(ressourceName)));
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
}
