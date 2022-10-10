package michel.week05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DayOfBirthday {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

        String birthdayDate = userInputBrithday();
        try {
            Date myDate = sdf.parse(birthdayDate);
            date.setTime(myDate);
            System.out.println(sdf.format(date.getTime()));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println(birthdayDate);
    }

    public static String userInputBrithday() {
        System.out.println("Bitte gib dein Gebrutsdatum im Format yyyy.MM.dd ein:");
        String userInput = sc.nextLine();
        return userInput;
    }
}
