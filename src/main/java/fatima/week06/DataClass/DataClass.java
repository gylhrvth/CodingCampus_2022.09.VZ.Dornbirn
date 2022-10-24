package fatima.week06.DataClass;

import java.util.Arrays;

public class DataClass {

    private int[] data;

    public DataClass(int[] array) {
        data = array;
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    public int getMax() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public double getAvg() {
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
            avg = sum / data.length;
        }
        return avg;
    }

    public String toString() {
        return Arrays.toString(data);
    }
}
