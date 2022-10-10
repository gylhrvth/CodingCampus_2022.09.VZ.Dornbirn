package milan.week05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateSonntag {
    public static void main(String[] args) {

        int [] zahlen = {0,7,6,5,4,3,2,1};
        GregorianCalendar clr = new GregorianCalendar();
        int count = clr.get(Calendar.DAY_OF_WEEK);
        clr.add(Calendar.DAY_OF_WEEK,zahlen[count]);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.");
        System.out.println("Der nächste Sonntag ist am: " + sdf.format(clr.getTime()));
    }
}
