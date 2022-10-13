package martin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MWerkzeuge {
    public static String readUserInputString(String aufforderung) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s", aufforderung);
        return sc.nextLine();
    }

    public static void head(String symbol, String aufgabenTitel) {
        System.out.println(symbol.repeat(4 + aufgabenTitel.length()));
        System.out.println(symbol + " " + aufgabenTitel + " " + symbol);
        System.out.println(symbol.repeat(4 + aufgabenTitel.length()) + "\n");
    }

    /**
     * Creates and writes a Log file that should be used in tandem with the code.
     * Prefix determines output Warning. Numerically named.
     * i.e. Error = 1; Warning = 2; Info = 3;
     * Smaller and bigger Values cause it to void and do nothing, expect waste time.
     */
    public static void Log(int PrefixErrWarnInfo, String message) {
        File directory = new File("assets/tmp/logMW.txt");
        try {
            if (!directory.exists()) directory.getParentFile().mkdirs();
            if (directory.exists() && directory.length() > 1000000) {
                File oldFile = new File(directory.getAbsoluteFile() + ".old");
                oldFile.delete();
                directory.renameTo(oldFile);
            }
            PrintStream ps = new PrintStream(new FileOutputStream(directory, true));
            if (PrefixErrWarnInfo < 0 || PrefixErrWarnInfo > 3) PrefixErrWarnInfo = 0;
            String[] severityOfLog = new String[]{"", " ERROR:   ", " WARNING: ", " INFO:    "};
            if (PrefixErrWarnInfo > 0) {
                ps.append(getDateAndTimeString()).append(severityOfLog[PrefixErrWarnInfo]).append(message).append("\n");
                ps.flush();
            }
            ps.close();
        } catch (IOException ioe) {
        }
    }

    public static String getDateAndTimeString() {
        SimpleDateFormat datumUndUhrzeitForm = new SimpleDateFormat("yyyy.MM.dd HH:mm");
        return datumUndUhrzeitForm.format(new Date());
    }


}
