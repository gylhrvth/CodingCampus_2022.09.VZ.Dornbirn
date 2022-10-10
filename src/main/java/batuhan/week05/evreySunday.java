package batuhan.week05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class evreySunday {


    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        today.set(Calendar.DAY_OF_WEEK,1);



        System.out.println(sdf.format(today.getTime()));

    }

}

