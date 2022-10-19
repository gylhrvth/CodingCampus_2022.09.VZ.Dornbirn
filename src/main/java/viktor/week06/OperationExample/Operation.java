package viktor.week06.OperationExample;

import java.util.Random;

public class Operation {


    private int[] array;


    public Operation(int[] array) {
        this.array = array;

    }


    public int getMin() {
        int min = Integer.MAX_VALUE;

        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    public int getMax() {
        int max = Integer.MIN_VALUE;
        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }


    public double getAvg() {
        double sum = 0;
        double avg = 0;
        for (int k : array) {
            sum += k;
        }
        avg = sum / array.length;
        return avg;
    }


    public String toString() {
        return "Min: " + getMin() + " Max: " + getMax() + " Avg: " + getAvg() + "\n";

    }
}



