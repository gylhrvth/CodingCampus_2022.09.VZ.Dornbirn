package fatima.week05;

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
        File file = new File("assets/tmp/logger.txt");
        file.getParentFile().mkdirs();
        GregorianCalendar calendar = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

        try {
            PrintStream ps = new PrintStream(new FileOutputStream(file, true));
            ps.print(sdf.format(calendar.getTime()));

            if (ERROR == severity) {
                ps.print(" ERROR: ");
            } else if (WARNING == severity) {
                ps.print(" WARNING: ");
            } else if (INFO == severity) {
                ps.print(" INFO: ");
            }
            ps.println(message);
            ps.close();
        } catch (IOException ioe) {
            System.out.println("I cannot write");
            ioe.printStackTrace();
        }
    }
}
