package michel.week05;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GregorianCalendar {
    public static void main(String[] args) {
    java.util.GregorianCalendar today = new java.util.GregorianCalendar();
        System.out.println(today.get(Calendar.DAY_OF_WEEK));
//        today.set(Calendar.DAY_OF_MONTH, 1);
//        today.add(Calendar.DAY_OF_MONTH, -1);
        SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd");
        System.out.print("Aktuelles Datum: ");
        System.out.println(date.format(today.getTime()));

        SimpleDateFormat time = new SimpleDateFormat("HH:mm");
        System.out.print("Aktuelle Uhrzeit: ");
        System.out.println(time.format(today.getTime()));

        SimpleDateFormat dateTime = new SimpleDateFormat("yyyy.MM.dd HH:mm");
        System.out.print("Aktuelles Datum und Uhrzeit: ");
        System.out.println(dateTime.format(today.getTime()));

    }
}
