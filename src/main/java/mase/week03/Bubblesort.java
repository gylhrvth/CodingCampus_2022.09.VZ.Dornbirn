package mase.week03;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {23, 24, 19, 30, 10, 11, 9, 14, 69};// unsotiert
        int[] arrbackwards = {15,99,98,14,11,50,95};
        int[] sortiert = algorithmus(arr);//sortiert
        int[] sortierabsteigend = absteigend(arrbackwards);

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arrbackwards));

        // druckt den algo aus

    }


    public static int[] algorithmus(int[] sort) {           // algo function
       int value = 0;
        for (int i = 1; i < sort.length; i++) {             // schleife fürs sortieren
            for (int j = 0; j < sort.length - i; j++) {     // schleife fürs Platz sortieren -1
                if (sort[j] > sort[j + 1]) {                // wenn sortierte schleife > als sortierte schleife +1
                    value = sort[j];                        // wenn true ergebniss sortietes j
                    sort[j] = sort[j + 1];                  // sonst sortiert + 1
                    sort[j + 1] = value;                    // soritertes = ergeniss

                }
            }
        }
        return sort;
    }

        public static int[] absteigend(int[] descending) {
        int value;
        for (int i = 1; i < descending.length; i++) {
            for (int j = 0; j < descending.length - i; j++) {
                if (descending[j] < descending[j + 1]) {
                    value = descending[j];
                    descending[j] = descending[j + 1];
                    descending[j + 1] = value;
                }
            }
        }
        return descending;

    }
}
