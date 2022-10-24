package stefan.week06;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ReadAndDisplay {
    public static void main(String[] args) {
        String text = textreader("csv/sales_100.csv");
        System.out.println(text);
       String []arr = zeilen(text);
        System.out.println(arr);
    }


    public static String textreader(String text) {

        StringBuilder content = new StringBuilder();
        try {
            Reader reader = new InputStreamReader(
                    Objects.requireNonNull(
                            gyula.week05.ReadFileFromRessorcesWithBufferedReader.class.getClassLoader().getResourceAsStream(text)));
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

    public static String [] zeilen(String text) {
        String[]arr = text.split("\\n");

    return arr;
    }

}

