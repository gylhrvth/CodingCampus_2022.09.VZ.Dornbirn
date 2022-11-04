package michel.week05.IntroductionDatenklasseDatenobjekt;

import java.util.Arrays;
import java.util.Random;

public class Array {
    private int[] arr;
    private int max;
    private int min;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    private double avg;



    public Array(int[] arr) {
        this.arr = arr;
        max = getMax(arr);
        min = getMin(arr);
        avg = getAvg(arr);
    }


    public double getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        return avg;
    }

    public int getMin(int[] arr) {
        int index;
        int maxValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < maxValue) {
                maxValue=arr[i];
                index = i;
                min = arr[index];
            }
        }
        return min;
    }

    public int getMax(int[] arr) {
        int index;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
                index = i;
                max = arr[index];
            }
        }
        return max;
    }

    public String toString() {
        return "Für das Array: > "
                + Arrays.toString(arr)
                + " < \nwurden folgende Werte ermittlet: \nMinimum: > "
                + min + " < \nMaximum: > "
                + max + " < \nDurchschnitt: > "
                + avg + " <\n";
    }
}
