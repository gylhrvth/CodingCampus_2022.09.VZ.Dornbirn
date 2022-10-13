package fatima.week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;

public class ReadFileAndCountLetters {
    public static void main(String[] args) {
        Reader reader = new InputStreamReader(Objects.requireNonNull(ReadFileAndCountLetters.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));
        read(reader);
        String text = reader.toString();
        int[] count = countChar(text);

            System.out.println(countChar(text));

        }

    public static void read(Reader reader) {
        try {
            BufferedReader br = new BufferedReader(reader);
            while (br.ready()) {
                String line = br.readLine();
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[] countChar(String text) {
        int[] count = new int[Character.MAX_VALUE];
        for (int i = 0; i < text.length(); i++) {
            ++count[i];
        }
        return count;
    }

}

