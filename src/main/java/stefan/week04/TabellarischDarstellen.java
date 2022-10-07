package stefan.week04;

import java.util.Arrays;

public class TabellarischDarstellen {
    public static void main(String[] args) {

        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};
        String[] kopfzeile = {"Vorname", "Nachname", "Alter", "Wohnort", "Entfernug"};



        int count3 = countLetters(lastName);
        int count = countLetters(firstName);
        int count4 = countLetters(place);

        System.out.printf("%-" + count + "s | %-" + count3 + "s | %" + kopfzeile[2].length() + "s | %-" + count4 + "s | %" + kopfzeile[4].length() + "s\n", kopfzeile[0], kopfzeile[1], kopfzeile[2], kopfzeile[3], kopfzeile[4]);
        for (int i = 0; i < lastName.length; i++) {
            System.out.printf("%-" + count + "s | %-" + count3 + "s | %" + kopfzeile[2].length() + "d | %-" + count4 + "s | %" + kopfzeile[4].length() + ".2f\n", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
        }

    }


    public static int countLetters(String[] firstName) {

        int count = 0;
        for (int i = 0; i < firstName.length; i++) {
            if (firstName[i].length() > count) {
                count = firstName[i].length();
            }

        }
        return count;
    }

}







