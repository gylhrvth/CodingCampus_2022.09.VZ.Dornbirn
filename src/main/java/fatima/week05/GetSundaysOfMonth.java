package fatima.week05;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GetSundaysOfMonth {
    public static void main(String[] args) {
        System.out.println(getSundays(2022, 5));
    }


    public static int getSundays(int year, int month) {
        GregorianCalendar startDay = new GregorianCalendar(year, month - 1, 1);
        int lastDayOfMonth = startDay.getActualMaximum(Calendar.DAY_OF_MONTH);

        int count = 0;
        for (int i = 1; i <= lastDayOfMonth; i++) {
            startDay.set(Calendar.DAY_OF_MONTH, i);
            if (startDay.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                // System.out.println(startDay.getTime());
                ++count;
            }
        }
        return count;
    }

    public static int getSundays2(int year, int month) {
        GregorianCalendar startDay = new GregorianCalendar(year, month - 1, 1);
        GregorianCalendar endDay = new GregorianCalendar(year, month, 1);
        int count = 0;
        while (!startDay.equals(endDay)) {
            if (startDay.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                //System.out.println(startDay.getTime());
                ++count;
            }
            startDay.add(Calendar.DAY_OF_MONTH, 1);
        }
        return count;
    }
}
