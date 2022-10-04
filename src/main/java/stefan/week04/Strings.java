package stefan.week04;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {

        String[] namen = {"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};
        int []arr =  {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Aufsteigend");
        System.out.println(Arrays.toString(bubbleSort(namen))); //
        System.out.println();
        System.out.println("Absteigend");
        System.out.println(Arrays.toString(bubbleSortAufS(namen)));
        System.out.println();
        System.out.println("Nach Länge sotiert");
        System.out.println(Arrays.toString(bubbleSortLong(namen)));
        System.out.println();
        System.out.println("true oder false");
        bubbleSortboolen(namen, true);


    }

    public static String[] bubbleSort(String[] namen) {
        String sortieren;
        for (int i = 0; i < namen.length; i++) {
            for (int j = i + 1; j < namen.length; j++) {
                if (namen[j].compareTo(namen[i]) < 0) {
                    sortieren = namen[i];
                    namen[i] = namen[j];
                    namen[j] = sortieren;

                }

            }

        }

        return namen;
    }


    public static String[] bubbleSortAufS(String[] namen) {
        String sortieren;
        for (int i = 0; i < namen.length; i++) {
            for (int j = i + 1; j < namen.length; j++) {
                if (namen[j].compareTo(namen[i]) > 0) {
                    sortieren = namen[i];
                    namen[i] = namen[j];
                    namen[j] = sortieren;

                }

            }

        }
        return namen;

    }


    public static String[] bubbleSortLong(String[] namen) {

        for (int i = 0; i < namen.length; i++) {
            for (int j = 0; j < namen.length - 1; j++) {
                if (namen[j].length() > namen[j + 1].length()) {
                    String sotieren = namen[j];
                    namen[j] = namen[j + 1];
                    namen[j + 1] = sotieren;
                }

            }

        }
        return namen;
    }

    public static void bubbleSortboolen(String[] namen, boolean trueOrFalse) {
        if (trueOrFalse) {

            System.out.println(Arrays.toString(bubbleSortAufS(namen)));

        } else {
            System.out.println(Arrays.toString(bubbleSort(namen)));
        }


    }

    public static int[] exended (String[] namen, int arr) {
        for (int i = 0; i < namen.length; i++) {
            if (namen[i].charAt(arr)>0) {

            }
        }
    return new int[]{arr};
    }
}
