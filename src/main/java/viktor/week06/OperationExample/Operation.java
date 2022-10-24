package viktor.week06.OperationExample;

import java.util.Random;

public class Operation {


    private int min;
    private int max;
    private double avg;


    public Operation() {


    }

    public Operation(int min){
        this(min,0);


    }

    public Operation(int min, int max) {
        this(min, max, 0);

    }

    public Operation(int min, int max, double avg) {
        this.min = min;
        this.max = max;
        this.avg = avg;
    }


    public void setMin(int min) {
        this.min = min;

    }

    public int getMin() {
        return min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    public double getAvg() {
        return avg;
    }


    public String toString() {
        return "Min: " + min + "\n"+
                "Max: " + max + "\n" +
                "Avg: " + avg;

    }
}



