package michel.week05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class HowManySundaysHaveTheActualMonth {
    public static void main(String[] args) {
        int countSundays = getSundays(2022, 10);
        System.out.println("Der angegebene Monat hat " + countSundays + " Sonntage!");
    }

    private static int getSundays(int year, int month) {
        GregorianCalendar startDay = new GregorianCalendar(year, month - 1, 1);
        GregorianCalendar endDay = new GregorianCalendar(year, month, 1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.");
        int counter = 0;

        while (!startDay.equals(endDay)) {
            if (startDay.get(Calendar.DAY_OF_WEEK) == 1) {
                counter++;
                System.out.println(startDay.getTime());
            }
            startDay.add(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        }
        System.out.println();


        return counter;
    }


}
