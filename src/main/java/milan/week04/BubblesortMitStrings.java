package milan.week04;

import java.text.Collator;
import java.util.Arrays;

public class BubblesortMitStrings {

    public static void main(String[] args) {


        String[] names = new String[]{"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};
        System.out.println("--------------------------------------");
        namesAscendingLength(names);
        System.out.println("Nach Länge sortiert: ");
        System.out.println(Arrays.toString(names));
        System.out.println("--------------------------------------");
        namesAscendingAlphabetical(names);
        System.out.println("Alphabetisch Aufsteigend sortiert: ");
        System.out.println(Arrays.toString(names));
        System.out.println("--------------------------------------");
        namesDescendingAlphabetical(names);
        System.out.println("Alphabetisch Absteigend sortiert: ");
        System.out.println(Arrays.toString(names));
        System.out.println("--------------------------------------");
        sortNames(names, true);
        System.out.println("--------------------------------------");


    }

    public static void sortNames(String[] names, boolean ascending) {
        if (ascending) {
            namesAscendingAlphabetical(names);
            System.out.println(Arrays.toString(names));
        } else {
            namesDescendingAlphabetical(names);
            System.out.println(Arrays.toString(names));
        }
    }

    public static String[] namesAscendingAlphabetical(String[] names) {

        for (int i = 0; i < names.length; i++) {
            for (int pos = 0; pos < names.length - 1; pos++) {
                if (names[pos].compareTo(names[pos + 1]) > 0) {
                    String hold = names[pos];
                    names[pos] = names[pos + 1];
                    names[pos + 1] = hold;
                }
            }
        }
        return names;
    }

    public static String[] namesDescendingAlphabetical(String[] names) {

        for (int i = 0; i < names.length; i++) {
            for (int pos = 0; pos < names.length - 1; pos++) {
                if (names[pos].compareTo(names[pos + 1]) < 0) {
                    String hold = names[pos];
                    names[pos] = names[pos + 1];
                    names[pos + 1] = hold;
                }
            }
        }
        return names;
    }

    public static String[] namesAscendingLength(String[] names) {
        for (int i = 0; i < names.length; i++) {
            for (int pos = 0; pos < names.length - 1; pos++) {
                if (names[pos].length() > names[pos + 1].length()) {
                    String hold = names[pos];
                    names[pos] = names[pos + 1];
                    names[pos + 1] = hold;
                }
            }
        }
        return names;
    }

}

