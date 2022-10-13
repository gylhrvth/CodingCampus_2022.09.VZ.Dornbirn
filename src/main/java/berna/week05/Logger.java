package berna.week05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Logger {
    //create a logging file, content is appended
    /*
   severity=1  --> ERROR
   severity=2  --> WARNING
   severity=3  --> INFO

   Ergebnis:
   2022.04.26. 09:30:34 INFO: Guten Morgen!
   2022.04.26. 09:31:01 WARNING: Keine passende Aufgabe gefunden
   ...
*/
    public static void main(String[] args) {
        log(Severity.INFO, "Hello World!");
    }

    public enum Severity {
        ERROR,
        WARNING,
        INFO
    }


    /*
        public static int ERROR = 1;
        public static int WARNING = 2;
        public static int INFO = 3;
    */
    public static void log(Severity severity, String message) {

        File path = new File("assets/tmp/logfile.txt");
        path.getParentFile().mkdirs();
        try {
            FileOutputStream fos = new FileOutputStream(path, true);

            PrintStream ps = new PrintStream(fos);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.  HH:mm:ss ");
            GregorianCalendar today = new GregorianCalendar();
            Date dateTime = today.getTime();

            String text = "";
            if (severity == Severity.ERROR) {
                text = "ERROR";
            } else if (severity == Severity.WARNING) {
                text = "WARNING";
            } else if (severity == Severity.INFO) {
                text = "INFO";
            }
            ps.printf("%s  %-7s : %s %n", sdf.format(dateTime), text, message);
            ps.close();
            //throw new IOException("Alles ist schief");
        }catch(IOException ioe) {
            ioe.printStackTrace();
            //throw new RuntimeException(ioe);
        }


    }
}
