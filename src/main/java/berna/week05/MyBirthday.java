package berna.week05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Calendar;

public class MyBirthday {
    public static void main(String[] args) {
        // exercise: ask user for birthday and return the day of the week
        System.out.println("\n");

        //ask user birthday
        Date userBirthday = askBirthday();
        // find out what weekday it was
        String weekday = getWeekday(userBirthday);

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Your birthday is:  " + sdf.format(userBirthday));
        System.out.println("So you were born on a " + weekday);


    }


    public static Date askBirthday() {


        //i want a specific format! try to use regex
        //Pattern pBirthday = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[.]1[1]|2[0-2][.][0-9]{4}");
        Pattern pBirthday = Pattern.compile("([0|1]{1}[0-9]{1}[.]" +
                //TODO month : "[0|1]{1}[0-]{1}" +
                "[.][0-9]{4})");

        // initiate Date bday
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date bday = berna.week05.DateOfToday.createDateOfToday();

        //ask user birthday
        System.out.println("What is your birthday? Please use format dd.mm.yyyy! ");
        Scanner sc = new Scanner(System.in);

        boolean formatOK = false;

        while (!formatOK) {
            try {
                String birthdayString = sc.nextLine();
                Matcher mBirthday = pBirthday.matcher(birthdayString);

                if (!mBirthday.matches()) {
                    System.out.println("bool = " + formatOK);
                    System.out.println("This is the false format! Please use format dd.mm.yyyy!");
                    formatOK = false;
                } else {
                    bday = sdf.parse(birthdayString);
                    formatOK = true;
                }
            } catch (ParseException pe) {
                System.out.println("Parse war nicht erfolgreich");
            }
        }
        return bday;
    }


    public static String getWeekday(Date inputDate) {
        //take Date and check the weekday of this date
        Calendar cal = Calendar.getInstance();
        cal.setTime(inputDate);

        int wd = cal.get(Calendar.DAY_OF_WEEK);

        String [] days = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};

        String weekday = days[wd];

        return weekday;
    }
}
