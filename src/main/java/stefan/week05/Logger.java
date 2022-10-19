package stefan.week05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Logger {
    public  static int Error=1;
    public static int Warning =2;
    public static int Info=3;

    public static void  main(String[] args) {

    }

    public static void log(int severity,String message) {
        GregorianCalendar cl =new  GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        File f = new File("assets/stefan/week05/helloWorld5.text");

        if (f.exists() && f.length()> 1000000) {
          File oldFile =new File(f.getAbsolutePath()+("old"));
          oldFile.delete();
          f.renameTo(oldFile);


        }
        try {

            PrintStream ps = new PrintStream(new FileOutputStream(f, true));
            ps.println(sdf.format(cl.getTime())+" "+severity+" "+message);
            ps.close();


        } catch (IOException ioe) {
            System.out.println("");
            ioe.printStackTrace();
        }
    }
}