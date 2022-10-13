package viktor.week05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Logging {

    public static int ERROR = 1;
    public static int WARNING = 2;
    public static int INFO = 3;


    public static void log (int severity, String message ){

        GregorianCalendar kal = new GregorianCalendar();
        SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd");
        SimpleDateFormat time = new SimpleDateFormat("HH.mm.ss");

        File myFile = new File("assets/tmp/output.txt");
        myFile.getParentFile().mkdirs();


        try {

            PrintStream ps = new PrintStream(new FileOutputStream(myFile, true));

            ps.print(date.format(kal.getTime()) + " " + time.format(kal.getTime()) + " ");

                switch (severity) {
                    case 1:
                        ps.print("ERROR: ");
                        break;

                    case 2:
                        ps.print("WARNING: ");
                        break;

                    case 3:
                        ps.print("INFO: ");
                        break;
                }


            ps.println(message);
            ps.close();

        }catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }


    public static void main(String[] args) {





    }
}
