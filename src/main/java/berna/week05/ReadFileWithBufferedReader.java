package berna.week05;



import java.io.*;
import java.util.Objects;

public class ReadFileWithBufferedReader {

    public static void main(String[] args) {

        //location of input file:
        String locationInput = "txt/simpleText.txt";

        String text = readFileBuffered(locationInput);
        System.out.println(text);
    }

    public static String readFileBuffered(String locationInput) {
        String text = "";
        try {
            Reader reader = new InputStreamReader(
                    Objects.requireNonNull(
                            ReadFileWithBufferedReader.class.getClassLoader().getResourceAsStream(locationInput)));
            BufferedReader br = new BufferedReader(reader);
            while (br.ready()) {
                String line = br.readLine();
                // System.out.println(line);
                text = text + line;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}

