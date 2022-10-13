package stefan.week05;

import gyula.week05.ReadFileFromRessorcesWithBufferedReader;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;
import java.util.Scanner;

public class CountLetter {


        public static void main(String[] args) {

            Reader reader = new InputStreamReader
                    (Objects.requireNonNull(ReadFileFromRessorcesWithBufferedReader.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));

                 Scanner sc = new Scanner(reader);
                 while (sc.hasNextLine()) {
                String line = sc.nextLine();

                System.out.println(line);

            }
            sc.close();
        }

}
