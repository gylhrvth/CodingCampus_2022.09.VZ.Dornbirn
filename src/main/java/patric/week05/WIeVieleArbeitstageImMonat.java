package patric.week05;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class WIeVieleArbeitstageImMonat {
    public static void main(String[] args) {
        System.out.println(getWorkdays(2021, 6));
        System.out.println("------------------------------------");
        System.out.println(getWorkdays(2021, 3));
        System.out.println("------------------------------------");
        System.out.println(getWorkdays(2021, 2));

    }


    public static int getWorkdays(int year, int month) {

        GregorianCalendar startDay = new GregorianCalendar(year, month - 1, 1);
        GregorianCalendar endDay = new GregorianCalendar(year, month, 1);

        int counter = 0;
        while (!startDay.equals(endDay)) {
            if (startDay.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && startDay.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY){
                //System.out.println(startDay.getTime());
                ++counter ;
            }
            startDay.add(Calendar.DAY_OF_MONTH, 1);
        }
        return counter;
    }

}

