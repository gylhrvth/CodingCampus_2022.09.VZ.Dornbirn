package milan.week05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class WriteTabelle {
    public static void main(String[] args) {


        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};
        String[] kopfzeile = {"Vorname", "Nachname", "Alter", "Wohnort", "Entfernung von Wien (in km)"};

        int maxValue = findMaxLength(kopfzeile[0], firstName);
        int maxValue2 = findMaxLength(kopfzeile[1], lastName);
        int maxValue4 = findMaxLength(kopfzeile[2], age);
        int maxValue3 = findMaxLength(kopfzeile[3], place);
        int maxValue6 = findMaxLength(kopfzeile[4], distanceFromCapital);

        try {
            File f = new File("assets\\tmp\\output.txt");
            PrintStream ps = new PrintStream(new FileOutputStream(f, true));


            String kopfzeileAusgabe = String.format("%-" + maxValue + "s | %-" + maxValue2 + "s | %" + maxValue4 + "s | %-" + maxValue3 + "s | %" + maxValue6 + "s |\n", kopfzeile[0], kopfzeile[1], kopfzeile[2], kopfzeile[3], kopfzeile[4]);
            ps.print(kopfzeileAusgabe);
            for (int i = 0; i < maxValue + maxValue2 + maxValue3 + maxValue4 + maxValue6 + 14; i++) {
                ps.print("~");
            }
            ps.println();

            for (int i = 0; i < lastName.length; i++) {
                String tabelle = String.format("%-" + maxValue + "s | %-" + maxValue2 + "s | %" + maxValue4 + "d | %-" + maxValue3 + "s | %" + maxValue6 + ".2f |\n", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
                ps.print(tabelle);
            }
            ps.println();
            ps.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static int findMaxLength(String kopfzeile, String[] textData) {
        int maxValue = kopfzeile.length();
        for (int i = 0; i < textData.length; i++) {
            if (textData[i].length() > maxValue) {
                maxValue = textData[i].length();
            }
        }
        return maxValue;
    }


    public static int findMaxLength(String kopfzeile, int[] data) {
        int maxValue = kopfzeile.length();
        for (int i = 0; i < data.length; i++) {
            String text = String.format("%d", data[i]);
            if (text.length() > maxValue) {
                maxValue = text.length();
            }
        }
        return maxValue;
    }

    public static int findMaxLength(String kopfzeile, float[] data) {
        int maxValue = kopfzeile.length();
        for (int i = 0; i < data.length; i++) {
            String text = String.format("%f.2", data[i]);
            if (text.length() > maxValue) {
                maxValue = text.length();
            }
        }
        return maxValue;
    }
}
