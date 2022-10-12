package martin.week05;

import martin.MWerkzeuge;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CalendarPractice {
    public static void main(String[] args) {
        MWerkzeuge.head("#", "Wann und wo?");
        printDate();

        MWerkzeuge.head("#", "Mein Geburtstag");
        //printBirthdayDay(readUserInputDate("Gibt bitte deinen Geburtstag nach folgendem Format an.", "yyyy.MM.dd"));

        MWerkzeuge.head("#", "Wann ist Sonntag?");
        printNextSunday();

        MWerkzeuge.head("#", "Wieviele Sonntage hat der Monat?");
        System.out.println("Der Oktober   2021 hatte " + getSundays(2021, 10) + " Sonntage.");
        System.out.println("Der September 2021 hatte " + getSundays(2021, 9) + " Sonntage.\n");

        MWerkzeuge.head("#", "Wieviele Arbeitstage?");
        System.out.println("Der Juni    2021 hat " + getWorkdays(2021, 6) + " Arbeitstage.");
        System.out.println("Der März    2021 hat " + getWorkdays(2021, 3) + " Arbeitstage.");
        System.out.println("Der Februar 2021 hat " + getWorkdays(2021, 2) + " Arbeitstage.\n");


        MWerkzeuge.head("#", "Kalender");
        printCalender();

    }

    public static void printDate() {
        Date Datum = new Date();
        SimpleDateFormat datumForm = new SimpleDateFormat("yyyy.MM.dd");
        SimpleDateFormat uhrzeitForm = new SimpleDateFormat("HH:mm");
        SimpleDateFormat datumUndUhrzeitForm = new SimpleDateFormat("yyyy.MM.dd HH:mm");
        System.out.printf("%s%n%s%n%s%n%n", datumForm.format(Datum), uhrzeitForm.format(Datum), datumUndUhrzeitForm.format(Datum));
    }

    public static Date readUserInputDate(String aufforderung, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date datumErfasst;
        String datumsEingabe = MWerkzeuge.readUserInputString(String.format(aufforderung + " " + format + "\n"));
        try {
            datumErfasst = sdf.parse(datumsEingabe);
        } catch (ParseException pe) {
            throw new RuntimeException(pe);
        }
        return datumErfasst;
    }

    public static void printBirthdayDay(Date geburtstag) {
        GregorianCalendar tagDesGeb = new GregorianCalendar();
        String[] wochentag = {"Häh?", "Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};
        tagDesGeb.setTime(geburtstag);
        System.out.println("Das war ein " + wochentag[tagDesGeb.get(Calendar.DAY_OF_WEEK)] + ".\n");
    }


    public static void printNextSunday() {
        GregorianCalendar today = new GregorianCalendar();
        SimpleDateFormat sdk = new SimpleDateFormat("dd.MM.yyyy");
        today.setTime(new Date());
        if (today.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            System.out.print("Heute ist Sonntag. ");
            today.add(Calendar.DAY_OF_WEEK, 1);
        }
        today.set(Calendar.DAY_OF_WEEK, 1);
        System.out.print("Der nächste Sonntag ist am " + sdk.format(today.getTime()) + "\n\n");
    }

    public static int getSundays(int year, int month) {
        GregorianCalendar abfrageMonat = new GregorianCalendar(year, month - 1, 1);
        GregorianCalendar naechsterMonat = new GregorianCalendar(year, month, 1);
        int sonntage = 0;
        while (!abfrageMonat.equals(naechsterMonat)) {
            if (abfrageMonat.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                sonntage += 1;
            }
            abfrageMonat.add(Calendar.DAY_OF_MONTH, 1);
        }
        return sonntage;
    }

    public static int getWorkdays(int year, int month) {
        GregorianCalendar abfrageMonat = new GregorianCalendar(year, month - 1, 1);
        GregorianCalendar naechsterMonat = new GregorianCalendar(year, month, 1);
        int arbeitsTage = 0;
        while (!abfrageMonat.equals(naechsterMonat)) {
            if (abfrageMonat.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && abfrageMonat.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                arbeitsTage += 1;
            }
            abfrageMonat.add(Calendar.DAY_OF_MONTH, 1);
        }
        return arbeitsTage;
    }

    public static void printCalender() {
        GregorianCalendar heute = new GregorianCalendar();
        Date Datum = new Date();
        heute.setTime(Datum);
        GregorianCalendar naechsterMonat = new GregorianCalendar(heute.get(Calendar.YEAR),heute.get(Calendar.MONTH)+1,heute.get(Calendar.DAY_OF_MONTH));
        int tag = heute.get(Calendar.DAY_OF_MONTH);
        String calendarFormat = "\u001b[7;7m" + "| %2s | %2s | %2s | %2s | %2s | %2s | %2s |" + "\u001b[0m\n";
        System.out.print("\u001b[1;7m " + heute.get(Calendar.YEAR) + " " + (heute.get(Calendar.MONTH) < 10 ? "0" + heute.get(Calendar.MONTH) : heute.get(Calendar.MONTH)) + " \u001b[0m\n");
        System.out.printf("\u001b[4m" + String.format(calendarFormat, "Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"));
        String[] firstWeek = new String[7];
        int firstWeekday = heute.getFirstDayOfWeek();
        for (int i = 0; i < firstWeek.length; i++) {
            String char1 = (i < 1 ? "" : String.valueOf(i));
            firstWeek[i] = char1;
        }
        System.out.printf(calendarFormat, firstWeek[0], firstWeek[1], firstWeek[2], firstWeek[3], firstWeek[4], firstWeek[5], firstWeek[6]);
        for (int i = 0; i < 2; i++) {
            System.out.printf(calendarFormat, tag, tag - 1, tag - 2, tag - 3, tag - 4, tag - 5, tag - 6);
        }
        System.out.printf(calendarFormat, tag, tag - 1, tag - 2, tag - 3, tag - 4, tag - 5, tag - 6);
    }
}
