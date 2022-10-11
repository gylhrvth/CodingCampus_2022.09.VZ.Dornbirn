package milan.week05;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateSonntageMonat {

    public static void main(String[] args) {

//        GregorianCalendar clr = new GregorianCalendar();
//        int year = clr.get(Calendar.YEAR);
//        int month = clr.get(Calendar.MONTH);
        int year = 2022;
        int month = 10;
        System.out.println(year + " " + month);
        int anzahl = countSundays(year,month);
        //System.out.println(countSundays(year, month));
        System.out.println(anzahl);

    }

    public static int countSundays(int jahr, int monat) {
        GregorianCalendar clr = new GregorianCalendar(jahr, monat - 1, 1);
        int lastDay = clr.getActualMaximum(Calendar.DAY_OF_MONTH);

        int counter = 0;
        for (int i = 1; i <= lastDay ; i++) {
            clr.set(Calendar.DAY_OF_MONTH, i);
            if (clr.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                ++counter;
            }
        }
        return counter;

    }
    public static int countSundays2(int jahr, int monat) {
        GregorianCalendar clr = new GregorianCalendar(jahr, monat - 1, 1);
        GregorianCalendar endClr = new GregorianCalendar(jahr, monat, 1);

        int counter = 0;
        while (!clr.equals(endClr)){
            if (clr.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                ++counter;
            }
            clr.add(Calendar.DAY_OF_MONTH, 1);
        }
        return counter;

    }
}

