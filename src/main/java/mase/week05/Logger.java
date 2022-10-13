package mase.week05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Logger {
    public static int ERROR = 1;
    public static int WARNING = 2;
    public static int INFO = 3;
    public static void main(String[] args) {

    }
    public static void log(int severity, String message){
        GregorianCalendar calendar = new GregorianCalendar();
        SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat time = new SimpleDateFormat("HH.mm:ss");

        try {
            File f = new File("assets/tmp/loggFile.txt");
            f.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f, true));
            ps.print(date.format(calendar.getTime()) +  time.format(calendar.getTime()));
            if (severity == ERROR){
                ps.println("ERROR404: ");
            }else if(severity == WARNING){
                ps.println("WARNING: ");
            }else if(severity == INFO){
                ps.println("INFO: ");
            }
            ps.println(message);
            ps.close();
        }catch (IOException ioe){
            System.out.println("Ich kann nicht schreiben");
            ioe.printStackTrace();
        }
    }
}
