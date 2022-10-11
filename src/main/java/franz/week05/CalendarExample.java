package franz.week05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarExample {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        SimpleDateFormat sdfD = new SimpleDateFormat("dd.MM.yyyy");

        //    calendertoday(today, sdfD);
        birthday(today, sdfD, sca());
    }

    public static Scanner sca() {
        Scanner sca = new Scanner(System.in);
        return sca;
    }

    public static void birthday(GregorianCalendar today, SimpleDateFormat sdfD, Scanner sca) {
        System.out.println("Enter your date of birth (dd.mm.jjjj):");
        String[] dayarr = {"" ,"So", "Mo","Di","Mi","Do","Fr","Sa"};

        String text = sca.next();

        try {
            Date myDate = sdfD.parse(String.valueOf(text));
            today.setTime(myDate);
            System.out.println(sdfD.format(today.getTime()));
            System.out.println("Day you were Born: " + dayarr[today.get(Calendar.DAY_OF_WEEK)]);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

    public static void calendertoday(GregorianCalendar today, SimpleDateFormat sdfD) {
        SimpleDateFormat sdfT = new SimpleDateFormat("HH:mm");
        SimpleDateFormat sdfDT = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        System.out.println(sdfD.format(today.getTime()));
        System.out.println(sdfT.format(today.getTime()));
        System.out.println("Datum:" + sdfD.format(today.getTime()) + " Zeit:" + sdfT.format(today.getTime()));
        System.out.println(sdfDT.format(today.getTime()));
    }
}
