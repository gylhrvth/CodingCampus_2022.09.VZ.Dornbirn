package franz.week04;

import java.util.Arrays;

public class DarstellungTabelle {
    public static void main(String[] args) {
        String[] description = {"Vorname", "Nachname", "Alter", "Wohnort", "Entfernung in km"};
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Poelten", "Sankt Poelten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};
        print(firstName, lastName, age, place, distanceFromCapital);
        System.out.println("-----------------------------------------------------------------------------------");
        printNew(description, firstName, lastName, age, place, distanceFromCapital);
    }

    public static void print(String[] firstName, String[] lastName, int[] age, String[] place, float[] distanceFromCapital) {

        System.out.printf("%-20s", "Vorname");
        System.out.printf("%-10s %-17s %-15s %-15s %-15s\n", firstName[0], firstName[1], firstName[2], firstName[3], firstName[4]);
        System.out.printf("%-20s", "Nachname");
        System.out.printf("%-10s %-17s %-15s %-15s %-15s\n", lastName[0], lastName[1], lastName[2], lastName[3], lastName[4]);
        System.out.printf("%-20s", "Alter");
        System.out.printf("%-10d %-17d %-15d %-15d %-15d\n", age[0], age[1], age[2], age[3], age[4]);
        System.out.printf("%-20s", "Wohnort");
        System.out.printf("%-10s %-17s %-15s %-15s %-15s\n", place[0], place[1], place[2], place[3], place[4]);
        System.out.printf("%-20s", "Entfernung in km");
        System.out.printf("%-10.1f %-17.1f %-15.1f %-15.1f %-15.1f\n", distanceFromCapital[0], distanceFromCapital[1], distanceFromCapital[2], distanceFromCapital[3], distanceFromCapital[4]);

    }

    public static void printNew(String[] description, String[] firstName, String[] lastName, int[] age, String[] place, float[] distanceFromCapital) {

        System.out.printf("%-20s %-20s %-10s %-15s %-22s\n", description[0], description[1], description[2], description[3], description[4]);

        for (int i = 0; i < firstName.length; i++) {
            System.out.printf("%-20s %-20s %-10d %-15s %3.2f\n", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
        }


    }

}
