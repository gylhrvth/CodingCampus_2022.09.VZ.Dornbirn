package gyula.week05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Sunday {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        cal.set(Calendar.DAY_OF_WEEK, 1);
        System.out.println(sdf.format(cal.getTime()));
    }

}
