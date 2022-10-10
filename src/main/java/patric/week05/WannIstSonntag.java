package patric.week05;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class WannIstSonntag {
    public static void main(String[] argv) {

//Get calendar set to current date and time
        Calendar c = GregorianCalendar.getInstance();
//Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
//Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String endDate = "";

        c.add(Calendar.DATE, 6);
        endDate = df.format(c.getTime());

        System.out.println("NextSunnday " + endDate);
    }
}
