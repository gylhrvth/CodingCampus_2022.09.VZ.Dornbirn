package alp.week04;

import java.util.Arrays;

public class BubblesortmitStringsExtended {


    public static void main(String[] args) {
        String[] names  = new String[]{"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};
        System.out.println("Before: " + Arrays.toString(names));
        sortBubbleAlphabetically(names);
        System.out.println("After : " + Arrays.toString(names));
    }


    public static void sortBubbleAlphabetically(String[] values){
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j].compareTo(values[j + 1]) > 0){
                    String temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
    }
}