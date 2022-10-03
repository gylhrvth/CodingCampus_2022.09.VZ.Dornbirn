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
    }


    public static String[] namesAscendingAlphabetical(String[] names) {
        String hold = " ";
        for (int i = 0; i < names.length; i++) {
            for (int pos = 0; pos < names.length - 1; pos++) {
                if (names[pos].compareTo(names[pos + 1]) > 0) {
                    hold = names[pos];
                    names[pos] = names[pos + 1];
                    names[pos + 1] = hold;
                }
            }
        }
        return names;
    }

    public static String[] namesDescendingAlphabetical(String[] names) {
        String hold = " ";
        for (int i = 0; i < names.length; i++) {
            for (int pos = 0; pos < names.length - 1; pos++) {
                if (names[pos].compareTo(names[pos + 1]) < 0) {
                    hold = names[pos];
                    names[pos] = names[pos + 1];
                    names[pos + 1] = hold;
                }
            }
        }
        return names;
    }

    public static String[] namesAscendingLength(String[] names) {
        String hold = " ";
        for (int i = 0; i < names.length; i++) {
            for (int pos = 0; pos < names.length - 1; pos++) {
                if (names[pos].length() > names[pos + 1].length()) {
                    hold = names[pos];
                    names[pos] = names[pos + 1];
                    names[pos + 1] = hold;
                }
            }
        }
        return names;
    }

}

