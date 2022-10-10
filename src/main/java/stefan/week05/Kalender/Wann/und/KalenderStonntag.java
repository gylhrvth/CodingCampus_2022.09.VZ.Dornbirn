package stefan.week05.Kalender.Wann.und;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class KalenderStonntag {

    public static void main(String[] args) {

        GregorianCalendar cl = new GregorianCalendar();
        SimpleDateFormat day = new SimpleDateFormat("yyyy.MM.dd");
         String time = "2022.10.10";


        try {
            String[] dayNames = {"", "Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};

            Date myDate = day.parse(time);
            cl.setTime(myDate);
            System.out.println(dayNames[cl.get(cl.DAY_OF_WEEK)]);
            System.out.println(day.format(cl.getTime()));
            cl.add(Calendar.DAY_OF_MONTH,1);
            System.out.println(dayNames[cl.get(cl.DAY_OF_WEEK)]);
            System.out.println(day.format(cl.getTime()));
        } catch (ParseException e) {
            throw new RuntimeException(e);

        }
    }
}
