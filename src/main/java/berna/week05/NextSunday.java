package berna.week05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import berna.week05.DateOfToday;

public class NextSunday {
    public static void main(String[] args) {
        //exercise: what´s the date of next sunday?

        System.out.println("Next sunday: " + findDateOfNextSunday());

    }

    public static String findDateOfNextSunday() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        GregorianCalendar today = new GregorianCalendar();
        int wd = today.get(Calendar.DAY_OF_WEEK);

        if (wd == 1) {
            today.add(Calendar.DAY_OF_WEEK, 6);
            System.out.println(sdf.format("Next sunday is " + today.getTime()));
            String nextSunday = sdf.format(today.getTime());
            return nextSunday;

        } else {
            while (wd != 1) {
                today.add(Calendar.DAY_OF_WEEK, 1);
                wd = today.get(Calendar.DAY_OF_WEEK);
            }
            String nextSunday = sdf.format(today.getTime());
            return nextSunday;
        }

    }

}
