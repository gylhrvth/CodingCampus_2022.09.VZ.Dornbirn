package franz.week05;

import java.io.*;

public class WhriteTabelle {
    public static void main(String[] args) {

        try {
            File f = new File("assets\\tmp\\output.txt");
            f.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f ));

            String[] description = {"Vorname", "Nachname", "Alter", "Wohnort", "Entfernung in km"};
            String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
            String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
            int[] age = {40, 78, 5, 18, 81};
            String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Poelten", "Sankt Poelten"};
            float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};


            printNew(description, firstName, lastName, age, place, distanceFromCapital, ps);
            ps.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }

}


    public static void printNew(String[] description, String[] firstName, String[] lastName, int[] age, String[] place, float[] distanceFromCapital, PrintStream ps) {

        ps.printf("%-20s %-20s %10s %-15s %17s\n", description[0], description[1], description[2], description[3], description[4]);

        for (int i = 0; i < firstName.length; i++) {
            ps.printf("%-20s %-20s %10d %-15s %17.2f\n", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
        }


    }
}
