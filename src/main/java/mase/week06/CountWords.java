package mase.week06;

import java.io.InputStream;
import java.util.Objects;
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        String text = readTextFile("txt/simpleText.txt");
        System.out.println(text);
    }

    public static String readTextFile(String text) {
        StringBuilder sb = new StringBuilder();

        InputStream inputStream = Objects.requireNonNull(CountWords.class.getClassLoader().getResourceAsStream(text));
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            sb.append(line);
            sb.append("\n");
        }
        return sb.toString();
    }
}
//    public static int countWords(String text, char c){
//        text=text.replaceAll("\\P{IsLatin}","")
//                .replaceAll("\\s", "")
//                .trim();
//
//
//
//
//    }
//}
