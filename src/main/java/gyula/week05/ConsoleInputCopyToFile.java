package gyula.week05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleInputCopyToFile {
    public static void main(String[] args) {
        System.out.println("Bitte Geben Sie den Text ein!");
        Scanner sc = new Scanner(System.in);

        try {
            File f = new File("assets/tmp/output.txt");
            f.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f));

            String line = sc.nextLine();
            while (!line.equals("")) {
                ps.println(line);
                line = sc.nextLine();
            }
            ps.close();
            System.out.println("Auf Wiedersehen!");
        } catch (IOException ioe){
            System.out.println("Ich kann nicht schreiben");
            ioe.printStackTrace();
        }
    }
}
