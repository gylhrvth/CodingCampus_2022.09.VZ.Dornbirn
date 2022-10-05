package stefan.week04;

import java.util.Arrays;

public class TabellarischDarstellen {
    public static void main(String[] args) {
        String[] firstName = new String[]{"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = new String[]{"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};
        for (int i = 0; i < lastName.length; i++) {

            System.out.printf(Arrays.toString(firstName)+"%n"+lastName[i]);
        }

    }

}






