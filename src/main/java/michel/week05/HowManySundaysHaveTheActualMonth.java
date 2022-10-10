package michel.week05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class HowManySundaysHaveTheActualMonth {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM");
        System.out.println(sdf.format(today.getTime()));
        getSundays(2022,10);
    }

    private static void getSundays(int year, int month) {


    }


}
