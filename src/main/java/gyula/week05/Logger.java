package gyula.week05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    public static int ERROR = 1;
    public static int WARNING = 2;
    public static int INFO = 3;

    public static void log(int severity, String message){
        File logFile = new File("assets/log/logging.txt");
        logFile.getParentFile().mkdirs();

        if (logFile.exists() && logFile.length() > 1000000){
            File oldFile = new File(logFile.getAbsolutePath() + ".old");
            oldFile.delete();
            logFile.renameTo(oldFile);
        }

        try {
            PrintStream ps = new PrintStream(new FileOutputStream(logFile, true));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");

            String severityText = "";
            if (severity == ERROR) severityText = "ERROR";
            else if (severity == WARNING) severityText = "WARNING";
            else if (severity == INFO) severityText = "INFO";
            else severityText = "UNKNOWN("+severity+")";

            ps.printf("%s %s: %s\n",
                    sdf.format(new Date()),
                    severityText,
                    message
            );
            ps.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }


    public static void main(String[] args) {
        String testText = "Apfelsaftgenerator ".repeat(500);

        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
            log(ERROR, "Alles ist schief " + testText);
            log(WARNING, "Ein bischen schief " + testText);
            log(INFO, "Alles am besten! " + testText);

            try { Thread.sleep(500); } catch (InterruptedException ie) {}
        }
    }
}
