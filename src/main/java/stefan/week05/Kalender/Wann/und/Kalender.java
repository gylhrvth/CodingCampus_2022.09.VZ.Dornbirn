package stefan.week05.Kalender.Wann.und;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kalender {

    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        SimpleDateFormat tag = new SimpleDateFormat("yyyy.MM.dd");
        System.out.println(tag.format(today.getTime()));
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
        System.out.println(time.format(today.getTime()));
       SimpleDateFormat todayTime = new SimpleDateFormat("HH:mm:ss/yyyy.MM.dd");
        Calendar cal = Calendar.getInstance();
       System.out.println(todayTime.format(cal.getTime()));
        System.out.println(today.getTime());

    }
}
