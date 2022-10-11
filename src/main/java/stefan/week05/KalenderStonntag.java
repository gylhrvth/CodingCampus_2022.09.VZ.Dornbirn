package stefan.week05;


import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.util.GregorianCalendar;

public class KalenderStonntag {

    public static void main(String[] args) {

        GregorianCalendar cl = new GregorianCalendar();
        SimpleDateFormat form = new SimpleDateFormat("yyyy.MM.dd HH:mm EEEEE");

        System.out.println(form.format(cl.getTime()));
        cl.set(Calendar.DAY_OF_WEEK, 1);
        System.out.println(form.format(cl.getTime()));


    }
}
