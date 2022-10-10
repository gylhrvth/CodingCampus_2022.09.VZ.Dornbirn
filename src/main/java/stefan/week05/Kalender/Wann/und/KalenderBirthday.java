package stefan.week05.Kalender.Wann.und;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.time.DayOfWeek;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class KalenderBirthday {
    public static void main(String[] args) {


        String text = userImput();

        birthday(text);

    }

    public static void birthday(String imput) {
        GregorianCalendar cl = new GregorianCalendar();
        SimpleDateFormat day = new SimpleDateFormat("yyyy.MM.dd");
        try {
            String[] dayNames = {"", "Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};

            Date myDate = day.parse(imput);
            cl.setTime(myDate);
            System.out.println(dayNames[cl.get(cl.DAY_OF_WEEK)]);
        } catch (ParseException e) {
            throw new RuntimeException(e);

        }


    }


    public static String userImput() {
        System.out.println("Geben sie ein Gerburstag ein YYYY:MM:DD");
        Scanner imput = new Scanner(System.in);
        return imput.nextLine();
    }
}
