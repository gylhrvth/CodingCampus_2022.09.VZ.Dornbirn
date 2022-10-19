package mase.week05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class HowManySundays {
    public static void main(String[] args) {

//
        System.out.println(sunday(2022,10));
    }

    public static int sunday(int year, int month) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_WEEK, 1);
        int sundaycount = 0;
return sundaycount;
            }

        }





