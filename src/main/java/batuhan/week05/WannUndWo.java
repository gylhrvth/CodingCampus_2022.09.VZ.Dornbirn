package batuhan.week05;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class WannUndWo {


    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.");
        SimpleDateFormat time = new SimpleDateFormat("HH:mm");
        System.out.println(sdf.format(today.getTime()));
        System.out.println(time.format(today.getTime()));
        System.out.println(today.getTime());

    }



}
