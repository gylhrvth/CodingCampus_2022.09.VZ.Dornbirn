package viktor.week05;

import gyula.week05.ReadFileFromRessorcesWithBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;

public class FileReader {


    public static void main(String[] args) throws IOException {


        try {

            Reader reader = new InputStreamReader (Objects.requireNonNull(   //reader wird für die Datei "simpleText.txt" erstellt, somit muss nicht den ganzen Pfad angegeben werden
                    ReadFileFromRessorcesWithBufferedReader.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));
            BufferedReader br = new BufferedReader(reader);

            while (br.ready()) {
                String input = br.readLine();
                System.out.println(input);
            }

            br.close();

        }catch(IOException ioe){
            ioe.printStackTrace();
        }

    }
}
