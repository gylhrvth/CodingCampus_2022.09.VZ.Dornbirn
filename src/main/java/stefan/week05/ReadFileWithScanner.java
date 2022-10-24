package stefan.week05;




import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;
import java.util.Scanner;

public class ReadFileWithScanner {
    public static void main(String[] args) {
        Reader reader = new InputStreamReader
                (Objects.requireNonNull(ReadFileWithScanner.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));

        Scanner sc = new Scanner(reader);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            System.out.println(line);
        }
        sc.close();
    }
}
