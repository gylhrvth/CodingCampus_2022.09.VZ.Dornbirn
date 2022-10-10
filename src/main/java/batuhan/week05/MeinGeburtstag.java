package batuhan.week05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MeinGeburtstag {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hallo wann hast du Geburtstag? ");
        String input = sc.nextLine();






        SimpleDateFormat pattern = new SimpleDateFormat("dd.MM.yyyy");


        try {
            Date dateFromUser = pattern.parse(input);
            GregorianCalendar birthDay = new GregorianCalendar();
            birthDay.setTime(dateFromUser);
            whatforaDay(birthDay);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }

    public static void whatforaDay(GregorianCalendar birthDay) {
        String[] daynames = {"", "Sonntag","Montag","Dienstag","Mittwoch","Donnerstag","Freitag","Samstag"};

        int weekDay = birthDay.get(Calendar.DAY_OF_WEEK);
        System.out.println("Der Wochentag deines Geburtstags war " + daynames[weekDay]);
    }


}


