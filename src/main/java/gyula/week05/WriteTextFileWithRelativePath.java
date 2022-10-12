package gyula.week05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class WriteTextFileWithRelativePath {
    public static void main(String[] args) {
        try {
            File f = new File("assets/gyula/week05/helloWorld5.txt");
            f.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f, true));
            ps.println("Hello World!");
            ps.close();
        } catch (IOException ioe){
            System.out.println("Ich kann nicht schreiben");
            ioe.printStackTrace();
        }
    }
}
