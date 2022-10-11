package milan.week05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateGeburtstag {
    public static void main(String[] args) {

        System.out.println("Bitte geben Sie ihr Geburtsdatum ein! (yyyy.mm.dd): ");
        String text = userInput();
        //givesBackDayV1(text);
        givesBackDayV2(text);
    }

    public static String userInput() {

        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void givesBackDayV2(String input) {
        String[] wochenTag = {"", "Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};
        GregorianCalendar clr = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

        try {
            if (input.matches("[1-9][0-9]{3}[.](0[1-9]|1[012])[.](0[1-9]|[12][0-9]|3[01])")) {
                Date birthDate = sdf.parse(input);
                clr.setTime(birthDate);
                int day = clr.get(Calendar.DAY_OF_WEEK);
                System.out.println("Ihr Geburtstag, " + sdf.format(clr.getTime()) + ", war an einem " + wochenTag[day] + "!");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }


    public static void givesBackDayV1(String input) {
        GregorianCalendar clr = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

        try {
            if (input.matches("[1-9][0-9]{3}[.](0[1-9]|1[012])[.](0[1-9]|[12][0-9]|3[01])")) {
                Date birthDate = sdf.parse(input);
                clr.setTime(birthDate);
                int day = clr.get(Calendar.DAY_OF_WEEK);
                if (day == 1) {
                    System.out.println("Ihr Geburtstag, " + sdf.format(clr.getTime()) + ", war an einem Sonntag!");
                }
                if (day == 2) {
                    System.out.println("Ihr Geburtstag, " + sdf.format(clr.getTime()) + ", war an einem Montag!");
                }
                if (day == 3) {
                    System.out.println("Ihr Geburtstag, " + sdf.format(clr.getTime()) + ", war an einem Dienstag!");
                }
                if (day == 4) {
                    System.out.println("Ihr Geburtstag, " + sdf.format(clr.getTime()) + ", war an einem Mittwoch!");
                }
                if (day == 5) {
                    System.out.println("Ihr Geburtstag, " + sdf.format(clr.getTime()) + ", war an einem Donnerstag!");
                }
                if (day == 6) {
                    System.out.println("Ihr Geburtstag, " + sdf.format(clr.getTime()) + ", war an einem Freitag!");
                }
                if (day == 7) {
                    System.out.println("Ihr Geburtstag, " + sdf.format(clr.getTime()) + ", war an einem Samstag!");
                }
            } else {
                System.out.println("Datum ist falsch formatiert");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
