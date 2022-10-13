package fatima.week05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        File f = new File("assets/tmp/output.txt");
        System.out.println("Enter a text");
        writeFile(f);
    }

    public static void writeFile(File f) {
        Scanner sc = new Scanner(System.in);
        try {
            f.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f, true));

            String line = sc.nextLine();
            while (!line.equals("")) {
                ps.println(line);
                line = sc.nextLine();
            }
            ps.close();
            System.out.println("Good bye!");
        } catch (IOException ioe) {
            System.out.println("I cannot write");
            ioe.printStackTrace();
        }
    }
}
