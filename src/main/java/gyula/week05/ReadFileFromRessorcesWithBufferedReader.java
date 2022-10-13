package gyula.week05;

import java.io.*;
import java.util.Objects;

public class ReadFileFromRessorcesWithBufferedReader {
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
