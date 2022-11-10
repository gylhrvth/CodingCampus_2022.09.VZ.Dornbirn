package patric.week05;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class WieVieleSonntageHatDerMonat {
    public static void main(String[] args) {

        System.out.println(getSundays(2022, 10));
        System.out.println("------------------------------------");
        System.out.println(getSundays(2021, 9));
    }


    public static int getSundays(int year, int month) {
        GregorianCalendar startDay = new GregorianCalendar(year, month - 1, 1);
        GregorianCalendar endDay = new GregorianCalendar(year, month, 1);

        int counter = 0;
        while (!startDay.equals(endDay)) {
            if (startDay.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                ++counter;
            }
            startDay.add(Calendar.DAY_OF_MONTH, 1);
        }
        return counter;
    }
}



