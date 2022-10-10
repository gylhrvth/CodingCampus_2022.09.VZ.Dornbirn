package fatima.week05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GetDateOfNextSunday {
    public static void main(String[] args) {
        System.out.println("Date of next sunday:");
        GregorianCalendar today = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        today.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        System.out.println(sdf.format(today.getTime()));
    }
}
