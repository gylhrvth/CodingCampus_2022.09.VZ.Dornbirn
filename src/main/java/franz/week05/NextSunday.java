package franz.week05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class NextSunday {

    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        SimpleDateFormat sdfD = new SimpleDateFormat("dd.MM.yyyy");
        today.set(Calendar.DAY_OF_WEEK,1);
        System.out.println(sdfD.format(today.getTime()));
    }
}