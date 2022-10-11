package viktor.week05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateTime03 {



    public static void main(String[] args) {


        GregorianCalendar today = new GregorianCalendar();
        today.add(Calendar.DAY_OF_WEEK,10);

        SimpleDateFormat pattern = new SimpleDateFormat("yyyy.MM.dd");

        int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of week: " + dayOfWeek);

        while (today.get(Calendar.DAY_OF_WEEK) != 1){
            today.add(Calendar.DAY_OF_WEEK, 1);
        }
        System.out.println(pattern.format(today.getTime()));

/*
            if (dayOfWeek == 1){
                today.add(Calendar.DAY_OF_WEEK,7);
                System.out.println(pattern.format(today.getTime()));

            } else if (dayOfWeek == 2){
                today.add(Calendar.DAY_OF_WEEK,6);
                System.out.println(pattern.format(today.getTime()));

            } else if (dayOfWeek == 3){
                today.add(Calendar.DAY_OF_WEEK,5);
                System.out.println(pattern.format(today.getTime()));

            } else if (dayOfWeek == 4 ){
                today.add(Calendar.DAY_OF_WEEK,4);
                System.out.println(pattern.format(today.getTime()));

            } else if (dayOfWeek == 5) {
                today.add(Calendar.DAY_OF_WEEK,3);
                System.out.println(pattern.format(today.getTime()));

            } else if (dayOfWeek == 6)  {
                today.add(Calendar.DAY_OF_WEEK,2);
                System.out.println(pattern.format(today.getTime()));

            } else if (dayOfWeek == 7){
                today.add(Calendar.DAY_OF_WEEK,1);
                System.out.println(pattern.format(today.getTime()));

            }
*/











    }
}
