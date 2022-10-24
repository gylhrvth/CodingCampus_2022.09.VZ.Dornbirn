package stefan.week05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteTextFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie ein Text ein");
        String line = sc.nextLine();

        try {
            File f = new File("assets/stefan/week05/helloWorld5.text");
            f.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f, true));

            while (!line.equals("")) {
                ps.println(line);
                line = sc.nextLine();
            }
            ps.close();
            System.out.println("Auf Wiedersehen!");
        } catch (IOException ioe) {
            System.out.println("Ich kann nicht schreiben");
            ioe.printStackTrace();
        }
    }


}