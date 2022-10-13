package patric.week05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileSchreiben {
    public static void main(String[] args) {

        try {
            File f = new File("assets/tmp/output.txt");
            f.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f, true));
            ps.println("Hello World! \n So ein Spaß \n usw");
            ps.close();
        } catch (IOException ioe) {
            System.out.println("kann nicht schreiben");
            ioe.printStackTrace();
        }
    }
}
