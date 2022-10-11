package stefan.week05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class KalenderCountSonntag {
    public static void main(String[] args) {


        int jahr = userImput();
       int monat =userImput();
       int count = count(jahr,monat);
        System.out.println(count);
    }


    public static int count(int jahr, int monat) {
        GregorianCalendar clr = new GregorianCalendar(jahr, monat - 1, 1);
        GregorianCalendar endClr = new GregorianCalendar(jahr, monat, 1);

        int counter = 0;
        while (!clr.equals(endClr)) {
            if (clr.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                ++counter;
            }
            clr.add(Calendar.DAY_OF_MONTH, 1);
        }
        return counter;

    }

    public static int userImput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}


