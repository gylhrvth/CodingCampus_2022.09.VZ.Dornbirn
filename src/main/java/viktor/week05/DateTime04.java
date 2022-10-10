package viktor.week05;

import jdk.swing.interop.SwingInterOpUtils;

import javax.sound.midi.Soundbank;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime04 {

    public static void getSundays(int year, int month){


        GregorianCalendar firstDayInMonth = new GregorianCalendar(year,month-1, 1);
        GregorianCalendar lastDayInMonth = new GregorianCalendar(year, month,1);

        SimpleDateFormat pattern = new SimpleDateFormat("yyyy.MM.dd");

         int count = 0;

         while(! firstDayInMonth.equals(lastDayInMonth) ){

             if(firstDayInMonth.get(Calendar.DAY_OF_WEEK) == 1){
                 count++;
                 System.out.println(pattern.format(firstDayInMonth.getTime()));
             }
             firstDayInMonth.add(Calendar.DAY_OF_MONTH,1);
         }
        System.out.println();
        System.out.println("Anzahl der Sonntage: " + count);
    }

    public static void main(String[] args) {

    getSundays(2022,10);






    }
}
