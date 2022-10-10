package mase.week05;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;

public class Datum {
    public static void main(String[] args) {

        GregorianCalendar today = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(sdf.format(today.getTime()));
        SimpleDateFormat hour = new SimpleDateFormat("HH.mm");
        System.out.println("Hour Of the Day: " + hour.format(today.getTime()));
        SimpleDateFormat date = new SimpleDateFormat("MM.dd.yyyy. HH.mm");
        System.out.println("The date is: " + date.format((today.getTime())));


    }
}
