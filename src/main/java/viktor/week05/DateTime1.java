package viktor.week05;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class DateTime1 {

    public static void main(String[] args) {

        GregorianCalendar today = new GregorianCalendar();
        SimpleDateFormat pattern1 = new SimpleDateFormat("yyyy.MM.dd");
        SimpleDateFormat pattern2= new SimpleDateFormat("HH:mm");
        SimpleDateFormat pattern3= new SimpleDateFormat("yyyy.MM.dd. HH:mm");

        System.out.println("Nur Datum: " + pattern1.format(today.getTime()));
        System.out.println("Nur Uhrzeit: " + pattern2.format(today.getTime()));
        System.out.println("Datum mit Uhrzeit: " + pattern3.format(today.getTime()));


    }
}
