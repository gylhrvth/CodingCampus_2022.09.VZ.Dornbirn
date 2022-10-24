package milan.week06.Datenklasse;

import java.util.Arrays;

public class MagicArrayValues {

    private int[] myInternArray;

    public MagicArrayValues(int[] arr) {

        this.myInternArray = arr;
    }


    public String toString() {
        return "Folgendes Array:\n" + Arrays.toString(myInternArray) + "\nbeinhaltet:\nMinimum Wert: " + getMin() + "\nMaximum Wert: " + getMax() + "\nDurchschnitt: " + getAvg();
    }


    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int x : myInternArray) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    public int getMax() {
        int max = Integer.MIN_VALUE;
        for (int x : myInternArray) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public double getAvg() {
        int sum = 0;
        for (int x : myInternArray) {
            sum += x;
        }

        return (double) sum / myInternArray.length;
    }
}
