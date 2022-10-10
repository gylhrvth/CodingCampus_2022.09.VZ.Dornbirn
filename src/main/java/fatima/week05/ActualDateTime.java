package fatima.week05;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class ActualDateTime {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();

        SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd");
        System.out.println(date.format(today.getTime()));

        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
        System.out.println(time.format(today.getTime()));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd, HH:mm:ss");
        System.out.println(sdf.format(today.getTime()));
    }
}
