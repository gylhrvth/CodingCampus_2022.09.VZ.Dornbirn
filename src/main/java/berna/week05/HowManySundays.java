package berna.week05;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class HowManySundays {
    //Exercise: System.out.println(getSundays(2021, 10));

    public static void main(String[] args) {
        int count = getSundays(2021, 10);
        System.out.println(count);
    }

    public static int getSundays(int year, int month) {

        GregorianCalendar today = new GregorianCalendar();

        today.set(year, month, 1);
        int wd = today.get(Calendar.DAY_OF_WEEK);
        int dayOfMonth = 0;
        int count = 0;
        int lastDayOfMonth = today.getActualMaximum(Calendar.DAY_OF_MONTH);

        while (dayOfMonth != lastDayOfMonth) {

            dayOfMonth = dayOfMonth + 1;

            if (wd == 1) {
                count++;
                today.add(Calendar.DAY_OF_WEEK, 6);
                return count;

            } else {
                while (wd != 1) {
                    today.add(Calendar.DAY_OF_WEEK, 1);
                    wd = today.get(Calendar.DAY_OF_WEEK);
                }
            }
        }


        return count;
    }
}
