package mase.week04;

import java.util.Arrays;

public class StringBubblesort {
    public static void main(String[] args) {
        String[] names = new String[]{"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};
        bubblesort(names);
        System.out.println(Arrays.toString(names));
        descending(names);
        System.out.println(Arrays.toString(names));
    }

    public static void bubblesort(String[] names) {
        String value;
        System.out.println("Sortiert mit Bubblesort:");
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareTo(names[i]) < 0) {
                    value = names[j];
                    names[j] = names[i];
                    names[i] = value;
                }
            }
        }
        System.out.println();

    }
    public static void descending(String[] names){
        String value;
        System.out.println("Absteigend sortiert: ");
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareTo(names[i]) > 0  ){
                    value = names[i];
                    names[i] = names[j];
                    names[j] = value;
                }
            }
        }
    }
}
