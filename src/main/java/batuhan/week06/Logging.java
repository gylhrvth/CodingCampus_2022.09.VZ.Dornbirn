package batuhan.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Logging {

    public static int ERROR;
    public static int WARNING;
    public static int INFO;


    public static void log(int severity, String message) {
        File logfile = new File("assets/log/logging.txt");
        logfile.getParentFile().mkdirs();

        if (logfile.exists() && logfile.length() > 1000000) {
            File oldfile = new File(logfile.getAbsolutePath() + ".old");
            oldfile.delete();
            logfile.renameTo(oldfile);
        }

        try {
            PrintStream ps = new PrintStream(new FileOutputStream(logfile, true));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");

            String severityTest = "";

            if (severity == ERROR) severityTest = "ERROR";
            else if (severity == WARNING) severityTest = "WARNING";
            else if (severity == INFO) severityTest = "INFO";
            else severityTest = "UNKNOWN(" + severity + ")";

            ps.printf("%s %s: %s\n",
                    sdf.format(new Date()),
                    severityTest,
                    message

            );
            ps.close();

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String testText = "KingKong".repeat(500);
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
            log(ERROR, "Alles ist schief " + testText);
            log(WARNING, "Ein bischen schief " + testText);
            log(INFO, "Alles am besten! " + testText);

            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
            }

        }
    }


}

