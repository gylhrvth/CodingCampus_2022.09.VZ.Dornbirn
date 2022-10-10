package michel.week05;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class FindSunday {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();

        today.set(Calendar.DAY_OF_WEEK, 1);
        System.out.println(today.getTime());
    }
