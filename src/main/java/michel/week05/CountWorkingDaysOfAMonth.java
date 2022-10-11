package michel.week05;

import michel.week02.UserInputs;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CountWorkingDaysOfAMonth {
    public static void main(String[] args) {
        System.out.print("Geben Sie das Jahr an: ");
        int year = UserInputs.userInputIntegerRange(0, 2999);
        System.out.print("Geben Sie das Jahr an: ");
        int month = UserInputs.userInputIntegerRange(1, 12);
        System.out.println("In diesem Monat musst du: " + getWorkdays(year, month) + " Tage ackern!");
    }

    private static int getWorkdays(int year, int month) {
        GregorianCalendar startDate = new GregorianCalendar(year, month - 1, 1);
        GregorianCalendar endDate = new GregorianCalendar(year, month, 1);

        int count = 0;

        while (!startDate.equals(endDate)) {
            if (startDate.get(Calendar.DAY_OF_WEEK) == 2
                    || startDate.get(Calendar.DAY_OF_WEEK) == 3
                    || startDate.get(Calendar.DAY_OF_WEEK) == 4
                    || startDate.get(Calendar.DAY_OF_WEEK) == 5
                    || startDate.get(Calendar.DAY_OF_WEEK) == 6) {
                count++;
//                System.out.println(startDate.getTime());
            }
            startDate.add(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        }
        System.out.println();
        return count;
    }
}
