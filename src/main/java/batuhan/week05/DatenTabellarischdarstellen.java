package batuhan.week05;

import martin.MWerkzeuge;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class DatenTabellarischdarstellen {


    public static void main(String[] args) {


        File f = new File("assets/tmp/output.txt.");


        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};
        datastreamexamples(f, "Vorname", firstName, "Nachname", lastName, age, "Wohnort", place, distanceFromCapital);
        String simulatedWait = "Initialtext";
        while (simulatedWait.length() > 0) simulatedWait = MWerkzeuge.readUserInputString("");
        System.out.println();



    }



    public static void datastreamexamples(File directory, String titel1, String[] strarr1, String titel2, String[] strarr2, int[] age, String titel3, String[] strarr3, float[] distanceFromCapital) {
        try {
            directory.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(directory));
            int longestarr1 = titel1.length() + 1;
            int longestarr2 = titel2.length() + 1;
            int longestarr3 = titel3.length() + 1;
            for (int i = 0; i < strarr1.length; i++) {
                if (longestarr1 < strarr1[i].length()) longestarr1 = strarr1[i].length();
                if (longestarr2 < strarr2[i].length()) longestarr2 = strarr2[i].length();
                if (longestarr3 < strarr3[i].length()) longestarr3 = strarr3[i].length();

            }

            String formatText = String.format(" %%%ds | ", longestarr1) + String.format("%%%ds | ", longestarr2) + "%5s | " + String.format("%%%ds | ", longestarr3) + "%21s%n";
            ps.printf((formatText), titel1, titel2, "Alter", titel3, " Distanz zu Hauptstadt");
            for (int i = 0; i < strarr1.length; i++) {
                ps.printf((formatText), strarr1[i], strarr2[i], age[i], strarr3[i], String.format("%.1f km ", distanceFromCapital[i]));
                ps.flush();
            }
            ps.close();
        } catch (
                IOException ioe) {
        }
    }
}


