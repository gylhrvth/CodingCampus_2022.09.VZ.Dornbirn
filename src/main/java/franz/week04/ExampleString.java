package franz.week04;

import java.util.Arrays;

public class ExampleString {
    public static void main(String[] args) {
        String[] names = {"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Martin", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};
        System.out.println("Before: " + Arrays.toString(names));
        bubbleSortExtended(names,true);
        System.out.println("After A-Z : " + Arrays.toString(names));
        bubbleSortExtended(names, false);
        System.out.println("After Z-A : " + Arrays.toString(names));
    }

    public static void bubblesortAz(String[] names) {
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;

                }
            }
        }
    }

    public static void bubblesortZa(String[] names) {
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) < 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortExtended(String[] names, boolean ascending) {
        if (ascending) bubblesortAz(names);
        else bubblesortZa(names);
    }

}