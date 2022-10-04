package alp.week04;

import alp.week03.ArrayUebungen;

import java.util.Arrays;

public class BubbleSortMitZahlen {
    public static void main(String[] args) {
        int[] values = ArrayUebungen.createRandomArray(20, 0, 1000);

        System.out.println("Original: " + Arrays.toString(values));
        sortBubble(values);                                                 //aufrufen raufzählen
        System.out.println("Result  : " + Arrays.toString(values));
        sortBubbleswitch(values);                                           //aufrufen runterzählen
        System.out.println("Resultswitch  : " + Arrays.toString(values));

    }


    public static void sortBubble(int[] values) {                           //raufzählen sortieren
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j] > values[j + 1]) {
                    //Swap
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
    }

    public static void sortBubbleswitch(int[] values) {                         //runterzählen sortieren
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j] < values[j + 1]) {
                    //Swap
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
    }
}