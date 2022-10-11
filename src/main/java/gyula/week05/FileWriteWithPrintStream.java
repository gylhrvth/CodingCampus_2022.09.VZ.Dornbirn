package gyula.week05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileWriteWithPrintStream {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\DCV\\Documents\\HelloWorld.txt", true);
            PrintStream ps = new PrintStream(fos);

            ps.println("Es ist gelungen! :-)");
            ps.close();

        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
