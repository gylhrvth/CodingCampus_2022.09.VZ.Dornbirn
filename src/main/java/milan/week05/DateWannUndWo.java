package milan.week05;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class DateWannUndWo {
    public static void main(String[] args) {

        GregorianCalendar today = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss\nEEE, MMM d, yyyy h:mm\nyyyy.MMMMM.dd hh:mm");
        System.out.println(sdf.format(today.getTime()));

    }
}
