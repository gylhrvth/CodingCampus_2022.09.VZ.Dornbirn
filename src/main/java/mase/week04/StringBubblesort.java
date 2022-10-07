package mase.week04;

import java.util.Arrays;

public class StringBubblesort {
    public static void main(String[] args) {
        String[] names = new String[]{"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};
        bubbleSort(names, true);
        System.out.println(Arrays.toString(names));

    }

    public static void bubbleSort(String[] values, boolean isAscending) {
        if (isAscending) {
            bubbleSortAsc(values);
        } else {
            bubbleSortDesc(values);
        }
    }

    public static void bubbleSortAsc(String[] names) {
        String value;

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareTo(names[i]) < 0) {
                    value = names[j];
                    names[j] = names[i];
                    names[i] = value;
                }
            }
        }


    }

    public static void bubbleSortDesc(String[] names) {
        String value;
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareTo(names[i]) > 0) {
                    value = names[i];
                    names[i] = names[j];
                    names[j] = value;
                }
            }
        }

    }


}
