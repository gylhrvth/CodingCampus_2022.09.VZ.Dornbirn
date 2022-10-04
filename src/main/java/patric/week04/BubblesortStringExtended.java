package patric.week04;

import java.util.Arrays;

import static alp.week04.BubbleSortMitStringsExtended.sortBubbleAlphabeticallyDescending;

public class BubblesortStringExtended {


    public static void main(String[] args) {
        String[] names = new String[]{"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};
        System.out.println("Before: " + Arrays.toString(names));
        sortBubbleAlphabetically(names);
        System.out.println("After : " + Arrays.toString(names));
        sortBubbleDown(names);
        sortBubbleAlphabeticallyBool(names, false);             //wenn false ist sortiert er von z-a     //wenn true ist sortiert er von a-z
        System.out.println("Bool  : " + Arrays.toString(names));
    }


    public static void sortBubbleAlphabetically(String[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j].compareTo(values[j + 1]) > 0) {
                    String temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
    }
    public static void sortBubbleDown(String[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j].compareTo(values[j + 1]) > 0) {
                    String temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
    }
    public static void sortBubbleAlphabeticallyBool(String[] values, boolean Alphabetically) {
        if (Alphabetically) {
            sortBubbleAlphabetically(values);
        } else {
            sortBubbleAlphabeticallyDescending(values);
        }

    }




}
