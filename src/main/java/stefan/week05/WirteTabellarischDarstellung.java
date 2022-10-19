package stefan.week05;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class WirteTabellarischDarstellung {


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


        try {


            File f = new File("assets/stefan/week05/helloWorld5.text");
            f.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f, true));
            ps.printf("Tabllarische Anzeige\n");
            ps.printf("%-" + count + "s | %-" + count3 + "s | %" + kopfzeile[2].length() + "s | %-" + count4 + "s | %" + kopfzeile[4].length() + "s\n", kopfzeile[0], kopfzeile[1], kopfzeile[2], kopfzeile[3], kopfzeile[4]);
            for (int i = 0; i < lastName.length; i++) {


             ps.printf("%-" + count + "s | %-" + count3 + "s | %" + kopfzeile[2].length() + "d | %-" + count4 + "s | %" + kopfzeile[4].length() + ".2f\n", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);

            }

            ps.close();
            System.out.println("Auf Wiedersehen!");
        } catch (IOException ioe) {
            System.out.println("Ich kann nicht schreiben");
            ioe.printStackTrace();
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

