package michel.week05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class DataTabularPrintStream {
    public static void main(String[] args) {
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        try {
            File f = new File("assets/tmp/output.txt");
            f.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f, false));

            ps.println("|-----------------------------------------------------------------------------|");
            ps.printf("| %-15s | %-12s | %-5s | %-15s | %-16s | %n", "Vorname", "Nachname", "Alter", "Wohnort", "Entf. Hauptstadt");
            ps.println("|-----------------------------------------------------------------------------|");

            for (int i = 0; i < firstName.length; i++) {
                ps.printf("| %-15s | %-12s | %-5s | %-15s | %-16s | %n", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
            }
            ps.println("|-----------------------------------------------------------------------------|");

            ps.close();

        } catch (IOException ioe) {
            System.out.println("Ich kann nicht schreiben");
            ioe.printStackTrace();
        }
    }
}
