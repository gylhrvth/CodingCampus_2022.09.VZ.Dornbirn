package mase.week05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Birthdaydate {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        GregorianCalendar datum = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        String datebirth = userInputBirth();


        try {
            Date myDate = sdf.parse(datebirth);
            datum.setTime(myDate);


            System.out.println(datum.getTime());
        }catch (ParseException e){
            throw new RuntimeException(e);
        }

        String[] arr = {"Sonnatag","Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", };
        int wochentag = datum.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.println("Wochentag: ");
        System.out.println(arr[wochentag]);

    }
    public static String userInputBirth(){

        System.out.println("Geben Sie Ihr Geburtsdatum im Format dd.mm.yyyy an");
        String userInput = sc.nextLine();
        System.out.println(userInput);
        return userInput;
    }
}
