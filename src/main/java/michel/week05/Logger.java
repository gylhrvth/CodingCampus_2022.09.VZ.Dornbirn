package michel.week05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Logger {
    public static int ERROR = 1;
    public static int WARNING = 2;
    public static int INFO = 3;

    public static void log(int severity, String message) {
        GregorianCalendar calendar = new GregorianCalendar();
        SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd.");
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");

        File f = new File("assets/tmp/loggFile.txt");

        if (f.length() > 1000) {
            f.renameTo(new File(f.getAbsolutePath() + ".old"));
        }
        try {
            f.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f, true));
            ps.print(date.format(calendar.getTime()) + " " + (time.format(calendar.getTime())) + "  ");
            if (severity == ERROR) {
                ps.print("ERROR: ");
            } else if (severity == WARNING) {
                ps.print("WARNING: ");
            } else if (severity == INFO) {
                ps.print("INFO: ");
            }
            ps.println(message);
            ps.close();
        } catch (IOException ioe) {
            System.out.println("Ich kann nicht schreiben");
            ioe.printStackTrace();
        }
    }
}
