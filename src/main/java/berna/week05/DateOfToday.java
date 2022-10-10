package berna.week05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateOfToday {
    public static void main(String[] args) {

        Date today = createDateOfToday();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        System.out.println("Date only: " + sdf.format(today));
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
        System.out.println("Time only:  " + sdf2.format(today));
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy.MM.dd HH:mm");
        System.out.println("Date and time: " + sdf3.format(today));

    }

    public static Date createDateOfToday() {
        GregorianCalendar today = new GregorianCalendar();
        //System.out.println("gregor: " + today);
        //gregor: java.util.GregorianCalendar[time=1665388240419,areFieldsSet=true,areAllFieldsSet.....]
        Date dateToday = today.getTime();
        //System.out.println("date Gregor:  " +dateToday);
        //date Gregor:  Mon Oct 10 09:50:40 CEST 2022

        return dateToday;
    }

}
