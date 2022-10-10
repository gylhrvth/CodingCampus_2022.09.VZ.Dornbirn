package gyula.week05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTimeExample {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        System.out.println(today.get(Calendar.DAY_OF_WEEK));
        today.set(Calendar.DAY_OF_MONTH, 1);
        today.add(Calendar.DAY_OF_MONTH, -1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd. HH:mm");
        System.out.println(sdf.format(today.getTime()));


        String text = "2022.01.01. 10:15";
        try {
            Date myDate = sdf.parse(text);
            today.setTime(myDate);
            System.out.println(sdf.format(today.getTime()));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
