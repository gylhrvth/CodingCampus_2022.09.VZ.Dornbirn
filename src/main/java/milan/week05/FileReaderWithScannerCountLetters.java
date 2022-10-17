package milan.week05;

import gyula.week05.ReadFileFromRessorcesWithBufferedReader;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;
import java.util.Scanner;

public class FileReaderWithScannerCountLetters {

    public static void main(String[] args) {
        Reader reader = new InputStreamReader(Objects.requireNonNull(ReadFileFromRessorcesWithBufferedReader.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));

        System.out.println(readFileWithScanner(reader));

    }

    public static String readFileWithScanner(Reader text) {
        String line = "";
        Scanner sc = new Scanner(text);
        while (sc.hasNextLine()) {
            line = sc.nextLine();
        }
        sc.close();
        return line;
    }
}
