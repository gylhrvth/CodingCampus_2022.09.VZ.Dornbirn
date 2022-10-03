package alp.week03;

import java.util.Random;

public class ArrayMinMaxAvg {

    public static Random rand = new Random();


    public static void main(String[] args) {
        //Neue Aufgabe Random Number Array Min Max Avg
        //Random Nummern generieren
        System.out.print("Aufgabe Random Array Min Max Avg");                                           //Name von der Aufgabe
        System.out.println();
        System.out.println("Random Number Generator 1-100:");
        int[] values = ArrayUebungen.createRandomArray(10, 0, 100);                     //Importiert aus Ordner Arrayuebungen Funktion createRandomArray
        ArrayUebungen.printforeach(values);
        System.out.println();

        //Aufgabe Minimum
        System.out.println("Minimum is " + findMin(values));

        //Aufgabe Maximum
        System.out.println("Maximum is " + findMax(values));

        //Aufgabe Average - Durchschnitt
        System.out.println("Avarage is " + findAverage(values));

        //Aufgabe IndexMin
        System.out.println("IndexMin is " + indexOfMin(values));

        //Aufgabe IndexMax
        System.out.println("IndexMax is " + indexOfMax(values));

    }

    public static int findMin(int[] values) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    public static int findMax(int[] values) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    public static double findAverage(int[] values) {
        if (values.length == 0) return 0.0;
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        return sum / (double) values.length;
    }

    public static int indexOfMin(int[] values) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
                index = i;
            }
        }
        return index;

    }

    public static int indexOfMax(int[] values) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
                index = i;
            }
        }
        return index;
    }
}