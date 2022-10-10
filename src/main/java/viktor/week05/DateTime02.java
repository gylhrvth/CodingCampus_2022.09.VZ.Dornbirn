package viktor.week05;

import jdk.swing.interop.SwingInterOpUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateTime02 {

    public static void main(String[] args) {

        GregorianCalendar today = new GregorianCalendar();

        Scanner sc = new Scanner(System.in);
        System.out.println("Gib mir bitte deinen Geburtstag an!");
        String input = sc.nextLine();

        SimpleDateFormat pattern = new SimpleDateFormat("yyyy.MM.dd");

        try{
             Date dateFromUser = pattern.parse(input);
             today.setTime(dateFromUser);

            System.out.println("Wochentag war: " + today.get(Calendar.DAY_OF_WEEK));



        }catch(ParseException e){
            throw new RuntimeException(e);

        }


    }
}
