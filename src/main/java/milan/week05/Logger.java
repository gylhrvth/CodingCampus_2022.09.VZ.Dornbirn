package milan.week05;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.io.PrintStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class Logger {
    public enum Severity {
        ERROR,
        WARNING,
        INFO
    }

    public static void log(Severity severity, String message) {
        String text = "";
        if (severity == Severity.ERROR) {
            text = "ERROR:";
        }
        if (severity == Severity.WARNING) {
            text = "WARNING:";
        }
        if (severity == Severity.INFO) {
            text = "INFO:";
        }
        File logFile = new File("assets\\log\\logging.txt");
        logFile.getParentFile().mkdirs();

        if (logFile.exists() && logFile.length() > 1000000) {
            File oldFile = new File(logFile.getAbsolutePath() + ".old");
            oldFile.delete();
            logFile.renameTo(oldFile);
        }
        try {
            GregorianCalendar clr = new GregorianCalendar();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd  HH:mm:ss");
            PrintStream ps = new PrintStream(new FileOutputStream(logFile, true));

            ps.println(sdf.format(clr.getTime()) + " " + text + " " + message);
            ps.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
