package michel.week05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Calendar;

public class DayOfBirthday {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
//        System.out.println(date.get(Calendar.DAY_OF_WEEK));
//        date.set(Calendar.DAY_OF_WEEK,1);

        String birthdayDate = userInputBrithday();
        try {
            Date myDate = sdf.parse(birthdayDate);
            date.setTime(myDate);
//            System.out.println(sdf.format(date.getTime()));
            System.out.print("Wochentag: ");
            System.out.print(date.get(Calendar.DAY_OF_WEEK) + " - ");
            System.out.println(date.getTime());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static String userInputBrithday() {
        System.out.println("Bitte gib dein Gebrutsdatum im Format yyyy.MM.dd ein:");
        String userInput = sc.nextLine();
        return userInput;
    }
}
