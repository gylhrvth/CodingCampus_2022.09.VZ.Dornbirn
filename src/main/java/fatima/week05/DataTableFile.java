package fatima.week05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class DataTableFile {

    public static void main(String[] args) {
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        try {
            File file = new File("assets/tmp/output1.txt");
            file.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(file, false));

            ps.println();
            ps.printf("%-20s %-20s %-10s %-12s %10s\n", "FIRST NAME", "LAST NAME", "AGE", "PLACE", "DISTANCE FROM CAPITAL");
            ps.println("---------------------------------------------------------------------------------------");
            for (int i = 0; i < firstName.length; i++) {
                ps.printf("%-20s %-20s %3d        %-23s %10.1f\n", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
            }
            ps.close();
        } catch (IOException ioe) {
            System.out.println("");
            ioe.printStackTrace();
        }
    }
}