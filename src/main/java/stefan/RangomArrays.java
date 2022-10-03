package stefan;

import java.util.Arrays;
import java.util.Random;

public class RangomArrays {
    public static Random randomGeneratoer = new Random();


    public static void main(String[] args) {

        int[] value = randomZahlArray(10);
        int pos = minValuepos(value);
        bubblesort(value);
        foreachschleife(value);
        System.out.println();
        System.out.println(Arrays.toString(value));
        System.out.println();
        System.out.println("maxValue:" + maxValue(value));
        System.out.println("Index pos max:" + maxValuepos(value));
        System.out.println();
        System.out.println("minValue:" + minValue(value));
        System.out.println("Index pos.min:" + minValuepos(value));
        System.out.println();
        System.out.println("Summe:" + summValues(value));
        System.out.println("Durchschnitt:" + durchschnitt(value));
        System.out.println("Bubblesort:");
        bubblesort(value);
        System.out.println(Arrays.toString(value));

    }

    public static void foreachschleife(int[] value) {
        for (int arr : value) {


        }
        System.out.print(Arrays.toString(value));

    }

    public static int maxValue(int[] values) {
        if (values.length == 0) return Integer.MIN_VALUE;
        int max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];

            }


        }
        return max;
    }

    public static int maxValuepos(int[] values) {
        if (values.length == 0) return Integer.MIN_VALUE;
        int min = values[0];
        int pos = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > min) {
                min = values[i];
                pos = i;
            }
        }

        return pos;
    }


    public static int minValue(int[] values) {
        if (values.length == 0) return Integer.MIN_VALUE;
        int min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];

            }
        }

        return min;
    }

    public static int minValuepos(int[] values) {
        if (values.length == 0) return Integer.MIN_VALUE;
        int min = values[0];
        int pos = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
                pos = i;
            }
        }

        return pos;
    }

    public static int[] randomZahlArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomGeneratoer.nextInt(101);
        }
        return arr;


    }

    public static int summValues(int[] values) {
        int ergebnis = 0;
        for (int i = 0; i < values.length; i++) {
            ergebnis = ergebnis + values[i];

        }
        return ergebnis;
    }

    public static int durchschnitt(int[] values) {
        int durs = 0;
        for (int i = 0; i < values.length; i++) {
            durs = durs + values[i];
        }
        durs = durs / values.length;
        return durs;
    }

    public static void bubblesort(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length-1-i; j++) {
                int a = values[j + 1];
                int b = values[j];
                if (a < b) {
                    values[j] = a;
                    values[j+1]= b;

               }

            }

        }

    }
}