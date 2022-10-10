package fatima.week05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateExampleWithParse {
    public static void main(String[] args) {
        String text = getUserInput();
        printWeekday(text);
    }

    public static String getUserInput() {
        System.out.println("Enter your date of birth (yyyy.MM.dd) to find out what day of the week you were born.");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void printWeekday(String userInput) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        try {
            Date myDate = sdf.parse(userInput);
            GregorianCalendar birthday = new GregorianCalendar();
            birthday.setTime(myDate);
            String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
            System.out.println("You were born on " + days[birthday.get(Calendar.DAY_OF_WEEK) - 1] + ".");

            SimpleDateFormat dayName = new SimpleDateFormat("EEEEE", Locale.forLanguageTag("tr-TR"));
            System.out.println(dayName.format(birthday.getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
