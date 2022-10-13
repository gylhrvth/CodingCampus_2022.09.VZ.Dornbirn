package michel.week04;

import java.util.Arrays;

public class PrintDataTabular {
    public static void main(String[] args) {

        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};

        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};

        int[] age = {40, 78, 5, 18, 81};

        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};

        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};
        System.out.println("|-----------------------------------------------------------------------------|");
        System.out.printf("| %-15s | %-12s | %-5s | %-15s | %-16s | %n", "Vorname", "Nachname", "Alter", "Wohnort", "Entf. Hauptstadt");
        System.out.println("|-----------------------------------------------------------------------------|");

        for (int i = 0; i < firstName.length; i++) {
            System.out.printf("| %-15s | %-12s | %-5s | %-15s | %-16s | %n", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
        }
        System.out.println("|-----------------------------------------------------------------------------|");
    }
}
