package berna.week06.BasicStatsExample;


import java.util.Arrays;

public class BasicArrayStats {

    // define the attributes/properties
    public int[] arr;
    public int minValue;
    public int maxValue;
    public double avg;

    //the constructor aka the blueprint
    public BasicArrayStats(int[] inputArray) {
        this.arr = inputArray;  //use the array the user gives you!
        minValue = findMinValue(inputArray);
        maxValue = findMaxValue(inputArray);
        avg = calculateAverage(inputArray);
    }


    //methods aka functions of class

    public int findMinValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public int findMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public double calculateAverage(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum = sum + arr[i];
        }
        float nrValues = arr.length;
        return avg = sum / nrValues;

    }


    public String toString() {
        return "\n " + "This was your array:\n" + Arrays.toString(arr) + "\n" +
                "MinValue = " + minValue + "\n" +
                "MaxValue = " + maxValue + "\n" +
                "Average  = " + avg + "\n";
    }
}



