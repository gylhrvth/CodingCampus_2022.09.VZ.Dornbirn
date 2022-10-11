package batuhan.week05;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GetWorkDays {


    public static void main(String[] args) {
        System.out.println(getSundays(2021, 9));
        System.out.println();
        System.out.println(getSundays(2022,10));
    }

    public static int getSundays(int year, int month) {
        GregorianCalendar startday = new GregorianCalendar(year, month - 1, 1);
        GregorianCalendar endday = new GregorianCalendar(year, month , 1);
        int counter = 0;
        while (!startday.equals(endday)) {
            if (startday.get(Calendar.DAY_OF_WEEK) == 2 ) {

                counter++;
                System.out.println(startday.getTime());
            }
            startday.add(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);


        }

        return counter;


    }

}




