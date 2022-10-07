package mase.week04;

import java.util.Arrays;

public class DatenTabelle {
    public static void main(String[] args) {
        String[] firstName = {"Alfonso", "Beatrix-Elenor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simmma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "St.Pölten", "St.Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 2.457634366f, 120.0f, 119.9999f};
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("|%-15s| %-15s| %-5s| %-16s| %-16s|%n", "Vorname", "Nachname", "Alter", "Ort", "Distanz");
        System.out.println("-----------------------------------------------------------------------------");
        for (int i = 0; i < firstName.length; i++) {
            System.out.printf("|%-15s| %-15s| %-5s| %-16s| %-16f|%n",firstName[i], lastName[i],   age[i],  place[i], distanceFromCapital[i],"|");
        } System.out.println("-----------------------------------------------------------------------------");
    }
}

