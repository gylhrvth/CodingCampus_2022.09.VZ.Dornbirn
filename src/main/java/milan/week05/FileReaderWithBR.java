package milan.week05;

import gyula.week05.ReadFileFromRessorcesWithBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;

public class FileReaderWithBR {

    public static void main(String[] args) {
        try {
            Reader reader = new InputStreamReader(
                    Objects.requireNonNull(
                            ReadFileFromRessorcesWithBufferedReader.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));
            BufferedReader br = new BufferedReader(reader);
            while (br.ready()){
                String line = br.readLine();
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
